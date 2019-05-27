package schildt_proj.MoreDataTypesAndOperators_5.array;

import java.util.Random;

/**
 * Created by ri on 1/24/17.
 */
public class ArrayElementsAsCounter {
    public static void main(String args[]){
        final int size = 101 ;
        int [] numbers = new int[size];
        int [] distribution = new int[size];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0;i < size;++i)
            numbers[i] = random.nextInt(100-1+1)+1;
        for (int i = 0;i < size; ++i)
            ++distribution[numbers[i]];
        for (int i = 0;i < size;++i) {
            if ((i + 1) % 10 == 0) System.out.println();
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for (int i = 0;i < size; ++i)
            System.out.println("Number "+i+" occurs "+distribution[i]+" times.");
        showHistogram(distribution,size);
    }
    static void showHistogram(int arr[],int size){
        String stars = "";
        int totalStars = 0;
        for (int i = 0; i < size; ++i){
            totalStars = arr[i];
            for (int j = 1; j <=totalStars; ++j )
                stars += "*";
            System.out.println(i+" : "+stars);
            stars = "";
            totalStars = 0;
        }
    }
}
