package schildt_proj.MoreDataTypesAndOperators_5.array;

import java.util.Random;

/**
 * Created by ri on 1/21/17.
 * This is a two dimensional array
 */
public class TwoDimensionalArray {
    public static void main(String args[]){
        Random rn  = new Random(System.currentTimeMillis());
        final int rows = 5,
                    cols = 5;
        int table[][] = new int[rows][cols];
        // assigning values to table
        for (int r = 0; r < rows; ++r)
            for (int c = 0; c < cols; ++c)
                table[r][c] = rn.nextInt(101);
        // displaying the two dimensional array
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c)
                System.out.print(table[r][c] + " ");
            System.out.println();
        }

    }
}
