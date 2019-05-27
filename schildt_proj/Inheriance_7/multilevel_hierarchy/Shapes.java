package schildt_proj.Inheriance_7.multilevel_hierarchy;

/**
 * Created by ri on 1/28/17.
 */
public class Shapes {

    public static void main(String args[]){


        ColorTriangle t1 = new ColorTriangle(8.0,9.0,"outlined","Blue");
        ColorTriangle t2 = new ColorTriangle(2.0,2.0,"filled","Red");

        System.out.println("Information for t1 : ");
        t1.showStyle();
        t1.showDimension();
        t1.showColor();
        System.out.println("Area of t1 is : "+t1.area());
        System.out.println();
        System.out.println("Information for t2 : ");
        t2.showStyle();
        t2.showDimension();
        t2.showColor();
        System.out.println("Area of t2 is : "+t2.area());


    }
}
