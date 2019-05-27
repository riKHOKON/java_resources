package java_basic.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by RI on 4/12/2017.
 */
public class SearcingArrayListAndSorting {
    public static void main(String args[]){

        ArrayList<Integer> numbers = new ArrayList<>();
        buildArrayList(numbers,10);
        System.out.println("Un-sorted numbers :");
        displayArrayList(numbers);
        System.out.println("Sorted numbers :");
        sortArrayList(numbers);
        displayArrayList(numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("rashedul");
        names.add("arif");
        names.add("samol");
        names.add("komol");
        names.add("bimol");

        displayArrayList(names);
        sortArrayList(names);
        displayArrayList(names);

    }
    static void buildArrayList(ArrayList arr,int size){
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; ++i)
            arr.add(rand.nextInt(101));
    }
    static void displayArrayList(ArrayList num){
        for (int i= 0; i < num.size(); ++i)
            System.out.print(num.get(i)+"\t");
        System.out.println();
    }
    static void sortArrayList(ArrayList arr){
        Collections.sort(arr);
    }
}
