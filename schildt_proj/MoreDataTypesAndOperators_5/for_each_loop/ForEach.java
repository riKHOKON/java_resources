package schildt_proj.MoreDataTypesAndOperators_5.for_each_loop;

import java.util.Random;

/**
 * Created by ri on 1/22/17.
 */
public class ForEach {
    public static void main(String args[]){
        Random rn = new Random();


        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        System.out.println("Contents of nums:");
        for (int x:nums){ // this is a for each style loop
            System.out.print(x+" ");
            sum += x;
        }
        System.out.println();
        System.out.println("Sum of the array :"+sum);
        System.out.println();


        int numbers[] = new int[100];
        for (int i = 0;i < numbers.length;++i){
            numbers[i] = rn.nextInt(100);
        }
        System.out.println("This is for numbers array.");
        System.out.println("Contents of the numbers of only first 10 elements is:");
        for (int x:numbers){
            sum += x;
            if (x == 10)break;
            System.out.print(x+" ");
        }
        System.out.println("Sum is : "+sum);
    }
}
