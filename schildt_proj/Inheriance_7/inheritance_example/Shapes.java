package schildt_proj.Inheriance_7.inheritance_example;

/**
 * Created by ri on 1/28/17.
 */
public class Shapes {

    public static void main(String args[]){

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();



        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.setStyle("filled");

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.setStyle("outlined");

        System.out.println("Info for t1 : ");
        t1.showStyle();
        t1.showDimension();
        System.out.println("Area is :"+t1.area());
        System.out.println();
        System.out.println("Info for t2 : ");
        t2.showStyle();
        t2.showDimension();
        System.out.println("Area is :"+t2.area());
        System.out.println();


    //can't be instanciated as it has become abstract class
//        TwoDShape shape = new TwoDShape();
//        shape.setHeight(10.0);
//        shape.setWidth(10.0);
//        shape.showDimension();


    }
}
