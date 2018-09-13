package movies.ratings
import org.apache.spark._
object movies {
  def main(args: Array[String]) = {
    var sparkConf = new SparkConf()
    var sc = new SparkContext(sparkConf)
    var ratingrdd = sc.textFile("file:///home/sahil/projects/movie/rating.csv")
    var filterrdd = ratingrdd.filter(x => !x.contains("userId"))
    var parserating = filterrdd.map(parse1)
    var movierdd = sc.textFile("file:///home/sahil/projects/movie/movie (copy).txt")
    var filtermovie = movierdd.filter(x => !x.contains("movieId"))
    var parsemovie = filtermovie.map(parse2)
    var roti = parserating.map(x => (x.year, x.movieid)).groupByKey().map { case (a, b) => (a, b.size) }
    var showmovieperyear = roti.map { case (a, b) => (f"Year=$a " + f"numberOfMovies=$b ") }
    var genre = parsemovie.map(x => (x.genres, x.movieid)).countByValue().map { case ((a, b), c) => (f"Genres=$a%40s " + f"Number=$c") }

  }

  case class ratings(userid: Int, movieid: Int, rating: Float, year: Int)
  def parse1(row: String): ratings = {
    var fields = row.split(",")
    var userid = fields(0).toInt
    var movieid = fields(1).toInt
    var rating = fields(2).toFloat
    var year = fields(3).substring(0, 4).toInt
    ratings(userid, movieid, rating, year)
  }
  case class movie(movieid: Int, title: String, genres: String)
  def parse2(row: String): movie = {
    var fields = row.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)
    var movieid = fields(0).toInt
    var title = fields(1).replace('"', ' ').trim().replaceAll(" ", "")
    var genres = fields(2).replace('"', ' ').trim().replaceAll(" ", "")
    movie(movieid, title, genres)
  }
}