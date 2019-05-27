package schildt_proj.Inheriance_7.multilevel_hierarchy;

/**
 * Created by ri on 1/28/17.
 * subclass of TwoDShape
 */
public class Triangle extends TwoDShape {

    String style;

    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    double area()
    {
        return width * height / 2;
    }
    void showStyle()
    {
        System.out.println("Triangle is "+style);
    }
}
