package structure_of_java.control_statements.worm_up.solutions.factorial_of_numbers;

/**
 * Created by ri on 2/5/17.
 */
public class FactorialWithRecursion {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        int number=4;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }

}
