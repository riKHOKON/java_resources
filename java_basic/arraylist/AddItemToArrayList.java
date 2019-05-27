package java_basic.arraylist;

import java.util.ArrayList;

/**
 * Created by RI on 4/11/2017.
 * adding items in the array list
 */
public class AddItemToArrayList {
    public static void main(String args[]){
/*
* Methods used in this program are
* 1.size()
* 2.add()
* */
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Size of array list is :"+numbers.size());
        numbers.add(11);
        System.out.println("Size of array list is :"+numbers.size());
        for (int i = 0;i < 11; ++i)
            numbers.add(i);
        System.out.println("Size of array list is :"+numbers.size());
        System.out.println();
        for (int i = 0;i < numbers.size(); ++i)
            System.out.println(numbers.get(i));
    }
}
