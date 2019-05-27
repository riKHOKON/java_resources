package java_basic.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ri on 3/7/2017.
 */
public class ArrayDemo {
    public static void main(String args[]){

        Random rand = new Random(System.currentTimeMillis());

        int []numbers = new int[10];
        for (int i = 0; i < numbers.length; ++i)
            numbers[i] = rand.nextInt(101);
        System.out.print("Unsorted order : ");
        viewNumbers(numbers);
//        sortNumbers(numbers);
        Arrays.sort(numbers);
        System.out.print("Sorted order : ");
        viewNumbers(numbers);
        System.out.println("average of numbers : "+average(numbers));
        System.out.println("Minimum of numbers : "+minimum(numbers));
        System.out.println("Maximum of numbers : "+maximum(numbers));
        System.out.println(Arrays.binarySearch(numbers,11));
        int toBeDeleted = 17;
        removeElement(numbers,toBeDeleted);
        viewNumbers(numbers);
    }

    static void viewNumbers(int [] arr){
        for (int n:arr)
            System.out.printf(" "+n);
        System.out.println();
//        for (int i = 0;i < arr.length;++i)
//            System.out.printf(" "+arr[i]);
//        System.out.println();
    }
    static void sortNumbers(int [] arr){
        int a, b, t, size;
        size= arr.length;
        for (a = 1; a < size; ++a) {
            for (b = size - 1; b >= a; --b) {
                if (arr[b - 1] > arr[b]) {
                    // if out of order.......exchange elements
                    t = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = t;
                }
            }
        }
    }
    static double average(int [] arr){
        double average;
        int total=0;
        for (int i = 0;i < arr.length;++i)
            total += arr[i];
        average = total/arr.length;
        return average;
    }
    static int minimum(int arr[]){
        int min, max;
        min = max = arr[0];
        for (int i = 0; i < arr.length;++i){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    static int maximum(int arr[]){
        int max;
        max = arr[0];
        for (int i = 0;i < arr.length;++i)
            if (arr[i] > max) max = arr[i];
        return  max;
    }
    static int [] removeElement(int arr[],int number){
        int position = Arrays.binarySearch(arr, number);
        for (int i = position;i < arr.length;++position)
            arr[i]= arr[i+1];
        return arr;
    }
}
