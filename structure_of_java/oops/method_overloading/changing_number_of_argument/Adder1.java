package structure_of_java.oops.method_overloading.changing_number_of_argument;

/**
 * Created by ri on 2/11/17.
 */
public class Adder1 {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public static void main(String args[]){
        System.out.println(Adder1.add(5,5));
        System.out.println();
        System.out.println(Adder1.add(5,6,7,8));
    }
}
