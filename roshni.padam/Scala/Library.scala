case class Book(book_Name:String,author_Name:String,publicat_Year:Int) extends Ordered[Book]{
 def compare(that: Book): Int = book_Name.compare(that.book_Name)
}


           object MainClass{

		 def bookAdd(num:Int,array:Array[Array[Book]],count:Int)={
		 var book_Name:String=""
		 var author_Name:String=""
		 var publicat_Year:Int=0
							
		 for(x <- 0 to num-1){
		 println("Enter name of the Book")
		 book_Name=readLine
		 println("Enter name of the Author")
		 author_Name=readLine
		 println("Enter year of publication")
		 publicat_Year=readInt
		 array(count)(x)=new Book(book_Name,author_Name,publicat_Year)

							}}

// function to sort the book acc. to its names 
def sortByName(array:Array[Array[Book]])={
	for(i <- 0 to array.length-1){
		scala.util.Sorting.quickSort(array(i))
	}
	printBooks(array)
}

// function to print 
def printBooks(array:Array[Array[Book]])={
                for(i <- 0 to 25){
		for(j <- 0 to array(i).length-1){
		print(array(i)(j))
		}
                println()
}}


// the main function of our code 
def main(args:Array[String])={
	 var array=Array.ofDim[Array[Book]](26)
                        
			var count:Int=1;
			var alphabet:Int=65;
			for(count<-0 to 25){
					println("enter the rows for the current word intial to add on"+alphabet.toChar)
      				var num=readInt

					array(count) =Array.ofDim[Book](num)
				
                    bookAdd(num,array,count)
					alphabet=alphabet+1;}

while(true){
println("Book library")
println("enter the choice of operation want to do" )
println("1. print the books that are added in the library ")
println("2. enter to sort books ")
println("3. enter to exit from the library application")
val scanner =new java.util.Scanner(System.in)
val choice=scanner.nextInt()
choice match{

case 1=>printBooks(array)

case 2=>println("sorted book list acc. to book name")
	    sortByName(array)

case 3=>System.exit(1)

case _=>println("wrong entry")
}
}
}}
