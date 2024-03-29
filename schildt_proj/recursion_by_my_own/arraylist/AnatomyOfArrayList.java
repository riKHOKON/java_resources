package schildt_proj.recursion_by_my_own.arraylist;

import java.util.ArrayList;

public class AnatomyOfArrayList {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for(int i = 1; i < 11; ++i)
         numbers.add(i);
      int total = 0;
      for(int i = 0; i < numbers.size(); ++i)
         total += numbers.get(i); 
      System.out.println("The total is " + total);
      System.out.println("First element: " + numbers.get(0));
      System.out.println("Last element: " + numbers.get(numbers.size()-1));
      display(numbers);
   }

   static void display(ArrayList arr) {
      for(int i = 0; i < arr.size(); ++i)
         System.out.print(arr.get(i) + " ");
   }
}