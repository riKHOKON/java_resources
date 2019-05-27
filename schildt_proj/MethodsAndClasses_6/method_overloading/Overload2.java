package schildt_proj.MethodsAndClasses_6.method_overloading;

/**
 * Created by ri on 1/25/17.
 * Automatic type conversion can affect
 * overloaded method resolution
 */
class Overload2 {

    void f(byte x){
        System.out.println("Inside f(byte): "+x);
    }
    void f(int x){
        System.out.println("Inside f(int): "+x);
    }
    void f(double x){
        System.out.println("Inside f(double): "+x);
    }
}
