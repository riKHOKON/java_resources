package structure_of_java.oops.interface_java.multiple_implementation_of_interface;

/**
 * Created by rashedulislam on 2/13/2017.
 */
public class Tester {
    public static void main(String args[]){
        Drawable circle=new Circle(4);
        System.out.println("area of the circle is: "+circle.area());
        System.out.println();
        circle.draw();

    }
}
