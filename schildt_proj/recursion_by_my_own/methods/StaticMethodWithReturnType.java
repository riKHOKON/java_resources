package schildt_proj.recursion_by_my_own.methods;

public class StaticMethodWithReturnType {
   public static void main(String[] args) {
      int num = 12;
      System.out.println(num + " squared equals " + square(num));     
   }

   static int square(int number) {
      return number * number;
   }
}