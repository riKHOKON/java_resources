package schildt_proj.MoreDataTypesAndOperators_5.for_each_loop;

/**
 * Created by ri on 1/22/17.
 * For each loops are essentially read-only.
 */
public class NoChange {
    public static void main(String args[]){

        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int x:nums){ // this is a for each style loop
            System.out.print(x+" ");
            x = x * 10; // no change on numbers
        }
        System.out.println();
        for (int x :nums)
            System.out.print(x+" ");
        System.out.println();
    }
}
