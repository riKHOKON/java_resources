package java_basic.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by RI on 4/11/2017.
 */
public class PassArrayListAsMethodArgument {

    /*
    * passing arraylist as method argument and accessing
    * targeted element and changing it
    * to do this we use set() method and accessed the element index.
    * */
    public static void main(String args[]){
        Random number = new Random(System.currentTimeMillis());
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0;i < 10;++i)
            grades.add(number.nextInt(100));
        
        displayArrayList(grades);
            int newNumber = 64;
        modifyArrayList(grades,3,newNumber);
        displayArrayList(grades);
        sortArrayList(grades);
        displayArrayList(grades);

    }
    static void displayArrayList(ArrayList numbers){
        for (int i= 0; i < numbers.size(); ++i)
            System.out.print(numbers.get(i)+"\t");
        System.out.println();
    }
    static void modifyArrayList(ArrayList arr,int index,int num){
        arr.set(index,num);
    }
    static void sortArrayList(ArrayList arr){
        Collections.sort(arr);
    }
}
