package schildt_proj.MethodsAndClasses_6.method_overloading;

/**
 * Created by ri on 1/25/17.
 */
public class OverloadDemo {
    public static void main(String args[]){

        Overload ob = new Overload();
        ob.ovlDemo();
        ob.ovlDemo(10);
        double x = ob.ovlDemo(101,11);
        System.out.println(x);
        System.out.println(ob.equals(ob));
    }
}
