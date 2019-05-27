package schildt_proj.recursion_by_my_own.java_input_output;

import java.util.Scanner;

public class InputByScanner {
   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       double number, number1, sum;
       System.out.print("Enter the first number: ");
       number = input.nextDouble();
       System.out.print("Enter the second number: ");
       number1 = input.nextDouble();
       sum = number + number1;
       System.out.println("The sum is " + sum);
   }
}