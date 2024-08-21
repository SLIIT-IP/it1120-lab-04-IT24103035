

import java.util.Scanner;
public class  IT24100490Lab4Q1{

          public static void main(String[]args){
	
	         int number;
			 Scanner input = new Scanner(System.in);
			 System.out.print("enter a number: ");
			 number = input.nextInt();
			 if(number > 0)
			 {
			   System.out.print("Number is: Positive");
			 }
			 else if (number < 0)
			 {
			   System.out.print("Number is: Negative");
			 }
			 else if (number == 0)
			 {
			   System.out.print("Number is zero");
			 }
	}
}
