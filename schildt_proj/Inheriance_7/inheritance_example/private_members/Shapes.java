package schildt_proj.Inheriance_7.inheritance_example.private_members;
/**
 * Created by ri on 1/28/17.
 */
public class Shapes {
    public static void main(String args[]){

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        TwoDShape shape = new TwoDShape();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "outlined";

        System.out.println("Info for t1 : ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is :"+t1.area());
        System.out.println();
        System.out.println("Info for t2 : ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is :"+t2.area());
        System.out.println();

    }
}
