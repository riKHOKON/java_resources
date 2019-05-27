package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 23-12-16.
 * we also can declare loop control variable inside the for loop
 */
public class ForVariable {
    public static void main(String args[]){
        int sum = 0;
        int fact = 1;
        // compute the factorial of the numbers through 5
        for (int i = 1;i <= 5;++i){
            sum += i;
            fact *= i;
        }
        // i is unknown here
        System.out.println("Sum is : "+sum);
        System.out.println("FactorialWithoutRecursion is : "+fact);
    }
}
