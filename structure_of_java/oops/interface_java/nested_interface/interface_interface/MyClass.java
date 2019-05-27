package structure_of_java.oops.interface_java.nested_interface.interface_interface;

/**
 * Created by rashedulislam on 2/15/2017.
 */
public class MyClass implements A,A.B {
    @Override
    public void print() {
        System.out.println("Printing...........");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    @Override
    public void draw() {
        System.out.println("Drawing...........");
    }
    //main method
    public static void main(String args[]) throws Throwable {
        MyClass me=new MyClass();
        me.print();
        System.out.println();
        me.draw();
        me.finalize();
    }
}
