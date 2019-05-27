package schildt_proj.MoreDataTypesAndOperators_5;

/**
 * Created by ri on 1/21/17.
 * Using the array length member
 */
public class LengthDemo {
    public static void main(String args[]){
        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[][]= {    // a variable-length table
                            {1,2,3},
                            {4,5},
                            {6,7,8,9}
                        };
        System.out.println("Length of the list is : "+list.length);
        System.out.println("Length of the number is : "+nums.length);
        System.out.println("Length of the table is : "+table.length);
        System.out.println("Length of the table[0] is "+table[0].length);
        System.out.println("Length of the table[1] is "+table[1].length);
        System.out.println("Length of the table[2] is "+table[2].length);
        // using length to initialize the list
        for (int i = 0; i < list.length; ++i)
            list[i] = i * i;
        System.out.println("Here is the list :");
        for (int i = 0; i < list.length; ++i)
            System.out.print(" "+list[i]);
        System.out.println();

    }
}
