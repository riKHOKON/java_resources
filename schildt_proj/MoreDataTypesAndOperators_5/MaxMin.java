package schildt_proj.MoreDataTypesAndOperators_5;

import java.util.Random;

/**
 * Created by ri on 1/21/17.
 * Finding maximum and minimum values in one dimensional array
 */
public class MaxMin {
    public static void main(String args[]){
        int numbers[] = new int[10];
        int min, max;

        Random rn = new Random();
        for (int i = 0; i < numbers.length; ++i)
            numbers[i] = rn.nextInt(100);
        for (int i = 0; i < numbers.length; ++i)
            System.out.println("This is sample["+i+"] : "+numbers[i]);

        min = max = numbers[0];

        for (int i = 0; i < numbers.length; ++i){
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        System.out.println("maximum number is "+max);
        System.out.println("minimum number is "+min);
    }
}
