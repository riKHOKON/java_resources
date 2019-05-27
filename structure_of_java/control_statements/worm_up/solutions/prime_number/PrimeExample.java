package structure_of_java.control_statements.worm_up.solutions.prime_number;

import java.util.Scanner;

class PrimeExample{
  public static void main(String args[]){
      System.out.println("Prime number is that number which is only divide able by it's own or 1.");
   int i,m=0,flag=0;
   Scanner input=new Scanner(System.in);
   System.out.print("Enter the number to be checked.....:");
   int n=input.nextInt();//it is the number to be checked
   m=n/2;
   for(i=2;i<=m;i++){
    if(n%i==0){
    System.out.println("Number is not prime");
    flag=1;
    break;
   }    
  }    
  if(flag==0)    
    System.out.println("Number is prime");
 }
}  