//  19001355 
//  Hansana Prabavith Ranaweera
//  2019cs135

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question4{

    def isEven(m:Int): Boolean=m match{
        case 0 => true
		case _ => isOdd(m-1)
   	}
	
	def isOdd(m:Int): Boolean={
     	!(isEven(m)) 
   	}

	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Enter number :");
		val num=input.nextInt();

		if(isOdd(num))
			println("ODD");
		else
			println("EVEN");
	}
} 