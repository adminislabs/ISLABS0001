package book
import scala.util.control._
import scala.math.Ordering
import scala.util.Sorting
/**
 * This is case class of book containing variables name of book,
 * author of book and year of publication
 */
case class Book(name: String, author: String, year: Int)

/**
 * This object defines a method for comparing two books name
 */
object NameOrdering extends Ordering[Book] {
  def compare(a: Book, b: Book) = a.name compare b.name
}

/**
 * This object defines a method for comparing two books year of publication
 */
object YearOrdering extends Ordering[Book] {
  def compare(a: Book, b: Book) = a.year compare b.year
}
/**
 * This object defines all the functionalities we have to perform such as adding a book,
 * searching a book, sorting a book by name or by year of publication
 */

object LibrarySystem {
  var bookArray = Array.ofDim[Array[Book]](26)
  /**
   * This function adds the book in the store which is array
   */
  def addBook() {
    println("Enter the character in Capital")
    var char = scala.io.StdIn.readChar()
    println("Enter the number of books u want to store")
    var numberOfBooks = scala.io.StdIn.readInt()
    bookArray(char.toInt - 65) = Array.ofDim[Book](numberOfBooks)
    println("Enter the details of books")
    for (i <- 0 to numberOfBooks - 1) {
      println("Enter book number " + (i + 1) + " details in order of name of book, author of book then year of publication")
      var nameOfBook = scala.io.StdIn.readLine()
      var authorOfBook = scala.io.StdIn.readLine()
      var yearOfPublication = scala.io.StdIn.readInt()
      bookArray(char.toInt - 65)(i) = Book(nameOfBook, authorOfBook, yearOfPublication)
    }
    /**
     * This function search the particular book with the name of book specified
     */
  }
  def searchBook() {
    var length = 0
    println("Enter the character")
    var char1 = scala.io.StdIn.readChar()
    println("Enter the name of book u want to search")
    var nameOfBookSearch = scala.io.StdIn.readLine()
    if (bookArray(char1.toInt - 65) != null) {
      length = bookArray(char1.toInt - 65).length
    }
    var counter = 0
    for (i <- 0 to length - 1) {
      if (bookArray(i) != null) {
        if (nameOfBookSearch == bookArray(char1.toInt - 65)(i).name) {
          println("found")
          counter = counter + 1
        }
      }
    }
    if (counter == 0) {
      println("Not Found")
    }

  }
  /**
   * This function sorts the books in ascending order of their year of publication
   */
  def sortByYear() {
    var c = 0
    var d = 0
    for (i <- 0 to 25) {
      if (bookArray(i) != null) {
        d = d + bookArray(i).length
      }
    }
    var temp = new Array[Book](d)
    for (i <- 0 to 25) {
      if (bookArray(i) != null) {
        for (j <- 0 to bookArray(i).length - 1) {
          temp(c) = bookArray(i)(j)
          c = c + 1
        }
      }
    }
    Sorting.quickSort(temp)(YearOrdering)
    //Books after sorting
    println("Sorted by year\n")
    for (i <- 0 to c - 1) {
      println(temp(i).year + " " + temp(i).name + " " + temp(i).author)
    }

  }
  /**
   * This function sorts the books in ascending order of their names
   */
  def sortByName() {
    for (i <- 0 to 25) {
      if (bookArray(i) != null) {
        Sorting.quickSort(bookArray(i))(NameOrdering)

      }
    }
    println("Sorted By name\n")
    //Books after sorting
    for (i <- 0 to 25) {
      if (bookArray(i) != null) {
        for (j <- 0 to bookArray(i).length - 1) {
          println(bookArray(i)(j).name + " " + bookArray(i)(j).author + " " + bookArray(i)(j).year)
        }
      }
    }
  }
  /**
   * This is the main function helps to perform functions like adding the book,
   * searching the book or sorting the books by name or year of publication
   */
  def main(args: Array[String]) {
    while (true) {
      println("\nEnter ur choice")
      println("1.Want to add book")
      println("2.Want to search book")
      println("3.Want to Sort by name")
      println("4.Want to sort by year of publication")
      println("5.Want to exit")
      var choice = scala.io.StdIn.readInt()
      choice match {
        case 1 => addBook()
        case 2 => searchBook()
        case 3 => sortByName()
        case 4 => sortByYear()
        case 5 => System.exit(1)
        case _ => println("Not a valid choice")

      }
    }
  }
}