//  19001355 
//  Hansana Prabavith Ranaweera
//  2019cs135

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question5{

    def isEven(m:Int): Boolean=m match{
        case 0 => true
		case _ => isOdd(m-1)
   	}
	
	def isOdd(m:Int): Boolean={
     		! (isEven(m)) 
   	}
	
	def add(m:Int, n:Int=0 ,res:Int=0) : Int =n match{
		case x if (x==m) => res
		case x if ((x<m) && (isOdd(n))) => add(m,n+1,res)
		case x if ((x<m) && (! isOdd(n))) => add(m,n+1,res+n)
	}

    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter number:");
        val num = input.nextInt();
        println(add(num));
    }
} 