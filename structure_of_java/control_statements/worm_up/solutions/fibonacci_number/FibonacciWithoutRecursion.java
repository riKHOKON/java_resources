package structure_of_java.control_statements.worm_up.solutions.fibonacci_number;

/**
 * Created by ri on 2/5/17.
 */
public class FibonacciWithoutRecursion {
    public static void main(String agrs[]){
        // 0 and 1 is the fibonacci number
        int n1=0,
                n2=1;
        int n3;
        int range=10;
        System.out.print(n1+" "+n2+" and the series is ");
        for (int i=2;i<range;++i){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
