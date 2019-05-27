package java_basic.file_processing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromAFile {

	public static void main(String[] args) throws IOException {
		String fileName = "notes.txt";
		
		//String fileName = "names.txt";
		Scanner inFile = new Scanner(new FileReader(fileName));
		while(inFile.hasNextLine()){
			//int number = Integer.parseInt(inFile.nextLine());
			String name = inFile.nextLine();
			//System.out.println(number);
			System.out.println(name);	
		}
	}

}
