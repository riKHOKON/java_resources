package structure_of_java.oops.interface_java.multiple_inheritance;

/**
 * Created by rashedulislam on 2/13/2017.
 */
public interface Drawable extends Printable {
    void draw();
    double area();
    @Override
    void print();
}
