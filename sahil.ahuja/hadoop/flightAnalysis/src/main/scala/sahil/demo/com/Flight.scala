

package sahil.demo.com

import org.joda.time.format.DateTimeFormat
import org.joda.time.LocalTime
import org.joda.time.LocalDate
import org.apache.spark._
import scala.util.matching.Regex

object Flight {
  def main(arg: Array[String]): Unit = {

    var sparkConf = new SparkConf()
    var sc = new SparkContext(sparkConf)
    var firstRdd = sc.textFile("file:///home/sahil/flight-delays/flights.csv")
    var filterRdd = firstRdd.filter(x => !x.contains("YEAR"))
    var patter: Regex = "[0-9A-Za-z],{2,}[0-9A-Za-z]".r
    var filt = filterRdd.filter(x => patter.findFirstMatchIn(x) == None)
    var flightData = filt.map(parse)
    var flightdata1 = sc.parallelize(flightData.take(1000))
    var totalFlights = flightdata1.count()
    var lateArrivalFlights = flightdata1.filter(_.ar_delay > 0)
    var numlateArrivalFlights = lateArrivalFlights.count().toDouble
    var percentageOfLateArrivalFlights = (numlateArrivalFlights / totalFlights) * 100
    var lateDepartureFlights = flightdata1.filter(_.dep_dely > 0)
    var numlateDepartureFlights = flightdata1.filter(_.dep_dely > 0).count().toDouble
    var percentageOfLateDelayed = (numlateDepartureFlights / totalFlights) * 100
    var averageArrivalDelay = (lateArrivalFlights.map(_.ar_delay).reduce((x, y) => x + y)) / numlateArrivalFlights
    var averageDepDelay = (lateDepartureFlights.map(_.dep_dely).reduce((x, y) => x + y)) / numlateDepartureFlights
    var pairrdd = flightdata1.map(x => (x.airline, x))
    var pairrdd1 = flightdata1.map(x => (x.airline, x)).groupByKey().collect()
    var delayedFlights = pairrdd1.map { case (airline, v) => (airline, v.filter(_.ar_delay > 0)) }
    var noOfDelayedFlights = delayedFlights.map { case (airline, ardelay) => (airline, ardelay.size) }
    var totalperflight = pairrdd1.map { case (airline, totperairline) => (airline, totperairline.size) }
    var percentagedelay = noOfDelayedFlights.zip(totalperflight).map { case ((airline, ardelay), (airline1, totperairline)) => (airline, ardelay, totperairline, (ardelay * 100.0) / totperairline) }

    var totalarpdelay = delayedFlights.map { case (airline, v) => (airline, v.map(_.ar_delay).sum) }
    var averageperflight = totalarpdelay.zip(noOfDelayedFlights).map { case ((airline, arsum), (c, totflightsperairline)) => (airline, arsum / totflightsperairline) }
    var finalrdd = percentagedelay.zip(averageperflight).map { case ((airline, ardelay, totperairline, percentdelay), (e, avgdelay)) => (airline, ardelay, totperairline, percentdelay, avgdelay) }
    var fifth = finalrdd.map { case (a, b, c, d, e) => (f"Airline=$a%28s", f"Total Flights=$c%7s", f"Delayed Flights=$b%7s", f"Delay Percentage=$d%.2f" + "%", f"Average Delay=$e%.2f") }

    var flightnamerdd = sc.textFile("file:///home/sahil/flight-delays/airlines.csv")
    var flightnamerddfilter = flightnamerdd.filter(x => !x.contains("IATA_CODE"))
    var flightnamerddparse = flightnamerdd.map(parse1)
    var fli = flightnamerddparse.map(x => (x.shortName, x.fullName))

    /*

var fifthRdd = fourthRdd.zip(dd1).map{case ((a,b,c,d),(e,f)) => (f"Airline=$a%28s",f"Total Flights=$b%7s",f"Delayed Flights=$c%7s",f"Delay Percentage=$d%.2f"+"%",f"Average Delay=$f%.2f")}*/
  }
  case class Flight(date: LocalDate, airline: String, flightNumber: String, origin: String, dest: String, var dep: LocalTime, dep_dely: Double, var arv: LocalTime, ar_delay: Double, airtime: Double, distance: Double) extends Serializable {}
  def parse(row: String): Flight = {
    var fields = row.split(",")
    var datePattern = DateTimeFormat.forPattern("YYYY-mm-dd")
    var timepattern = DateTimeFormat.forPattern("HHmm")
    var date: LocalDate = datePattern.parseDateTime(fields(0) + "-" + fields(1) + "-" + fields(2)).toLocalDate()
    var airline: String = fields(4)
    var flightNumber: String = fields(5)
    var origin: String = fields(7)
    var dest: String = fields(8)
    if (fields(10) == "2400") fields(10) = "2359"
    var dep: LocalTime = timepattern.parseLocalTime(fields(10))
    var dep_dely: Double = fields(11).toDouble
    if (fields(21) == "2400") fields(21) = "2359"
    var arv: LocalTime = timepattern.parseLocalTime(fields(21))
    var ar_delay: Double = fields(22).toDouble
    var airtime: Double = fields(16).toDouble
    var distance: Double = fields(17).toDouble

    Flight(date, airline, flightNumber, origin, dest, dep, dep_dely, arv, ar_delay, airtime, distance)
  }

  case class FlightName(fullName: String, shortName: String)
  def parse1(row: String): FlightName = {
    var fields = row.split(",")
    var fullName = fields(1)
    var shortName = fields(0)
    FlightName(fullName, shortName)
  }
}
