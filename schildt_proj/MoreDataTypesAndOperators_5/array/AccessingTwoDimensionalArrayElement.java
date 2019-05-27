package schildt_proj.MoreDataTypesAndOperators_5.array;

import java.util.Random;

/**
 * Created by ri on 1/24/17.
 * NOTE : in each row we store record a student's history.
 */
public class AccessingTwoDimensionalArrayElement {
    public static void main(String args[]){
        final int rows = 5,
                    cols = 5;
        int max = 90;
        int min = 50;
        int [][] grades = new int[rows][cols];
        Random random = new Random(System.currentTimeMillis());
        int total = 0;
        double average = 0;
        for (int r = 0; r < rows;++r)
            for (int c = 0; c < cols;++c)
                grades[r][c] = random.nextInt((max-min+1))+min;
        for (int r = 0; r < rows;++r) {
            System.out.print("Student " + (r+1)+" :");
            for (int c = 0; c < cols; ++c){
                System.out.print(grades[r][c]+" ");
                total += grades[r][c];
            }
            System.out.print(" total is :"+total);
            System.out.print(" average is :"+total/cols);
            total = 0;
            average = 0;
            System.out.println();
        }
    }
}
