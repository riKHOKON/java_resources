package schildt_proj.MoreDataTypesAndOperators_5.array;

/**
 * Created by ri on 1/21/17.
 * Demonstrates one dimensional array
 */
public class ArrayDemo {
    public static void main(String args[]){
        //int sample[] = new int[10]; // array declaration
        int i = 0;
        // array can be initialized like this way
        int sample[] = {1,12,232,3423,121,34,4523,645,657,454};
        /*
        for (i = 0; i < sample.length; ++i)
            sample[i] = i * 2;
        */
        for (i = 0; i < sample.length; ++i)
            System.out.println("This is sample["+i+"] : "+sample[i]);
    }
}
