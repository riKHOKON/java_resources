package java_basic.overloading;

public class Adder {

	static int add(int a,int b){return a+b;}
    static double add(double a,double b){return a+b;}
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));//ambiguity
    }
}