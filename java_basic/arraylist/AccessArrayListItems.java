package java_basic.arraylist;

import java.util.ArrayList;

/**
 * Created by RI on 4/11/2017.
 */
public class AccessArrayListItems {
    public static void main(String args[]){
/*
* Methods used in this program are
* 1.size()
* 2.add()
* 3.get()
* */
        int total = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0;i < 11; ++i)
            numbers.add(i);
        System.out.println("Size of array list is :"+numbers.size());
        System.out.println();
        for (int i = 0;i < numbers.size(); ++i){
            total += numbers.get(i);
        }
        System.out.println("Total is : "+total);
        System.out.println("First element is :"+numbers.get(0));
        System.out.println("Last element is :"+numbers.get(numbers.size()-1));
    }
}
