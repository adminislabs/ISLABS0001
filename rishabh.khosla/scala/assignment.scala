/**
@author Rishab
this application is based on the library book management system
In which books are added from A to Z initials and then 
apply sorting cases to serial wise print the output of books  

**/
case class Book(book_name:String,author_name:String,publication_year:Int) extends Ordered[Book]{
 def compare(that: Book): Int = book_name.compare(that.book_name)
}


object Mainclass{

							def bookAdd(num:Int,arr:Array[Array[Book]],count:Int)={
							var book_name:String=""
							var author_name:String=""
							var publication_year:Int=0
							
							for(x <- 0 to num-1){
							println("enter the book name")
							book_name=readLine
							println("enter the book author name")
							author_name=readLine
							println("enter the year of publish")
							publication_year=readInt

							arr(count)(x)=new Book(book_name,author_name,publication_year)

							}}
// function to print the 2d array in which books data is placed 
def printBooks(arr:Array[Array[Book]])={
for(i <- 0 to 25){
			for(j <- 0 to arr(i).length-1){
			print(arr(i)(j))
			}
println()
}}
// function to sort the array acc. to the books name 
def sortByName(arr:Array[Array[Book]])={
	for(i <- 0 to arr.length-1){
		scala.util.Sorting.quickSort(arr(i))
	}
	printBooks(arr)
}
// function to sort the array acc. to the year of book publication
def sortByYearOfPublish(arr:Array[Array[Book]])={
	var current=0
	var totalBooks=0
	for(i <- 0 to arr.length-1){
	   totalBooks=arr(i).length + totalBooks;
	}
	 var yearSort:Array[Book]=Array.ofDim[Book](totalBooks)
	 for(i <- 0 to arr.length-1){
	 	for(j <- 0 to arr(i).length-1){
           yearSort(current)=arr(i)(j)
           current=current+1
	 	}
	 }
	 printBooks(arr)
}

// the main function of our code 
def main(args:Array[String])={
	 var arr=Array.ofDim[Array[Book]](26)
                        
			var count:Int=1;
			var alphabet:Int=65;
			for(count<-0 to 25){
					println("enter the no. of rows for the current word" +" "+alphabet.toChar)
      				var num=readInt

					arr(count) =Array.ofDim[Book](num)
				
                    bookAdd(num,arr,count)
					alphabet=alphabet+1;}

while(true){
println("welcome to online book library")
println("enter the choice of operation want to do" )
println("1. print the books that are added in the library ")
println("2. enter to sort books acc. to book name")
println("3. enter to sort books acc. to year of publish")
println("4. enter to exit from application")
val scanner =new java.util.Scanner(System.in)
val choice=scanner.nextInt()
choice match{

case 1=>printBooks(arr)

case 2=>println("sorted book list acc. to book name")
	    sortByName(arr)

case 3=>println("sorted book list acc.to year of publish")
        sortByYearOfPublish(arr)
case 4=>System.exit(1)

case _=>println("wrong entry")
}
}
}}


