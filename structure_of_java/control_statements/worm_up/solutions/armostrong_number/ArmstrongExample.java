package structure_of_java.control_statements.worm_up.solutions.armostrong_number;

import java.util.Scanner;

class ArmstrongExample{
  public static void main(String[] args)  {  
    int c=0,a,temp;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number. ");
    int n=input.nextInt();//It is the number to check armstrong
    temp=n;  
    while(n>0) {
      a=n%10;
      n=n/10;
      c=c+(a*a*a);
    }  
    if(temp==c)  
      System.out.println(temp+" is an armstrong number");
    else  
      System.out.println(temp+" is not armstrong number");
   }  
}  