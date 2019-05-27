package java_basic.file_processing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToAFile {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\RI\\Desktop\\numbers.txt";
		//String fileName = "names.txt";
		PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
		
		outFile.println("khokon");
		outFile.println("shamim");
		outFile.print("rashedul");
		outFile.println("sakil");
		
		
//		outFile.println("Rashedul Islam");
//		outFile.println("Arif Sarker");
//		outFile.println("Ariful Islam");
//		outFile.println("Raj Saha");
		
		outFile.close();
		
	}

}
