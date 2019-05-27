package schildt_proj.Java_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by RI on 6/8/2017.
 */
public class ShowFile {
    public static void main(String args[]) throws IOException {
        System.err.println("Error message.");
        System.out.print("Enter a charecter :");
        int i = System.in.read();
        System.out.println((char)i);


//        int i;
//        FileInputStream fin = null;
//        if (args.length != 1){
//            System.out.println("Usage : ShowFile File");
//            return;
//        }
//        try {
//            fin = new FileInputStream(args[0]);
//        }catch (FileNotFoundException exe){
//            System.out.println("File not found");
//        }
//        try {
//            // read byte until EOF is encountered.
//            do{
//                i = fin.read();
//                if (i != -1) {
//                    System.out.println((char) i);
//                }
//            }while (i != -1);
//        }catch (IOException exc){
//            System.out.println("Error reading file");
//        }
//        try {
//            fin.close();
//        }catch (IOException exc){
//            System.out.println("Error closing file.");
//        }
    }
}
