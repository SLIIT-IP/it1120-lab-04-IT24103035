import java.util.Scanner;
public class IT24103035Lab4Q3
{
          public static void main(String[]args)
	{
	         int number;
			 String message;
			 Scanner input = new Scanner(System.in );
			 System.out.print("enter a number: ");
			 number = input.nextInt();
			 message = (number > 0) ? "The number is: Positive" : (number < 0) ? 			 "The number is: Negative" : "The number is zero"; 
			 System.out.print(message);
			 
	}
}
			
