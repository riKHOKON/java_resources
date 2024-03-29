package schildt_proj.recursion_by_my_own.methods;

import java.util.Scanner;

public class TestingStaticMethods {
   public static void main(String[] arts) {

      Scanner inputTemp = new Scanner(System.in);
      Scanner input = new Scanner(System.in);
      double temperature;
      String type;
      System.out.print("Enter a temperature to convert: ");
      temperature = inputTemp.nextDouble();
      System.out.print("Enter type to convert to (C or F): ");
      type = input.next();
      System.out.println("The converted temperature is " + 
                         convert(temperature, type));
   }
   
   static double ftoc(double temp) {
      double celsius;
      celsius = (temp - 32.0) * (5.0 / 9.0);
      return celsius;
   }

   static double ctof(double temp) {
      double fahrenheit;
      fahrenheit = temp * (9.0 / 5.0) + 32.0;
      return fahrenheit;
   }

   static double convert(double temp, String type) {
      if (type.equals("C"))
         return (temp - 32.0) * (5.0 / 9.0);
      else
         return temp * (9.0 / 5.0) + 32.0;
   }

}