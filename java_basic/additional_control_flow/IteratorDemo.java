package java_basic.additional_control_flow;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for(int i = 1; i < 11; ++i)
         numbers.add(i);
      for(Iterator<Integer> n = numbers.iterator(); n.hasNext();) {
         int num = n.next();
         System.out.println(num);
      }
      for(int n : numbers)
         System.out.println(n);
   }
}