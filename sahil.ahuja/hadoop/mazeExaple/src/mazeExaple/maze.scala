package mazeExaple

object maze {
  def main(args: Array[String]) {
    println("MAZE has features: 2=Entry point, 3=exit point, 0=Block, 1=Path")
    println("Enter the number of rows and columns in ur maze")
    var rows = readInt()
    var columns = readInt()
    var xdestination = 0
    var ydestination = 0
    var xsource = Array.ofDim[Int](rows * columns)
    var ysource = Array.ofDim[Int](rows * columns)
    var numberOfSources = 0
    var k = 0
    var maze = Array.ofDim[Int](rows, columns)
    println("Enter the the elements of maze")
    for (i <- 0 to rows - 1) {
      for (j <- 0 to columns - 1) {
        maze(i)(j) = readInt()
        if (maze(i)(j) == 3) {
          xdestination = i
          ydestination = j
        }
        if (maze(i)(j) == 2) {
          xsource(k) = i
          ysource(k) = j
          numberOfSources = numberOfSources + 1
          k = k + 1
        }
      }
    }
    println("\n Ur maze looks like this")
    // println(xdestination+" "+ydestination+" "+xsource(0)+" "+ysource(0)+" "+xsource(1))
    for (i <- 0 to rows - 1) {
      for (j <- 0 to columns - 1) {
        print(maze(i)(j) + " ")
      }
      println("")
    }
    for (i <- 0 to numberOfSources - 1) {
      var l = xsource(i)
      var m = ysource(i)
      println("Path from source (" + xsource(i) + "," + ysource(i) + ") to destination")
      mazeSolution(maze, rows, columns, xsource(i), ysource(i), xdestination, ydestination, l, m)
    }

  }
  def printMaze(sol: Array[Array[Int]], rows: Int, columns: Int) {
    println("Go through ones to access path")
    for (i <- 0 to rows - 1) {
      for (j <- 0 to columns - 1) {
        print(sol(i)(j) + " ")
      }
      println("")
    }
  }

  def solveMaze(maze: Array[Array[Int]], x: Int, y: Int, sol: Array[Array[Int]], rows: Int, columns: Int, xdestination: Int, ydestination: Int, l: Int, m: Int): Boolean = {

    if (x == xdestination && y == ydestination) {
      sol(x)(y) = 1
      return true
    }

    if (safePoint(maze, x, y, rows, columns)) {
      sol(x)(y) = 1
      if (l >= xdestination && m >= ydestination) {
        if (solveMaze(maze, x - 1, y, sol, rows, columns, xdestination, ydestination, l, m))
          return true
        if (solveMaze(maze, x, y - 1, sol, rows, columns, xdestination, ydestination, l, m))
          return true
      }
      if (l <= xdestination && m <= ydestination) {
        if (solveMaze(maze, x + 1, y, sol, rows, columns, xdestination, ydestination, l, m))
          return true
        if (solveMaze(maze, x, y + 1, sol, rows, columns, xdestination, ydestination, l, m))
          return true
      }
      if(l>=xdestination&&m<=ydestination){
        if (solveMaze(maze, x - 1, y, sol, rows, columns, xdestination, ydestination, l, m))
          return true
         if (solveMaze(maze, x, y + 1, sol, rows, columns, xdestination, ydestination, l, m))
          return true 
      }
      if(l<=xdestination&&m>=ydestination){
        if (solveMaze(maze, x + 1, y, sol, rows, columns, xdestination, ydestination, l, m))
          return true
         if (solveMaze(maze, x, y - 1, sol, rows, columns, xdestination, ydestination, l, m))
          return true 
      }
      sol(x)(y) = 0
      return false

    }

    return false
  }
  def safePoint(maze: Array[Array[Int]], x: Int, y: Int, rows: Int, columns: Int): Boolean = {
    if (x >= 0 && x < rows && y >= 0 && y < columns && ((maze(x)(y) == 1) || maze(x)(y) == 2)) {
      return true
    } else false
  }

  def mazeSolution(maze: Array[Array[Int]], rows: Int, columns: Int, xsource: Int, ysource: Int, xdestination: Int, ydestination: Int, l: Int, m: Int): Boolean = {
    var sol = Array.ofDim[Int](rows, columns)

    if (solveMaze(maze, xsource, ysource, sol, rows, columns, xdestination, ydestination, l, m) == false) {
      println("No solution")
      return false
    }
    printMaze(sol, rows, columns)
    return true
  }
}