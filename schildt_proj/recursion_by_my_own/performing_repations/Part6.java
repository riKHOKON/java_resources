package schildt_proj.recursion_by_my_own.performing_repations;

public class Part6 {
   public static void main(String[] args) {

      double balance = 5000;
      double rate = 1.02;
      
      for(int i = 1; i <= 10; ++i) {
         balance *= rate;
      }
      System.out.println("The balance after 10 years is " + balance);
   }
}