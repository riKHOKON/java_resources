package java_basic.input_output;

import java.io.IOException;
import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args)
	/*throws IOException*/ 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter frist number ");
		int number = input.nextInt();
		System.out.print("Enter second number ");
		int number2 = input.nextInt();
		System.out.println("Sum is : "+(number+number2));

		
		
//		System.out.print("Enter a number ");
//		Dint number = (dint)System.in.read();
//		System.out.println("You entered  : "+number);
	}

}
