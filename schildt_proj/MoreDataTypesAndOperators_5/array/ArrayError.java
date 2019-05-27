package schildt_proj.MoreDataTypesAndOperators_5.array;

/**
 * Created by ri on 1/21/17.
 * Demonstrating array overrun
 */
public class ArrayError {
    public static void main(String args[]){
        int sample[] = new int[10]; // array declaration
        int i = 0;
        // generating an array overrun
        for (i = 0; i < 100; ++i)
            sample[i] = i;
    }
}
