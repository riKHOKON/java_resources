package structure_of_java.oops.interface_java;

/**
 * Created by rashedulislam on 2/13/2017.
 */
public class MyClass implements Printable {
    @Override
    public void print() {
        System.out.println("Class name is 'MyClass'");
    }
    public static void main(String args[]){
        MyClass obj=new MyClass();
        obj.print();
    }
}
