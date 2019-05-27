package java_basic.additional_control_flow;

public class DoWhile
{
   /*
   do {
      set of statements;
   } while(relational expression);
 
   */
   public static void main(String[] args)
   {
      int number = 12;
      do {
         System.out.println(number);
         ++number;
      } while(number < 11); // (number <= 10)
   }
}