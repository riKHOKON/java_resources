package schildt_proj.MethodsAndClasses_6.recursion;

/**
 * Created by ri on 1/25/17.
 */
public class Recursion {
    public static void main(String args[]){

        Factorial f = new Factorial();
        System.out.println("Using recursive method:");
        System.out.println("FactorialWithoutRecursion of 3 is "+f.factR(3));
        System.out.println("FactorialWithoutRecursion of 4 is "+f.factR(4));
        System.out.println("FactorialWithoutRecursion of 5 is "+f.factR(5));
        System.out.println();
        System.out.println("Using iterative method:");
        System.out.println("FactorialWithoutRecursion of 3 is "+f.factI(3));
        System.out.println("FactorialWithoutRecursion of 4 is "+f.factI(4));
        System.out.println("FactorialWithoutRecursion of 5 is "+f.factI(5));

    }
}
