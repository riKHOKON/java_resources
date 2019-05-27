package java_basic.method.overloading;

public class Addre2 {

	static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.print("Returning the integer type method :");
        System.out.println(Addre2.add(5,5));
        System.out.println();
        System.out.print("Returning the double type method :");
        System.out.println(Addre2.add(5.7,11.2));

    }

}
