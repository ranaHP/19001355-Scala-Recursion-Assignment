//  19001355 
//  Hansana Prabavith Ranaweera
//  2019cs135

import java.util.Scanner;
import scala.io.StdIn.readInt;

object Question3{

    def sum(a:Int,b:Int=0):Int = a match{
        case 0 => b
        case x if(x>0) => sum((a-1),(b+a))
    }
    def main(args:Array[String]){
        var input = new Scanner(System.in);
        print("Enter number:");
        val num = input.nextInt();
        print("sum is ");
        print(sum(num));
    }
} 