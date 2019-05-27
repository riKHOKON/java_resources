package structure_of_java.control_statements.worm_up.solutions.bubble_sort;

/**
 * Created by ri on 1/21/17.
 * Demonstrate th bubble sort
 */
public class Bubble {
    public static void main(String args[]){
        int numbers[] = {99,-10,100123,18,-978,
                            5623,463,-9,287,49};

        int a, b, t;
        int size = numbers.length;
        //System.out.println(size);
        // display the original array
        System.out.println("Original array is :");
        for (int i = 0; i < size; ++i)
            System.out.print(" "+numbers[i]);
        System.out.println();

        // this is the bubble sort
        for (a = 1; a < size; ++a) {
            for (b = size - 1; b >= a; --b) {
                if (numbers[b - 1] > numbers[b]) {
                    // if out of order.......exchange elements
                    t = numbers[b - 1];
                    numbers[b - 1] = numbers[b];
                    numbers[b] = t;
                }
            }
        }
        // display the sorted array
        System.out.println("Sorted array is :");
        for (int i = 0; i < size; ++i)
            System.out.print(" "+numbers[i]);
        System.out.println();
    }
}
