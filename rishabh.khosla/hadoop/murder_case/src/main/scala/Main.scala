
import scala.util.matching.Regex
import org.apache.spark._

object Main extends App{

  override def main(arg:Array[String]) : Unit = {
    
 var sparkConf = new SparkConf().setMaster("local").setAppName("crimeApp")
 var sc = new SparkContext(sparkConf)
//rdd below is taken input from csv.file crime_dataset
var rdd=sc.textFile("file:///home/rishab/Downloads/projects/CrimeData/Crime_dataset")
var data = rdd.map(parse)

//no of crimes under each fbi code
var pair_fbicode=data.map(x=> ((x.fbi_Code),x.case_No)).groupByKey().collect
println("No of cases under each fbi code")
var no_cases=pair_fbicode.map{ case (key,value)=> (f"fbiCode=$key%5s","crimeCount="+value.size)}.foreach(println)

//no of cases under nacrotics 
var nar_cases=data.filter(x=> (x.primary_Type==("NARCOTICS"))).count()

//no of theft arrests happened in each district
var req=data.filter(x=> (x.primary_Type==("THEFT")&& x.arrest==("true")))
var req_pair=req.map(x=> ((x.district),x.primary_Type)).groupByKey()
var req_size=req_pair.map{case(key,value)=>(key,value.size)}

//on which location crime rate is higher
var crime_pair=data.map(x=> ((x.ll_location,x.primary_Type))).groupByKey()


//location under fbi code have max no of crimes
var fbi_pair=data.map(x=> ((x.district),x.fbi_Code)).groupByKey()
var size1=fbi_pair.map{case (key,value)=> ("district "+key,value.size)}

}
//case class and parse function of the program file
case class crime(case_id:Int,case_No:String,crime_Date:String,crime_block:String,id_Iucr:String,primary_Type:String,descriptio:String,loc_Description:String,arrest:String,domestic:String,beat:Int,district:Int,ward:Int,community:Int,fbi_Code:String,x_ordinates:Int,y_ordinates:Int,year:Int,updated_on:String,lattitude:String,longitutude:String,ll_location:String) extends Serializable{}
def parse(row:String):crime={
 val field= row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1)
 val case_id:Int=field(0).toInt
 val case_No =field(1)
 val crime_Date:String=field(2)
 val crime_block:String=field(3)
 val id_Iucr=field(4)
 val primary_Type:String=field(5)
 val descriptio:String=field(6)
 val loc_Description:String=field(7)
 val arrest=field(8)
 val domestic:String=field(9)
 val beat:Int=field(10).toInt
 val district:Int=field(11).toInt
 val ward:Int=field(12).toInt
 val community:Int=field(13).toInt
 val fbi_Code:String=field(14)
 if (field(15)=="") field(15)="0000000"
 val x_ordinates:Int=field(15).toInt
 if (field(16)=="") field(16)="0000000"
 val y_ordinates:Int=field(16).toInt
 val year:Int=field(17).toInt
 val updated_on:String=field(18)
 if (field(19)=="") field(19)="00.000000000"
 val lattitude:String=field(19)
 if (field(20)=="") field(20)="00.000000000"
 val longitutude:String=field(20)
 val ll_location:String=field(21)

crime(case_id,case_No,crime_Date,crime_block,id_Iucr,primary_Type,descriptio,loc_Description,arrest,domestic,beat,district,ward,community,fbi_Code,x_ordinates,y_ordinates,year,updated_on,lattitude,longitutude,ll_location)
}


}


