package schildt_proj.self_test;

/**
 * Created by rashedulislam on 22-12-16.
 */
public class PrimeNumber {
    public static void main(String args[]){
      int i,j;
      for (i = 2;i < 100;i++){
          boolean isPrime = true;
          // see if the number evenly divisible
          for (j = 2;j <= i/j;j++){
              if (i%j == 0)isPrime =false;
          }
          if (isPrime) System.out.println(i+" is prime number.");
      }
    }
}
