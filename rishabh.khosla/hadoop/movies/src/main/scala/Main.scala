
import java.text.SimpleDateFormat
import java.util.Date
import org.apache.spark._

object Main extends App{

  override def main(arg:Array[String]) : Unit = {
    
    var sparkConf = new SparkConf().setMaster("local").setAppName("movies")
 var sc = new SparkContext(sparkConf)
sc.setLogLevel("ERROR")
val rdd1=sc.textFile("file:///home/rishab/Downloads/projects/ml-20m/ratings.csv")

var filter_rating=rdd1.filter(x=> (!x.contains("userId"))).map(parse1)

// find the movies nd rating per year
var pair_year=filter_rating.map(x=>((x.times),x)).groupByKey()
println("the no of movies per year")
var req_output=pair_year.map{case (key,value)=>("year="+key,"movies_no="+value.size)}.foreach(println)

// find the no of movies generes wise
val rdd2=sc.textFile("file:///home/rishab/Downloads/projects/ml-20m/movies.csv")
var filter_movie=rdd2.filter(x=> (!x.contains("movieId"))).map(parse2)
var pair_genres=filter_movie.map(x=>((x.genres),x.movie_Id)).groupByKey()

//average rating of  movies
var pair_movie_id=filter_rating.map(x=> ((x.movie_Id),x.rating)).groupByKey()
println("avg. rating of all individual movies")
var pair_movie_id_size=pair_movie_id.map{case (key,value) => ("year="+key," avg.rating"+value.reduce(_+_)/value.size)}.foreach(println)
//average ratings of desired movie in each year
val pair_year_movie=filter_rating.map(x=>((x.times),x)).groupByKey()
val filter_movie_1=pair_year_movie.map{case (key,value)=> (key,value.filter(_.movie_Id==(1)))}
println("avg rating of movie 1 in all years")
val avg_movie_1=filter_movie_1.map{case(key,value)=>("year="+key,"movie  id 1 rating="+value.map(_.rating).reduce(_+_)/value.size)}.foreach(println)

//average rating per user
var pair_userid=filter_rating.map(x=>(x.user_Id,x.rating)).groupByKey()
var avg_user_rating=pair_userid.map{case (key,value)=>("User="+key," avg.rating="+value.reduce(_+_)/value.size)}.foreach(println)

sc.stop()
}
//parse function of rating dataset
case class rating_s(user_Id:Int,movie_Id:Int,rating:Double,times:String) extends Serializable{}
def parse1(row:String):rating_s={
    val field=row.split(",")
    val user_Id=field(0).toInt
    val movie_Id=field(1).toInt
    val rating=field(2).toDouble
    val df:SimpleDateFormat=new SimpleDateFormat("yyyy")
    val times=df.format((field(3)+"000").toLong)
    
    rating_s(user_Id,movie_Id,rating,times)
}

// parse function of movie dataset
case class movie(movie_Id:Int,title:String,generes:Array[String],year:String) extends Serializable{}
def parseMovie(row:String):movie={
   val field=row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)")
   val movie_Id=field(0).toInt
   val title=field(1)
   val generes=field(2).split('|')
   val reqString=field(1).trim()
   val length=reqString.length()
   var string = reqString.substring(length - 5,length).trim
   if(reqString.charAt(length-1) == '"') string = reqString.substring(length - 6,length-1).trim
   val year=string.substring(0,string.length-1)
   movie(movie_Id,title,generes,year)
}
}
