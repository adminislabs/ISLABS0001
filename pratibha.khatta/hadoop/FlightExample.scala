import org.joda.time.format.DateTimeFormat
import org.joda.time.LocalTime
import org.joda.time.LocalDate
import org.apache.spark._
import scala.util.matching.Regex
object Main{
	def main(args:Array[String]):Unit={
	var sparkConf=new SparkConf()
	var sc=new SparkContext(sparkConf)

	//Path for the file
	var firstRdd=sc.textFile("File:///home/pratibha/flight-delays/flight.csv")
	var filterRdd=firstRdd.filter(x=> !x.contains("YEAR"))
	var flightData=filterRdd.map(parse)
	var newRdd=filterRdd.filter{x=>
	var ordinary:Regex="[0-9A-Za-z],{2,}[0-9A-Za-z]".r
	ordinary.findFirstMatchIn(x)==None
	}
	var secondRdd=newRdd.map(parse)
	secondRdd.count

	var parseRdd=newRdd.map(parse)
	println("Total flights" +parseRdd.count)

	var departuredelay=parseRdd.filter(x=>x.dep_dely>0)
	println("Total no of departure dleayed flights=" +departuredelay)

	var arrivaldelay=parseRdd.filter(x=>x.ar_delay>0)
	var percentagedeparturedelay=(departuredelay.count*100.0)/parseRdd.count
	var average_delay=departuredelay.map(x=>x.dep_dely)
	var reduceData=average_delay.reduce(_+_)
	var averagedeparturedelay=reduceData/departuredelay.count
	var secondRdd=newRdd.map(parse)
	var flyData=sc.parallelize(secondRdd.take(10000))
	var pairRdd=flyData.map(flight=>(flight.airline,flight))
	var groupRdd=flyData.map(flight=>(flight.airline,flight)).groupByKey(
	var noofdelayedflightofairline=groupRdd.map{case(key,value)=>(key,value.filter(_.dep_dely>0))}
	var countndelayedflights=noofdelayedflightofairline.map{case(key,value)=>(key,value.size))}.toList
	var noofflightofairline=groupRdd.map{case(key,value)=>(key,value.size)}.toList
	var airlinedatawithdelay=countdelayedflights.zip(noofflightofairline).map{case ((a,b),(c,d))=>(a,b,d)}
	var percentagedelayedflightofeachairline=airlinedatawithdelay.map{case ((a,b,c))=>(a,b,c,b*100/c)}
	var sumRdd=noofdelayedflightofeachairline.map{case(key,value)=>(key,value(_.dep_dely)).sum}.toList
	var dataofeachairlinewithdelayedflights=countdelayedflights.zip(noofflightofairline).map{case((a,b),(c,d))=>(a,b,d)}
	var averagedelayedflight=countdelayedflights.zip(sumRdd).map{case((a,b),(c,d))=>(a,b,d)}
    var airlinedatawithdelays=countnoofdelayflightofairline.zip(noofflightofairline).map{case((a,b),(e,d))=>(a,b,d)}
	var finalaverageofeachairline=averagedelayedflightofeachairline.map{case(a,b,c)=>(a,c/b)}
	var finalData=percentageofdelayedflightofeachairline.zip(averageairline).map{case((a,b,c,d),(e,f))=>(a,b,c,d,f)}
	var flightResult=finalData.map{case (key,value)=>
	if(key.conatins("B6")) {key.replace("B6","JetblueAirways")}
	else if(key.contains("OO")){key.replace("OO","Skywest Airlines Inc.")}
	else if(key.contains("UA")) {key.replace("UA","United Airlines Inc.")}
	else if(key.contains("DL")) {key.replace("DL","Delta Air Lines Inc")}
	else if(key.contains("AA")) {key.replace("AA","American Airlines Inc")}
	else if (key.contains("MQ")) {key.replace("MQ","American Eagle Ailrines Inc")}
	else if (key.contains("NK")) {key.replace("NK",Spirit AirLines)}
	else if(key.contains("HA")) {key.replace("HA" ,Hawaiian Airlines Inc")}
	else if(key.contains("EV")) {key.replace("EV","Atlantic southeast Airlines")}
	else if (key.contains("AS")) {key.replace("AS","Alaska AirlinesInc")}
	else if (key.contains("VX")) {key .replace("VX","Virgin America")}
	else if (key.contain ("US")) {key .replace("US","US Airways Inc")}
	else if (key.contains("F9")) {key.replace("F9","Frontier AirlinesInc")}
	else if(key.contains("WN")) {key.replace("WN","SouthwetAirlinesInc")},value.size)}.collect.toList
	}
	}
}
//Case class
case class Flight(date:LocalDate,airline:String,flightNumber:String,origin:String,dest:String,dep:LocalTime,dep_dely:Double,arv:LocalTime,ar_delay:Double,airtime:Double,distance:Double)extends Serializable{}
//Parse Function
def parse(row:String):Flight={
	val fields=row.split(",")
	val datePattern=DateTimeFormat.forPattern("YYYY-mm-dd")
	val timePattern=DateTimeFormat.forPattern("HHmm")
	val date:LocalDate=datePattern.parseDateTime(fields(0)+"-"+fields(1)+"-"+fields(2)).toLocalDate()
	val airline:String=fields(4)
	val flightNumber:String=fields(5)
	val origin:String=fields(7)
	val dest:String=fields(8)
	if(fields(10)="2400") fields(10)="0000"
	val dep:LocalTime=timepattern.parseLocalTime(fields(10))
	val dep_dely:Double=fields(11).toDouble
	if(fields(21)="2400") fields="0000"
	var arv:Localtime=timepattern.parseLocalTime(fields(21))
	var ar_delay:Double=fields(22).toDouble
    val airtime: Double = fields(16).toDouble
    val distance: Double = fields(17).toDouble 
    Flight(date, airline, flightNumber, origin, dest, dep, dep_dely, arv, ar_delay, airtime, distance)

}

}