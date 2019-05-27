package recursion.method;

/**
 * Created by RI on 4/15/2017.
 */
public class MethodTest {
    public static void main(String args[]){
//        int f = 100;
//        //System.out.println(fToC(f));
//        increment(f);
//        System.out.println(f);
//        //increase(f);
//        f++;
//        System.out.println(f);

        int [] numbers = {12,3,121};
        incrementArray(numbers);
        System.out.println();
        for (int i : numbers)
            System.out.print(i+" ");

    }
    static int square(int number){
        return number * number;
    }
    static double fToC(double temp){
        double celcius;
        celcius = (temp - 32.0) * (5.0 / 9.0);
        return celcius;
    }
    static double cToF(double temp){
        double fahrenheit;
        fahrenheit = temp * (9.0 / 5.0) + 32.0;
        return fahrenheit;
    }
    static void increment(int number){
        ++number;
        System.out.println(number);
    }
    static int increase(int number){
        ++number;
        return number;
    }

    static void incrementArray(int [] arr){
        arr[0] = 31;
        for (int i : arr)
            System.out.print(i+" ");
    }
}
