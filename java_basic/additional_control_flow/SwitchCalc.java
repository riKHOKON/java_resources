package java_basic.additional_control_flow;

public class SwitchCalc
{
   public static void main(String[] args) 
   {
      double n1, n2;
      n1 = 23;
      n2 = 11;
      System.out.println(calc(n1, n2, '+'));
      System.out.println(calc(n1, n2, '-'));
      System.out.println(calc(n1, n2, '*'));
      System.out.println(calc(n1, n2, '/'));
   }
   static double calc(double num1, double num2, char op) {
      /*if (op == '+')
         return num1 + num2;
      else if (op == '-')
         return num1 - num2;
      else if (op == '*')
         return num1 * num2;
      else if (op == '/')
         return num1 / num2;
      else
         return 0; */
      double result = 0.0;
      switch(op) {
         case '+':
            result = num1 + num2;
            break;
         case '-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         default:
            return 0;
      }
      return result;
   }
}