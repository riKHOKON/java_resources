package schildt_proj.ClassesObjectsAndMethods_4;

/**
 * Created by ri on 1/21/17.
 * A simple constructor
 */
public class MyClass {
    int x;
    MyClass(){
        x = 10;
    }
    // Constructor with parameter
    MyClass(int i){
        x = i;
    }
    public static void main(String args[]){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(30);
        System.out.println(t1.x+" "+t2.x);
    }
}
