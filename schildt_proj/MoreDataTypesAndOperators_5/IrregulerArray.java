package schildt_proj.MoreDataTypesAndOperators_5;

/**
 * Created by ri on 1/21/17.
 */
public class IrregulerArray {
    /*
     *  When we declare an two dimensional array then we only have to
     *  specify the memory for the first leftmost dimension.We can allocate
     *  the rest further
     */
    public static void main(String args[]){
        int table[][] = new int [3][]; // look only the first leftmost memory is defined
        // now we allocate the rest
        table[0] = new int[4];
        table[1] = new int[3];
        table[2] = new int[10];
        /*
         *  Incomplete.....................as we can't
         *  assign data to the table at once.It's a
         *  problem.Sooner we would solve it
         */
        for (int i = 0;i < 4; i++)
            table[0][i] = i * 10;
        for (int i = 0;i < 3; i++)
            table[1][i] = i * 10;
        for (int i = 0;i < 10; i++)
            table[2][i] = i * 10;

        // displaying the whole table
        for (int i = 0;i < 4; i++)
            System.out.print(table[0][i]+" ");
        System.out.println();
        for (int i = 0;i < 3; i++)
            System.out.print(table[1][i]+" ");
        System.out.println();
        for (int i = 0;i < 10; i++)
            System.out.print(table[2][i]+" ");
        System.out.println();

        /*
         *   yes the solution is using the length member of the array
         *   let's put some data to it's array


            for (int i = 0;i < table.length; ++i){
                for (int j = 0; j < table[0].length;++j){
                     table[i][j] = i * 10;
                 }
                for (int j = 0; j < table[1].length;++j){
                    table[i][j] = i * 10;
                 }
                for (int j = 0; j < table[2].length;++j){
                    table[i][j] = i * 10;
                }
             }
        */


    }
}
