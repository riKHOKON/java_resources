package structure_of_java.control_statements.worm_up.solutions.fibonacci_number;

/**
 * Created by ri on 2/5/17.
 */
public class FibonacciWithRecursion {
    static int n1=0,n2=1,n3=0;

    public static void main(String args[]){
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            // this is recursion
            printFibonacci(count-1);
        }
    }

}
