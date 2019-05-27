package schildt_proj.recursion_by_my_own.arraylist;

import java.util.Random;
import java.util.ArrayList;

public class MinOfArrayList {
   public static void main(String[] args) {
      Random rand = new Random(System.currentTimeMillis());
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for(int i = 0; i < 100; ++i)
         numbers.add(rand.nextInt(101));
      /*if (numbers.contains(100))
         System.out.println("100 was found at position " + numbers.indexOf(100));
      else
         System.out.println("100 was not found in numbers.");*/
      int min = 0;// note min just returns the position of the minimum number index.
      for(int i = 1; i < numbers.size(); ++i) 
         if (numbers.get(i) < numbers.get(min))
            min = i;
      System.out.println("The minimum value in numbers is " + numbers.get(min));
   }
}