package schildt_proj.MethodsAndClasses_6.constructor_overloading;

/**
 * Created by ri on 1/25/17.
 */
class OverloadConstructorDemo {
    public static void main(String args[]){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2,4);

        System.out.println("t1.x : "+t1.x);
        System.out.println("t2.x : "+t2.x);
        System.out.println("t3.x : "+t3.x);
        System.out.println("t4.x : "+t4.x);
    }
}
