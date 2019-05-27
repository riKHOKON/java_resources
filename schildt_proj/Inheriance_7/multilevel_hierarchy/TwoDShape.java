package schildt_proj.Inheriance_7.multilevel_hierarchy;

/**
 * Created by ri on 1/28/17.
 * A simple class hierarchy
 * A class for two dimensional shape
 */
public class TwoDShape {

    double width,
            height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public TwoDShape(){
        width = height = 0;
    }
    public TwoDShape(double x){
        width = height = x;
    }
    void showDimension(){
        System.out.println("Width and Height are "+width+" "
        +"and  "+height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
