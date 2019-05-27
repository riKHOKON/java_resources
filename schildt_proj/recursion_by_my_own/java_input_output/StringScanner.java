package schildt_proj.recursion_by_my_own.java_input_output;
/*
* Scanner also can take string as input
* */
import java.util.Scanner;
public class StringScanner {
   public static void main(String[] args) {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");
      name = input.nextLine();
      System.out.println("Your name is " + name);  
   }
}