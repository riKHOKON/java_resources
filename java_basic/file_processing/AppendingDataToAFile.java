package java_basic.file_processing;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendingDataToAFile {

	public static void main(String[] args) throws IOException{
		String fileName = "numbers.txt";
		PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter a number(-1 to quit:) ");
		number = input.nextInt();
		while(number != -1){	
			outFile.print(number);
			System.out.print("Enter a number(-1 to quit:) ");
			number = input.nextInt();
		}
		outFile.close();
	}

}
