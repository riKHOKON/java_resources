package structure_of_java.control_statements.break_and_continue;

import java.util.Random;

/**
 * Created by ri on 2/5/17.
 */
public class BreakExample {
    public static void main(String args[]){
        for (int i=0;i<100;++i) {
            System.out.print(i + " ");
            if (i == 2) break;
        }
    }
}
