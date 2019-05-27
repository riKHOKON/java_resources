package schildt_proj.MethodsAndClasses_6.method_overloading;

/**
 * Created by ri on 1/25/17.
 */
public class TypeConversion {
    public static void main(String args[]){
        Overload2 ob = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5f;

        // let's call the methods
        ob.f(i); // calls f(int)
        ob.f(d); // calls f(double)
        ob.f(b); // no type conversion.
        //ob.f(b); // calls f(int) - type conversion
        ob.f(f); // calls f(double) - type conversion
        ob.f(s); // calls f(int) - type conversion
    }
}
