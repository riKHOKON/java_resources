package schildt_proj.MoreDataTypesAndOperators_5.array_list;

import java.util.*;

/**
 * Created by ri on 1/24/17.
 * Array-list is like a container that contains same type of data
 * and arrange it into index order just like array does
 */
public class ArrayListDemo {


    public static void main(String args[]){
        /*
        * Declaration technique of array-list
        * */
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> doubleNumbers = new ArrayList<Double>();
        /*
         *  ArrayList<Person> persons = new ArrayList<Person>();
          *  Person is a user defined class.
         */
        final int size = 20;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        bulidAL(numbers,size);
        displayArrayList(numbers);
        System.out.println();
        System.out.println("Sum is : "+sumOfArrayList(numbers));
        System.out.println();
        System.out.println("Maximum is : "+numbers.get(maximumOfArrayList(numbers)));
        System.out.println("Minimum is : "+numbers.get(minimumOfArraylist(numbers)));
        changeArryListValues(numbers,10);
        displayArrayList(numbers);
        System.out.println("Maximum is : "+numbers.get(maximumOfArrayList(numbers)));
        System.out.println("Minimum is : "+numbers.get(minimumOfArraylist(numbers)));
        /*
         *  We can sort this kind of data structure
         *  using Collection class method
         */
        Collections.sort(numbers);
        System.out.println("The sorted form of the numbers:");
        displayArrayList(numbers);
        if (numbers.indexOf(12) >= 0)
            System.out.println("12 is found on position "+numbers.indexOf(12));

    }



    // creating an array-list
    static void bulidAL(ArrayList<Integer> arr,int size){
        Random rn = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; ++i)
            arr.add(rn.nextInt(101));
    }
    // display array list numbers
    static void displayArrayList(ArrayList arr){
        int count = 0;
        for (int i = 0; i < arr.size(); ++i) {
            System.out.print(arr.get(i) + " ");
            ++count;
           if (count == 10) {
               System.out.println();
               count = 0;
           }
        }
    }
    // calculate total of the array-list
    static int sumOfArrayList(ArrayList<Integer> arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); ++i)
            sum += arr.get(i);
        return sum;
    }
    /*
     * Find the maximum and minimum number of the array list
     *  Note: this method returns the index position of the maximum number
     */
    static int maximumOfArrayList(ArrayList<Integer>arr){
        int max = 0; // let number of position 0 be the maximum number
        for (int i = 0; i < arr.size(); ++i){
            if (arr.get(i) > arr.get(max)){
                max = i;
            }
        }
        return max;
    }
    static int minimumOfArraylist(ArrayList<Integer> arr){
        int min = 0;
        for (int i = 0; i < arr.size(); ++i){
            if (arr.get(i) < arr.get(min)){
                min = i;
            }
        }
        return min;
    }
    // change array list values
    static void changeArryListValues(ArrayList<Integer> arr,int amount){
        int value = 0;
        for (int i = 0; i < arr.size(); ++i){
            value = arr.get(i);
            arr.set(i,value+amount);
        }
    }
}
