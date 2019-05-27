package schildt_proj.ControlStatements_3;

/**
 * Created by rashedulislam on 22-12-16.
 * we can use comma and double loop control variable
 */
public class CommaInAForStatement {
    public static void main(String argsp[]){
        int i,j;
        for (i = 0,j = 10;i < j;i++,--j){
            System.out.println("i and j are :"+i+" "+j);
        }
    }
}
