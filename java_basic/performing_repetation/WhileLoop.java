
package java_basic.performing_repetation;

/*
while (relational expression) {
   loop body
}

*/
public class WhileLoop
{
   public static void main(String[] args)
   {
      int number = 1;
      while (number <= 10) {
         System.out.println(number);
         ++number;
      }
   }
}