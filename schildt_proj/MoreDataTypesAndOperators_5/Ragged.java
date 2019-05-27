package schildt_proj.MoreDataTypesAndOperators_5;

/**
 * Created by ri on 1/21/17.
 * Manually allocate differing size second dimensions
 */
public class Ragged {
    public static void main(String args[]){

        int riders[][] = new int[7][];

        // here second dimensions are 10 elements long.
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        // but the last two dimensions are 2 elements long only.
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i, j ;
        // fabricate some fake data
        for (i = 0; i < 5; ++i)
            for (j = 0; j < 10; ++j)
                riders[i][j] = i + j + 10;
        // now for the rest two dimension fo the rest two
        for (i = 5; i < 7; ++i)
            for (j = 0; j < 2; ++j)
                riders[i][j] = i + j + 10;

        System.out.println("Riders per trip during the week");
        for (i = 0; i < 5; ++i) {
            for (j = 0; j < 10; ++j) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 5; i < 7; ++i) {
            for (j = 0; j < 2; ++j) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
    }
}
