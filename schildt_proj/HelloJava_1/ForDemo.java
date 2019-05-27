package schildt_proj.HelloJava_1;

/**
 * Created by rashedulislam on 12/21/2016.
 * Demonstrating for loop
 */
public class ForDemo {
    public static void main(String args[]){
        int counter = 0;
        int sum = 0;
        /*
        * There are two key points to know >>>>>
        * for loop uses a variable called loop var and there is a block of for loop
        * where if does some thing each time the bloch is entered by the loop variable
        * validation...>>>>>
        * In this case we are gonna count the even number's summation.
        **/
        for (counter = 0;counter <= 10;++counter){
            if(counter % 2 == 0) sum += counter;
        }
        System.out.println("sum of even number is :"+sum);
    }
}
