package schildt_proj.Inheriance_7.inheritance_example.private_members;
/**
 * Created by ri on 1/28/17.
 * subclass of TwoDShape
 */
public class Triangle extends TwoDShape {
    String style;

//    public Triangle(double v, double v1, String outlined) {
//        super();
//    }

    /* private members can't be inherited.
    to avoid this situation we can use accessor methods to access those private
    members
    */

    double area(){
        //return width * height / 2; as the members are private
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is "+style);
    }
}
