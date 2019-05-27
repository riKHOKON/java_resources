package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 23-12-16.
 * Demonstrate do while loop
 */
public class DoWhileDemo {
    public static void main(String args[])
        throws java.io.IOException{
            char ch;
            do {
                System.out.println("Press a key followed by ENTER:");
                ch = (char)System.in.read();
            }while (ch != 'q');
    }
}
