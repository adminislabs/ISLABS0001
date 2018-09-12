import org.apache.spark._
import scala.util.matching.Regex
object EmergencyHelpineExample{
	def main(args:Array[String]):Unit={
	var ordinary:Regex="(,,)".r
	var sparkConf=new SparkConf()
	var sc=new SparkContext(sparkConf)

    //Path for the file
	var firstemergencyHelpineRdd=sc.textFile("File:///home/pratibha/Downloads/EmergencyHelpline/911.csv")
	var finalemergencyHelpineRdd=firstemergencyHelpineRdd.filter(x=> !x.contains("lat"))

	//to remove double commas in the data
	var newfinalemergencyHelpineRdd=finalemergencyHelpineRdd.filter(x => ordinary.findFirstMatchIn(x)==None)
	var parseemergencyHelpineRdd=newfinalemergencyHelpineRdd.map(parse)
    var groupRdd=parseemergencyHelpineRdd.map(x=>(x.zip,x.title))

    //Path for the file
	var zipcodeRdd=sc.textFile("File:///home/pratibha/Downloads/EmergencyHelpline/zipcode.csv")
	var finalzipcodeRdd=zipcodeRdd.filter(x=> !x.contains("zip"))
    var zipcodeRdd=finalzipcodeRdd.map(x=>x.replace('"',' ').trim()) //to replace ("")
    var finallyzipcodeRdd=zipcodeRdd.map(x=>x.replace( " ","").trim()) //to remove string and then space
    var parsezipcodeRdd=finallyzipcodeRdd.map(parse2)
    var filtercityzipcodeRdd=parsezipcodeRdd.map(x=>(x.zip,x.city))
    var filterstatezipcodeRdd=parsezipcodeRdd.map(x=>(x.zip,x.state))

    //Joining two RDD
    var finalfirstRdd=groupRdd.join(filterstatezipcodeRdd).map{case (a,(b,c)) => (f"desc=$b%s",f"state=$c%s")}
    var finalsecondRdd=groupRdd.join(filtercityzipcodeRdd).map{case (a,(b,c))=> (f"desc=$b%s",f"city=$c%s")}
    var resultRdd=finalfirstRdd.map(x => (x._1,x._2)).countByValue()
    println("Problems prevalent in each state"+resultRdd.foreach(println))
    var resultfinalRdd=finalsecondRdd.map(x=>(x._1,x._2)).countByValue()
    println("Problems prevalent in each city"+resultfinalRdd.foreach(println))
}
//Case class
case class EmergencyHelpline(lat:Double,lng:Double,desc:String,zip:Int,title:String,timestamp:String,twp:String,addr:String,e:Int)
//ParseFunction
def parse(row:String):EmergencyHelpline={
	val field=row.split(",")
	val lat:Double=field(0).toDouble
	val lng:Double=field(1).toDouble
    val desc:String=field(2)
    val zip:Int=field(3).toInt
    val title:String=field(4).substring(0,field(4).indexOf(":"))
    val timestamp:String=field(5)
    val twp:String=field(6)
    val addr:String=field(7)
    val e:Int=field(8).toInt
    EmergencyHelpline(lat,lng,desc,zip,title,timestamp,twp,addr,e)
    }

//Case class
case class ZipCode(zip:Int,city:String,state:String,latitude:String,longitude:Double,timezone:Double,distance:Double)extends Serializable{}
//Parse Function
    def parse2(row:String):ZipCode={
    val field=row.split(",")
    val zip:Int=field(0).toInt
    val city:String=field(1)
    val state:String=field(2)
    val latitude:String=field(3)
    val longitude:Double=field(4).toDouble
    val timezone:Double=field(5).toDouble
    val distance:Double=field(6).toDouble
    ZipCode(zip,city,state,latitude,longitude,timezone,distance)
    }
}