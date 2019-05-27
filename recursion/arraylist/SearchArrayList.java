package recursion.arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by RI on 4/11/2017.
 * Searching for values
 */
public class SearchArrayList {
    // idexOf()
    //contains()
    public static void main(String args[]){
        Random rand = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10;++i)
            numbers.add(rand.nextInt(101));
//        if (numbers.indexOf(100) >=0)
//        if (numbers.contains(100))
//            System.out.println("100 is found on position :"+numbers.indexOf(100));
//        else
//            System.out.println("Number wasn't found.  ");
        System.out.println("Numbers are : ");
        for (int i = 0; i < numbers.size();++i)
            System.out.print(numbers.get(i)+" ");
        System.out.println();
        int min = 0;
        for (int i = 1; i < numbers.size();++i)
            if (numbers.get(i) < numbers.get(min))
                min = i;
        System.out.println("The minimum number is : "+numbers.get(min));
        System.out.println("The maximum number is : "+maximumOfAL(numbers));
    }
    static int maximumOfAL(ArrayList<Integer> arr){
        int maximum = 0; // this is just position.
        for (int i = 1; i < arr.size();++i)
            if (arr.get(i) > arr.get(maximum))
                maximum = i;
        return arr.get(maximum);
    }

}
