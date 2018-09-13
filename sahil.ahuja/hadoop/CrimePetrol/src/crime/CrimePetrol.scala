package crime
import org.apache.spark._
import scala.util.matching.Regex
object CrimePetrol {
  def main(args: Array[String]) = {

    var sparkConf = new SparkConf()
    var sc = new SparkContext(sparkConf)
    var crimerdd = sc.textFile("file:///home/sahil/projects/CrimeData/Crime_dataset.csv")
    var parserdd = crimerdd.map(parse)
    var crimeperfbi = parserdd.map(x => (x.fbicode, x.crime_type)).countByValue()
    var showcrimeperfbi = crimeperfbi.map { case ((a, b), c) => (f"FBI=$a%4s " + f" Crime_Type=$b%32s " + f"Crime_Count=$c") }

    var crimeperyear = parserdd.map(x => (x.date.split(" ")(0).split("/")(2), x.crime_type)).countByValue()
    var showcrimeperyear = crimeperyear.map { case ((a, b), c) => (f"Year=$a " + f"Crime=$b%32s " + f"Crime_Count=$c") }
    var theftperdistrict = parserdd.map(x => (x.district, x)).groupByKey().collect().map { case (b, c) => (b, c.filter(_.crime_type == "THEFT")) }
    var counttheftperdistrict = theftperdistrict.map { case (a, b) => (a, b.size) }
    var theftarrestperdistrict = parserdd.map(x => (x.district, x)).groupByKey().collect().map { case (b, c) => (b, c.filter(x => ((x.crime_type == "THEFT") && (x.arrest == true)))) }
    var counttheftarrestperdistrict = theftarrestperdistrict.map { case (a, b) => (a, b.size) }
    var finalrdd = counttheftperdistrict.zip(counttheftarrestperdistrict).map { case ((a, b), (c, d)) => (f"District=$a%4s " + f"TotalThefts=$b%4s  " + f"TotalArrestsForThefts=$d ") }

  }
  case class description(id: Int, case_number: String, date: String, block_addr: String, iucr: String, crime_type: String, crime_description: String, location_des: String, arrest: Boolean, domestic: Boolean, beat: Int, district: Int, ward: Int, community: Int, fbicode: String, year: Int, updateddate: String)
  def parse(row: String): description = {
    var fields = row.split(",")
    var id: Int = fields(0).toInt
    var case_number = fields(1)
    var date = fields(2)
    var block_addr = fields(3)
    var iucr: String = fields(4)
    var crime_type = fields(5)
    var crime_description = fields(6)
    var location_des = fields(7)
    var arrest: Boolean = fields(8).toBoolean
    var domestic: Boolean = fields(9).toBoolean
    var beat: Int = fields(10).toInt
    var district: Int = fields(11).toInt
    var ward: Int = fields(12).toInt
    var community: Int = fields(13).toInt
    var fbicode: String = fields(14)
    var year: Int = fields(17).toInt
    var updateddate = fields(18)
    description(id, case_number, date, block_addr, iucr, crime_type, crime_description, location_des, arrest, domestic, beat, district, ward, community, fbicode, year, updateddate)

  }

}

