package schildt_proj.Inheriance_7.inheritance_example.private_members;

/**
 * Created by ri on 1/28/17.
 * A simple class hierarchy
 * A class for two dimensional shape
 */
public class TwoDShape {

    private double width,
            height;

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

    void showDim(){
        System.out.println("Width and Height are "+width+" "
        +"and  "+height);
    }
}
