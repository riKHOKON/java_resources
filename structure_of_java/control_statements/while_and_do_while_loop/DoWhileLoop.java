package structure_of_java.control_statements.while_and_do_while_loop;

/**
 * Created by ri on 2/5/17.
 */
public class DoWhileLoop {
    public static void main(String args[]){
        int i=0;
        int sum=0;
        do {
            if (i%2==0)
                System.out.println(i+" is even number.");
            else
                System.out.println(i+" is odd number.");
            sum+=i;
            ++i;
        }while(i<=100);
    }
}
