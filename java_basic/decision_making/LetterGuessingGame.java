package java_basic.decision_making;
import java.util.Scanner;

public class LetterGuessingGame
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      String answer = "Watson";
      String response = "";
      System.out.println("Let's play a guessing game. You get three tries.");
      System.out.print("What was the name of the computer that played on Jeopardy? ");
      response = input.nextLine();
      if (response.equals(answer))
         System.out.println("That's right!");
      else {
         System.out.print("Sorry. Guess again: ");
         response = input.nextLine();
         if (response.equals(answer))
            System.out.println("That's right!");
         else {
            System.out.print("Still not right. One more guess: ");
            response = input.nextLine();
            if (response.equals(answer))
               System.out.println("That's right!");
            else
               System.out.println("Wrong again. The answer is Watson.");
         }
      }
   }
}