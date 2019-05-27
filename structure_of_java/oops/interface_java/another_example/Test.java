package structure_of_java.oops.interface_java.another_example;

/**
 * Created by rashedulislam on 2/13/2017.
 */
public class Test {
    public static void main(String args[]){
        Drawable circle=new Circle();
        circle.printing();
        System.out.println();
        Drawable rectangle=new Rectangle();
        rectangle.printing();
    }
}
