import org.apache.spark._
object CrimeDataExample{
	def main(args:Array[String]):Unit={
	var sparkConf=new SparkConf()
	var sc=new SparkContext(sparkConf)

    //Path for the file
	var firstcrimeData=sc.textFile("File:///home/pratibha/Downloads/CrimeData/Crime_dataset.txt")
	var parseRdd=firstcrimeData.map(parse)

    //Cases under narcotics
    var narcoticsRdd=parseRdd.filter(x=>x.crimetype == "NARCOTICS")
    var secondfilterRdd=narcoticsRdd.map(x=>(x.crimetype,x.year)).countByKey()
    println("No of cases under Narcotics :" +secondfilterRdd)

    
    //No of theft arrest happened in district
    var theftRdd=parseRdd.filter(x=>x.crimetype == "THEFT" && x.arrest == "true")
    theftRdd.take(10)
    var Rdd=theftRdd.map(x => x.district).countByValue
    var resultRdd=Rdd.map{case (a,b)=>(f"district =$a%s",f"arrest=$b%s")}.foreach(println)
   
    //No of crime under each Fbicode
    var filterRdd=parseRdd.map(x=>(x.Fbicode,x)).groupByKey()
    var crime_underRdd = filterRdd.map{case (k,v) => (k,v.size)}
    var finalcrime_underRdd=crime_underRdd.map{case (a,b)=>(f"Fbicode=$a%s",f"Crime_no=$b%s")}.foreach(println)
	}
    //Case class
	case class CrimeData(id:Int,casenumber:String,crimetype:String, description:String,arrest:String,district:Int,ward:Int,community:Int,Fbicode:String,year:Double,location:String)extends Serializable{}
	//Parse Function
    def parse(row:String):CrimeData={
	val field=row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)")
	val id:Int=field(0).toInt
	val casenumber:String=field(1)
	val crimetype:String=field(5)
	val description:String=field(6)
    val arrest:String=field(8)
    val district:Int=field(11).toInt
    val ward:Int=field(12).toInt
    val community:Int=field(13).toInt
    val Fbicode:String=field(14)
   // val x-coordinate:Double=field(15).toDouble
    //val y-coordinate:Double=field(16).toDouble
   val year:Double=field(17).toDouble
    //val latitude:Double=field(18).toDouble
    //val longitude:Double=field(19).toDouble
    val location:String=field(20)
    CrimeData(id,casenumber,crimetype,description,arrest,district,ward,community,Fbicode,year,location)
    }