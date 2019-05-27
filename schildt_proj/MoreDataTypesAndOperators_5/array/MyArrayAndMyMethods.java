package schildt_proj.MoreDataTypesAndOperators_5.array;
import java.util.Random;

/**
 * Created by ri on 1/24/17.
 * Let's have a look on some issues
 */
public class MyArrayAndMyMethods {
    public static void main(String args[]){
        final int size = 100;
        int arr[] = new int[size];
        buildArray(arr,size);
        display(arr);
        System.out.println("Sum of the array : "+sumArray(arr));
    }
    static void buildArray(int arr[],int size){
        Random rn = new Random(System.currentTimeMillis());
        for (int i = 0; i < size; ++i)
            arr[i] = rn.nextInt(101);
    }
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
        System.out.println();
    }
    static int sumArray(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }
}
