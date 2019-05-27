package schildt_proj.MoreDataTypesAndOperators_5.array;

import java.util.Random;

/**
 * Created by ri on 1/24/17.
 * Sample String array
 */
public class StringArray {
    public static void main(String args[]){


        Random rn = new Random();
        String [][] names = new String[10][20];
        for (int row = 0;row < 10;++row)
            for (int col = 0; col < 20;++col)
                names[row][col] = " "+(char)rn.nextInt(23);
        display(names);
    }
    static void display(String[][] arr){
        for (int row = 0;row < 10;++row)
            for (int col = 0; col < 20;++col)
                System.out.print(arr[row][col]);
        System.out.println();
    }
}
