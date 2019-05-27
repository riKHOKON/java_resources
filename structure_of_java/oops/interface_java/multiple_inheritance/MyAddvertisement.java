package structure_of_java.oops.interface_java.multiple_inheritance;

/**
 * Created by rashedulislam on 2/15/2017.
 */
public class MyAddvertisement implements Drawable {
    @Override
    public void print() {
        System.out.println("Printing your add.");
    }
    @Override
    public void draw() {
        System.out.println("Drawing your career.");
    }
    public double area(){
        return 0.0;
    }

    // main method begans
    public static void main(String args[]){
        MyAddvertisement myadd=new MyAddvertisement();
        myadd.draw();
        System.out.println();
        myadd.print();
        System.out.println();
        int area=(int)myadd.area();
        System.out.println("And the area was "+area);
    }
}
