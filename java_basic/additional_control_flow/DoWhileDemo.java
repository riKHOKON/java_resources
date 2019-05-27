package java_basic.additional_control_flow;

public class DoWhileDemo
{
   public static void main(String[] args) 
   {
      double balance, rate;
      int years = 0;
      balance = 150000;
      rate = 1.02;
      
      do {
//         balance = balance * rate;
         balance *= rate;
         ++years;
      } while (balance < 100000);
      System.out.println("It will take " + years + " years to reach $100,000.");
   }
}