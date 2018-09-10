import scala.util.control._
import scala.util.control.Breaks._ 
object MainTask{
var maze =Array(Array(1,1,1,1,1),
          Array(1,2,0,1,2),
          Array(1,1,0,1,2),
          Array(1,1,0,3,2),
          Array(1,1,1,1,1))
def shortestPath(maze:Array[Array[Int]],solution:Array[Array[Int]],x:Int,y:Int,ex:Int,ey:Int):Array[Array[Int]]={

    if(maze(x)(y)== 1||maze(x)(y)== -2)
      solution

if(maze(x)(y)==3){
    maze(x)(y)= -2
    solution(x)(y)=1
    print2(solution)
    maze(x)(y)=0
    solution(x)(y)=0
    solution
}

if(x==0 && y==0){
        solution(x)(y)=1
        maze(x)(y) = -1
        shortestPath(maze,solution,x+1,y,ex,ey)
        shortestPath(maze,solution,x,y+1,ex,ey)
        solution(x)(y)=0
        maze(x)(y) = 0 
        solution
    }

if ( x==ex&& y==0){

            solution(ex)(y)=1
            maze(ex)(y)= -1
            shortestPath(maze,solution,x-1,y,ex,ey)
            shortestPath(maze,solution,x,y+1,ex,ey)
            solution(ex)(y)=0
            maze(ex)(y) = 0 
            solution
    }

    if(x==0&&y==ey){
            solution(x)(ey)=1
            maze(x)(ey)= -1
            shortestPath(maze,solution,x+1,y,ex,ey)
            shortestPath(maze,solution,x,y-1,ex,ey)
            solution(x)(ey)=0
            maze(x)(ey) = 0 
            solution
}
    if(x==ex&&y==ey){
            solution(ex)(ey)=1
            maze(ex)(ey)= -1
            shortestPath(maze,solution,x-1,y,ex,ey)
            shortestPath(maze,solution,x,y-1,ex,ey)
            solution(ex)(ey)=0
            maze(ex)(ey) = 0 
            solution
}
   if(y==0){
            solution(x)(y)=1
            maze(x)(y)= -1
            shortestPath(maze,solution,x+1,y,ex,ey)
            shortestPath(maze,solution,x,y-1,ex,ey)
            shortestPath(maze,solution,x,y+1,ex,ey)

            solution(x)(y)=0
            maze(x)(y) = 0 
            solution
   }

   if(x==0){
            solution(x)(y)=1
            maze(x)(y)= -1
            shortestPath(maze,solution,x,y-1,ex,ey)
            shortestPath(maze,solution,x,y+1,ex,ey)
            shortestPath(maze,solution,x+1,y,ex,ey)
            solution(x)(y)=0
            maze(x)(y) = 0 
            solution
   }

   if(x==ex){
            solution(x)(y)=1
            maze(x)(y)= -1
            shortestPath(maze,solution,x,y+1,ex,ey)
            shortestPath(maze,solution,x+1,y,ex,ey)
            shortestPath(maze,solution,x-1,y,ex,ey)
            solution(x)(y)=0
            maze(x)(y) = 0 
            solution
   }
   if(y==ey){
            solution(x)(y)=1
            maze(x)(y)= -1
            shortestPath(maze,solution,x-1,y,ex,ey)
            shortestPath(maze,solution,x+1,y,ex,ey)
            shortestPath(maze,solution,x,y-1,ex,ey)
            solution(x)(y)=0
            maze(x)(y) = 0 
            solution
   }
    else {
        
            solution(x)(y)=1
            maze(x)(y)= -1
            shortestPath(maze,solution,x-1,y,ex,ey)
            shortestPath(maze,solution,x+1,y,ex,ey)
            shortestPath(maze,solution,x,y+1,ex,ey)
            shortestPath(maze,solution,x,y-1,ex,ey)
            solution(x)(y)=0
            maze(x)(y) = 0 
            solution
    }}

def print2(maze:Array[Array[Int]])={
    for(i<-0 to maze.length-1){
        for(j<- 0 to maze(i).length-1){
            println(maze(i)(j))
        }
    }
}


 def main(args:Array[String]){
    var solution:Array[Array[Int]] = Array.ofDim[Int](5,5)
    var x = 0
var y = 0
 val outer = new Breaks; //object for break
      val inner = new Breaks; //object for break
var flag=0;
outer.breakable // Outer Block
        {

              for ( i <- 0 to maze.length-1){
                 inner.breakable // Inner Block
                {
                    for ( j <- 0 to maze(i).length-1){
                        if (solution(i)(j) == 2 ){
                         
                            flag = 1
                             inner.break;
                        }
                        }
                        if (flag == 1){
                             outer.break;
                        }
                        
                    }// inner breakable
             }
         }
         shortestPath(maze,solution,x,y,x-1,y-1)

    


     }
}

