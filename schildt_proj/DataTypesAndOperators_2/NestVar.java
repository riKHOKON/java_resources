package schildt_proj.DataTypesAndOperators_2;

/**
 * Created by rashedulislam on 12/21/2016.
 * Let's try to declare same named variable in different block in this class
 */
public class NestVar {
    public static void main(String args[]){
        int count = 0;
        for (count = 0;count < 10;++count) {
            System.out.println("This is count " + count);
            /*
            int count;
            for (count = 0;count < 3;++count){
                System.out.println("This program will not compile.");
            }
            */
        }
    }
}
