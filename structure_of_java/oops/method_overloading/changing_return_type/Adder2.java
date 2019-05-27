package structure_of_java.oops.method_overloading.changing_return_type;

/**
 * Created by ri on 2/11/17.
 */
public class Adder2 {

    static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.print("Returning the integer type method :");
        System.out.println(Adder2.add(5,5));
        System.out.println();
        System.out.print("Returning the double type method :");
        System.out.println(Adder2.add(5.7,11.2));

    }
}
