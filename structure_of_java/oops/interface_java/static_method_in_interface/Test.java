package structure_of_java.oops.interface_java.static_method_in_interface;

/**
 * Created by rashedulislam on 2/15/2017.
 */
public class Test implements Drawable{
    @Override
    public void print() {
        System.out.println("Printing......");
    }
    public static void main(String args[]){
        Test newTest=new Test();
        System.out.println("Using the static method and the cube of 3 is : "+Drawable.cube(100.5));
        System.out.println();
        newTest.print();
    }
}
