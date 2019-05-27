package schildt_proj.MoreDataTypesAndOperators_5.for_each_loop;

/**
 * Created by ri on 1/22/17.
 * Search an array using for each loop
 */
public class Search {
    public static void main(String args[]){
        int nums[] = {3,5,2,5,354,232,65,45,7};
        int val = 3;
        boolean found = false;
        for (int x : nums){
            if (x == val)found = true;
            break;
        }
        if (found){
            System.out.println("Value found.");
        }else System.out.println("Not found.");
    }
}
