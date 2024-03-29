package schildt_proj.recursion_by_my_own.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PalindromeCheakingThroughBuildingArrayListOfString {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      String palindrome;
      System.out.print("Enter a word to test: ");
      palindrome = input.nextLine();
      ArrayList<String> p = new ArrayList<String>();
      buildAL(p, palindrome);
      if (isPalindrome(p))
         System.out.println(palindrome + " is a palindrome.");
      else
         System.out.println(palindrome + " is not a palindrome."); 
   }
   
   static void display(ArrayList arr) {
      for(int i = 0; i < arr.size(); ++i)
         System.out.print(arr.get(i));
      System.out.println();
   }

   static void buildAL(ArrayList pword, String word) {
      for(int i = 0; i < word.length(); ++i)
         pword.add(word.charAt(i) + "");
   }

   static boolean isPalindrome(ArrayList word) {
      ArrayList<String> rword = new ArrayList<String>();
      rword.addAll(word);
      Collections.reverse(rword);
      for(int i = 0; i < word.size(); ++i)
         if (!(rword.get(i).equals(word.get(i))))
            return false;
      return true;
   }
}