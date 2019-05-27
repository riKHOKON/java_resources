package java_basic.input_output;

import java.util.Scanner;

public class Letter {

	public static void main(String[] args) {
		
		String name, present,yourName;
		int age;
		Scanner inputString = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("What is the name of the gift giver? ");
		name = inputString.nextLine();
		System.out.print("What is the presente they gave you?");
		present = inputString.nextLine();
		System.out.print("How old were you on your birthday? ");
		age = inputNumber.nextInt();
		System.out.print("What is your name : ");
		yourName = inputString.nextLine();
		System.out.println();
		System.out.println();
		System.out.println("Dear "+name);
		System.out.println();
		System.out.println("Thank you for your "+present+".It is very good day having my "
				+ ""+age+"th birth day.");
		System.out.println();
		System.out.println("Your "+yourName);
		
	}

}
