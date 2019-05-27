package java_basic.input_output;

import java.util.Scanner;

public class StringInputFromKeyboard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = input.nextLine();
//		name = input.next(); only the first name not after space
		System.out.println("Your name is : "+name);
	}

}
