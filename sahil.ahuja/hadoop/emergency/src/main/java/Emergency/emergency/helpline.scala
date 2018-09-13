package Emergency.emergency
import org.apache.spark._
import scala.util.matching.Regex
object helpline {
  def main(args: Array[String]): Unit = {
    val cat: Regex = "[0-9A-Za-z.,&:\\s;@],{2,}[0-9A-Za-z.,&:\\s;@]".r
    var sparkConf = new SparkConf()
    var sc = new SparkContext(sparkConf)
    var rdd911 = sc.textFile("file:///home/sahil/projects/EmergencyHelpline/911.csv")
    var ziprdd = sc.textFile("file:///home/sahil/projects/EmergencyHelpline/zipcode.csv")
    var filterrdd911 = rdd911.filter(x => !x.contains("zip"))
    var f = filterrdd911.filter(x => cat.findFirstMatchIn(x) == None)
    var rdd911parse = f.map(parse1)
    var filterziprdd = ziprdd.filter(x => !x.contains("zip"))
    var d = filterziprdd.map(x => x.replace('"', ' ').trim())
    var e = d.map(x => x.replaceAll(" ", ""))
    var ziprddparse = e.map(parse2)

    var test = rdd911parse.map(x => (x.zip, x.title)).groupByKey().count //=102
    var test2 = ziprddparse.map(x => (x.zip, x.state)).groupByKey().count // = 43191

    var zipmap = ziprddparse.map(x => (x.zip, x.state))
    var zipmapcity = ziprddparse.map(x => (x.zip, x.city))
    var rdd911map = rdd911parse.map(x => (x.zip, x))
    var ziprdd911 = rdd911map.join(zipmap)
    var cityziprdd911 = rdd911map.join(zipmapcity)
    var ziprdd911map = ziprdd911.map(x => (x._1, x._2._1.title, x._2._2)) // (zip,title,state)
    var cityziprdd911map = cityziprdd911.map(x => (x._1, x._2._1.title, x._2._2)) //(zip,title,city)
    var titleperstate = ziprdd911map.map(x => (x._3, x._2.split(":")(0))).countByValue() // =3
    var citytitleperstate = cityziprdd911map.map(x => (x._3, x._2.split(":")(0))).countByValue()
    var finalemergencyperstate = titleperstate.map { case ((a, b), c) => (f"State=$a " + f" Crime=$b%7s " + f" CrimeCount=$c") }
    var cityfinalemergencyperstate = citytitleperstate.map { case ((a, b), c) => (f"City=$a%19s " + f" Crime=$b%7s " + f" CrimeCount=$c") }

  }
  case class S911(latitude: Double, longitude: Double, description: String, zip: Int, title: String, timeStamp: String, twp: String, addr: String, e: Int)
  def parse1(row: String): S911 = {
    var fields = row.split(",")
    var latitude: Double = fields(0).toDouble
    var longitude: Double = fields(1).toDouble
    var description: String = fields(2)
    var zip: Int = fields(3).toInt
    var title: String = fields(4)
    var timeStamp: String = fields(5)
    var twp: String = fields(6)
    var addr: String = fields(7)
    var e: Int = fields(8).toInt
    S911(latitude, longitude, description, zip, title, timeStamp, twp, addr, e)
  }
  case class zipcode(zip: Int, city: String, state: String, latitude: Double, longitude: Double, timezone: Int, dst: Int)
  def parse2(row: String): zipcode = {
    var field = row.split(",")
    var zip: Int = field(0).toInt
    var city: String = field(1)
    var state: String = field(2)
    var latitude: Double = field(3).toDouble
    var longitude: Double = field(4).toDouble
    var timezone: Int = field(5).toInt
    var dst: Int = field(6).toInt
    zipcode(zip, city, state, latitude, longitude, timezone, dst)
  }

}