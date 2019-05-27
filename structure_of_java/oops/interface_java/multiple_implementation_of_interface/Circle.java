package structure_of_java.oops.interface_java.multiple_implementation_of_interface;

/**
 * Created by rashedulislam on 2/13/2017.
 */
public class Circle implements Drawable {
    int radius;
    Circle(int r){
        radius=r;
    }
    @Override
    public double area() {
        return 2*3.1416*radius*radius;
    }
    @Override
    public void draw() {
        System.out.println("Just drawing the circle.");
    }
}
