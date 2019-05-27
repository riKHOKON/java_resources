package schildt_proj.recursion_by_my_own.making_decisions;

import java.util.Scanner;

/*
   if (relational expression) {
      statements;
   }  else if (relational expression) {
      statements;
   } else if (relational expression) {
      statements;
   } else {
      statements;
   }
*/

public class RepetadLadderTypeRelationalOperators4 {
   public static void main(String[] args) {

      int grade;
      String letterGrade = "";
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a grade: ");
      grade = input.nextInt();
      if (grade >= 90) {
         letterGrade = "Family";
      } else if (grade >= 80) {
         letterGrade = "Master";
      } else if (grade >= 70) {
         letterGrade = "C";
      } else if (grade >= 60) {
         letterGrade = "D";
      } else if (grade >= 0) {
         letterGrade = "F";
      } else
         System.out.println("Didn't recognize input.");
      System.out.println("Family grade of " + grade + " is a " + letterGrade + ".");
   }
}