package schildt_proj.MoreDataTypesAndOperators_5.for_each_loop;

/**
 * Created by ri on 1/22/17.
 * We can use for each loop in two dimensional array
 */
public class ForEach2 {
    public static void main(String args[]){
        int sum = 0;
        int nums[][] = new int[3][5];
        // give some values to array
        for (int i = 0; i < nums.length; ++i)
            for (int j = 0; j < 5; ++j)
                nums[i][j] = (i+1) * (j+1);
        // now we can use for each loop to display the numbers
        for (int x[]:nums){
            for (int y:x){
                System.out.println("Value is : "+y);
                sum += y;
            }
        }
        System.out.println("The sum is : "+sum);
    }
}
