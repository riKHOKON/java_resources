package java_basic.decision_making;
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

public class IfElseTest3
{
   public static void main(String[] args)
   {
      int grade;
      String letterGrade = "";
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a grade: ");
      grade = input.nextInt();
      if (grade >= 90) {
         letterGrade = "A";
      } else if (grade >= 80) {
         letterGrade = "B";
      } else if (grade >= 70) {
         letterGrade = "C";
      } else if (grade >= 60) {
         letterGrade = "D";
      } else if (grade >= 0) {
         letterGrade = "F";
      } else
         System.out.println("Didn't recognize input.");
      System.out.println("A grade of " + grade + " is a " + letterGrade + ".");
   }
}