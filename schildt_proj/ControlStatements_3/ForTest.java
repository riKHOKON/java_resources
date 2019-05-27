package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * Loop until S is typed
 */
public class ForTest {
    public static void main(String args[])
        throws java.io.IOException{
        int i;
        System.out.println("Press S to stop.");
        for (i = 0; System.in.read()!='S';++i ){
            System.out.println("Press # "+i);
        }
    }
}

