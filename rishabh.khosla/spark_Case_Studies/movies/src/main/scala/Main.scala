
import java.text.SimpleDateFormat
import java.util.Date
import org.apache.spark._

object Main extends App{

  override def main(arg:Array[String]) : Unit = {
    
 var sparkConf = new SparkConf().setMaster("local").setAppName("movies")
 var sc = new SparkContext(sparkConf)
sc.setLogLevel("ERROR")
val input_rating=sc.textFile("file:///home/rishab/Downloads/projects/ml-20m/ratings.csv").filter(x =>(!x.contains("movieId")))
val data_Rating=input_rating.map(parseRating)
val input_movie=sc.textFile("file:///home/rishab/Downloads/projects/ml-20m/movies.csv").filter(x=> (!x.contains("movieId")))
val data_Movie=input_movie.map(parseMovie)
    
//problems statements
// find the no. of movies nd rating per year
println("the no of movies per year")
var movies_Year=data_Movie.map(x=>((x.year),x.movie_Id)).groupByKey().map{case (key,value)=>("year="+key,"movies_no="+value.size)}.foreach(println)   
println("the no of ratings per year")
var ratings_year=data_Rating.map(x=>((x.year),x.rating)).groupByKey().map{case (key,value)=>("year="+key,"rating_no="+value.size)}.foreach(println)   

// find the no of movies generes wise
 val Generes_no=data_Movie.map(x=>x.generes).collect.flatten.toSet.toList
 val array : Array[(String, org.apache.spark.rdd.RDD[movie_s])] = Array.ofDim(Generes_no.length)
 for(a<- 0 to Generes_no.length-1){
array(a)=(Generes_no(a), data_Movie.filter(x=>x.generes.contains(Generes_no(a))))
}
// movies count per generes wise 
var moviesCount= array.map{ case (a,b) => (f"geners$a%8s",b.count)
                           
//average rating of all  movies id
var pair_movie_id=filter_rating.map(x=> ((x.movie_Id),x.rating)).groupByKey()
println("avg. rating of all individual movies")
var pair_movie_id_size=pair_movie_id.map{case (key,value) => ("year="+key," avg.rating"+value.reduce(_+_)/value.size)}.foreach(println)

//average ratings of desired movie in each year
val pair_year_movie=data_Movie.map(x=>((x.times),x)).groupByKey()
val filter_movie_1=pair_year_movie.map{case (key,value)=> (key,value.filter(_.movie_Id==(1)))}
println("avg rating of movie 1 in all years")
val avg_movie_1=data_Movie_1.map{case(key,value)=>("year="+key,"movie  id 1 rating="+value.map(_.rating).reduce(_+_)/value.size)}.foreach(println)

//average rating per user
var pair_userid=data_Rating.map(x=>(x.user_Id,x.rating)).groupByKey()
var avg_user_rating=pair_userid.map{case (key,value)=>("User="+key," avg.rating="+value.reduce(_+_)/value.size)}.foreach(println)

sc.stop()
}
//parse function of rating dataset
case class rating_s(user_Id:Int,movie_Id:Int,rating:Double,year:String) extends Serializable{}
def parseRating(row:String):rating_s={
    val field=row.split(",")
    val user_Id=field(0).toInt
    val movie_Id=field(1).toInt
    val rating=field(2).toDouble
    val df:SimpleDateFormat=new SimpleDateFormat("yyyy")
    val year=df.format((field(3)+"000").toLong)
    rating_s(user_Id,movie_Id,rating,year)
}

// parse function of movie dataset
case class movie_s(movie_Id:Int,title:String,generes:Array[String],year:String) extends Serializable{}
def parseMovie(row:String):movie_s={
   val field=row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)")
   val movie_Id=field(0).toInt
   val title=field(1)
   val generes=field(2).split('|')
   val reqString=field(1).trim
   val length=reqString.length()
   var string = reqString.substring(length - 5,length).trim
   if(reqString.charAt(length-1) == '"') string = reqString.substring(length - 6,length-1).trim
   val year=string.substring(0,string.length-1)
   movie_s(movie_Id,title,generes,year)
}
}
