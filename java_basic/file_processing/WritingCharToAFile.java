package java_basic.file_processing;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class WritingCharToAFile {

	public static void main(String[] args) throws IOException {
		String fileName = "chars.txt";
		PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
		String sentence = "This is time for good people";
		for	(int i = 0;i < sentence.length();++i){
			outFile.write(sentence.charAt(i));
			outFile.write('\n');
		}
		outFile.close();
	}
}
