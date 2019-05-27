package java_basic.try_catch;

import java.util.Scanner;

public class TryCatch {
	static int numerator ,dominator,result;
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {	
	try{
		System.out.print("Enter the numerator:");
		numerator = input.nextInt();
		System.out.print("Enter the dominator:");
		dominator = input.nextInt();
		result = numerator / dominator;
		System.out.println("Result is "+result);
	}catch(ArithmeticException ae){
		System.out.println("Can't be divided by zero.\nEnter numerator again:");
		numerator = input.nextInt();
		System.out.print("Enter the dominator:");
		dominator = input.nextInt();
		result = numerator / dominator;
		System.out.println("Result is "+result);
	}
		
	
	}

}
