package structure_of_java.control_statements.for_loop;

/**
 * Created by ri on 2/5/17.
 */
public class SimpleForLoop {
    public static void main(String args[]){
        int sum=0;
        for (int i=1;i<=100;++i){
            if (i%2==0)
                System.out.println(i+" is even number.");
            else
                System.out.println(i+" is odd number.");
            sum+=i;
        }
        System.out.println("Total of the numbers "+sum);
    }
}
