package structure_of_java.oops.this_keyword;

/**
 * Created by ri on 2/8/17.
 */
public class A {
    /* we can call parametrized constructor through default
        constructor*/
    A(){
        this(5);
        System.out.println("inside default constructor");
    }
    A(int x){
        System.out.println(x+" is initialized through default constructor");
    }

    public static void main(String args[]){
        A a=new A();
    }
}
