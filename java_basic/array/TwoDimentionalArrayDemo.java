package java_basic.array;

import java.util.Random;

public class TwoDimentionalArrayDemo
{
   public static void main(String[] args)
   {
//      final int rows = 5;
//      final int cols = 5;
//      Random rand = new Random(System.currentTimeMillis());
//      int[][] numbers = new int[rows][cols];
//      for(int r = 0; r < rows; ++r)
//         for(int c = 0; c < cols; ++c)
//            numbers[r][c] = rand.nextInt(101);
//
//      PassingArrayToMethod.display2DArr(numbers,rows,cols);
//
//
//      //int[][] nums = {{10,20,30,40}, {20,30,40,50}, {30,40,50,60}};

      int rows  = 5;
      int cols = 3;
      int numbers  [][] = new int[rows][cols];

      Random rand = new Random();
      for(int r = 0; r < rows;r++)
         for (int c = 0;c < cols;c++)
            if (r == 0 || r == 2){
               numbers[r][c] = rand.nextInt(100);
               if (numbers[r][c] %2 != 0)
                  numbers[r][c] = numbers[r][c]-1;
            }else{
               numbers[r][c] = rand.nextInt(500);
            }


      int sum = 0;
      for(int r = 0; r < rows;r++){
         for (int c = 0;c < cols;c++) {
            System.out.print(numbers[r][c]+"\t");
            sum+=numbers[r][c];
         }
         System.out.println();
      }
      System.out.println("The sum is "+sum);







   }
}