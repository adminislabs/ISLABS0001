
import org.joda.time.format.DateTimeFormat

import org.joda.time.LocalTime

import org.joda.time.LocalDate

import scala.util.matching.Regex

import org.apache.spark._

case class flight(date: String, airline: String, flightNumber: String, origin: String,dest: String, dep: String, dep_delay: Double, arv: String,arv_delay: Double, airtime: Double, distance: Double) extends Serializable {}

object Main extends App{

  override def main(arg:Array[String]) : Unit = {
    
    var sparkConf = new SparkConf().setMaster("local").setAppName("flight")
 var sc = new SparkContext(sparkConf)

  var flight = sc.textFile("file:///home/rishab/Desktop/flights.csv")

  var filterFlight = flight.filter(x => !x.contains("YEAR"))

  var newrdd=filterFlight.filter{ x=>

        val removespace:Regex=("[A-Za-z0-9],{2,}[A-Za-z0-9]").r

        removespace.findFirstMatchIn(x)== None

        }

   var data1 = sc.parallelize (newrdd.take(400000))     

  var data = data1.map(parse)

   //var data=newrdd.map(parse)

  var total_flights=data.count()

  var totalFightDistance=data.map(_.distance).reduce((x,y)=> x+y)

  var Total_dep_del_flights=data.filter(_.dep_delay>0).count

  var total_arv_del_flights=data.filter(_.arv_delay>0).count

 var percent_dely_flights=(Total_dep_del_flights *100)/total_flights

 var percent_arv_flights=(total_arv_del_flights *100)/total_flights

 var total_dep_dely_distance=data.filter(_.dep_delay>0).map(_.dep_delay).reduce(_+_)

 var average_dep_dely=total_dep_dely_distance / Total_dep_del_flights

 var total_arv_dely_distance=data.filter(_.arv_delay>0).map(_.arv_delay).reduce(_+_)

 var average_arv_dely=total_arv_dely_distance / total_arv_del_flights

 var pairrdd= data.map(x=> ((x.airline),x))

var flightRdd = data.map(flight => (flight.airline, flight))

var groupRdd = data.map(w =>(w.airline,w)).groupByKey()

 var noofdelayedflightofairlines = groupRdd.map{ case (key,value) => (key,value.filter(_.dep_delay>0))}.collect

 var countofdelayedflightofairlines = noofdelayedflightofairlines.map{ case (key,value) => (key,value.size)} toList

 var noofflightofairlines = groupRdd.map{ case (key,value) => (
if (key.contains("B6")){key.replace("B6","JetBlue Airways")} 
else if (key.contains("UA")){key.replace("UA","United airlines Inc")} 
else if (key.contains("AA")){key.replace("AA","American airlines Inc")} 
else if (key.contains("US")){key.replace("US","US Airways Inc")} 
else if (key.contains("F9")){key.replace("F9","Frontier Airlines Inc")} 
else if (key.contains("OO")){key.replace("OO","Skywest Airlines Inc")} 
else if (key.contains("AS")){key.replace("AS","Alaska Airlines Inc")} 
else if (key.contains("NK")){key.replace("NK","Spirit Airlines Inc")} 
else if (key.contains("WN")){key.replace("WN","Southwest Airlines Co.")} 
else if (key.contains("DL")){key.replace("DL","Delta Air Lines Inc")} 
else if (key.contains("EV")){key.replace("EV","Atlantic Southeast Airlines")} 
else if (key.contains("HA")){key.replace("HA","Hawaiian Airlines inc")} 
else if (key.contains("MQ")){key.replace("MQ","American Eagle Airlines Inc")} 
else if (key.contains("")) {key.replace("VX","virgin America")}
,value.size)}.collect.toList


 var AirlineDatawithDelays =countofdelayedflightofairlines.zip(noofflightofairlines).map {case ((a,b),(e,d)) => (a,b,d)} toList

 val res = AirlineDatawithDelays.map {case ((a,b,c)) => (a,b,c,b*100.0/c)}

var delay_dep_flights=groupRdd.map{ case (key,value) => (key,value.filter(_.dep_delay>0))}.collect

var sum_delay_dep_flights=delay_dep_flights.map{ case (key,value) => (key,value.map(_.dep_delay).sum)}.toList




val airline_avg_flights=countofdelayedflightofairlines.zip(sum_delay_dep_flights).map{case((a,b),(c,d))=>(a,b,d)}.toList

val avg_delay_dep=airline_avg_flights.map{case((a,b,c))=>(a,c/b)}.toList


val finaldata=noofflightofairlines.zip(AirlineDatawithDelays).zip(res).zip(avg_delay_dep).toList

val fdata=finaldata.map{case ((((a,b),(c,d,e)),(f,g,h,i)),(j,k))=> (f"Airline_Company-$a%28s",f"  Total_Flights-$b%5s",f"  Delayed_Flights-$d%5s",f" Percentage_Delayed--$i%.2f"+"%",f"Average_Delayed--$k%.1f")}



println("flight_Distance  =" +totalFightDistance)
println("number of dep.del_Flights="+Total_dep_del_flights)
println("number of arv.delayed   ="+total_arv_del_flights)
println(f"percentage_Dep_Delayed  =$percent_dely_flights%.1f"+"%")
println(f"percentage_Arv_Delayed  =$percent_arv_flights%.1f"+"%")
println(f"average_Dep_Delayed     =$average_dep_dely%.2f")
println(f"average_Arv_dely        =$average_arv_dely%.2f")
println()
fdata.foreach(println)



 sc.stop()

}

  def parse(row: String): flight = {

  val fields = row.split(",")

  val datePattern = DateTimeFormat.forPattern("YYYY-mm-dd")

  val timepattern = DateTimeFormat.forPattern("HHmm")

  val date: String = fields(0)+"-"+fields(1)+"-"+fields(2)

  val airline: String = fields(4)

  val flightNumber: String = fields(5)

  val origin: String = fields(7)

  val dest: String = fields(8)

  if(fields(10)=="2400") fields(10) ="0000"

  val dep: String = fields(10)

  val dep_delay: Double = fields(11).toDouble

  if(fields(21)=="2400") fields(21) ="0000"

  val arv: String = fields(21)

  val arv_delay: Double = fields(22).toDouble

  val airtime: Double = fields(16).toDouble

  val distance: Double = fields(17).toDouble

  flight(date, airline, flightNumber, origin, dest, dep, dep_delay, arv, arv_delay, airtime, distance)

}
}

