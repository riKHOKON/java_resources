package array.com.ri;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by RI on 6/11/2017.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int arr[] = buildArray(5);
        printArray(arr);
        System.out.println("Average is : "+average(arr));
        System.out.println("Sorting this array.");
        sortIntArary(arr);
        System.out.println("Sorted array : ");
        printArray(arr);
        System.out.println("Now sorting to descending order.");
        int[] newArray = sortToDescendingOrder(arr);
        printArray(newArray);


    }

    static int[] buildArray(int size){
        System.out.println("Enter "+size+" integer number for new array.\r");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.println("Index "+i+" contains number : "+arr[i]);
    }
    static int[] sortToDescendingOrder(int[] arr){
//        int[] sortedArray = new int[arr.length];
//        for (int i = 0; i <arr.length ; i++)
//            sortedArray[i] = arr[i];
        int[] sortedArray = Arrays.copyOf(arr,arr.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }

    @Contract(pure = true)
    static double average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double)arr.length;
    }

    static void sortIntArary(int[] arr){
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
}
