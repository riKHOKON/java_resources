package java_basic.arraylist;

import java.util.ArrayList;

/**
 * Created by RI on 4/11/2017.
 */
public class MyArrayList {
    public static void main(String args[]){
        int total = 0;
        double average= 0;

        int     grade1 = 50,
                grade2 = 60,
                grade3 = 20,
                grade4 = 30,
                grade5 = 40;
        total = grade1 + grade2 + grade3 + grade4 + grade5;
        average = total / 5;
        System.out.println("Average is : "+average);

        /*
        * We can do this using array list which helps
        * to save the memory as there is only one variable declared
         * */
        total = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(60);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        for (int i = 0;i < numbers.size();++i)
            total += numbers.get(i);
        System.out.println("Average is : "+total/numbers.size());

    }
}
