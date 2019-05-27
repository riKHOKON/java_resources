package schildt_proj.recursion_by_my_own.making_decisions;

import java.util.Scanner;

/*

if (rel exp) {
   if (rel exp) {
      if (rel exp) {
         statement;
      }
      else {
         statement;
      }
   }
}

*/

public class RelationalOperators3 {
   public static void main(String[] args) {

      int grade;
      String letterGrade;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a grade: ");
      grade = input.nextInt();
      if (grade >= 90) { 
         if (grade >= 95) {
            letterGrade = "Family+";
            System.out.println("Your letter grade is " + letterGrade);
         }
         if (grade >= 93) {
            letterGrade = "Family";
            System.out.println("Your letter grade is " + letterGrade);
         } else
            letterGrade = "Family-";
            System.out.println("Your letter grade is " + letterGrade);
      } else 
         System.out.println("Sorry, you didn't make an Family.");
   }
}

      