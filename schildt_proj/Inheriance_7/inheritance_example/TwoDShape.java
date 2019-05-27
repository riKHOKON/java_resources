package schildt_proj.Inheriance_7.inheritance_example;

/**
 * Created by ri on 1/28/17.
 * A simple class hierarchy
 * A class for two dimensional shape
 */
 abstract class TwoDShape {

    private double width,
                   height;
    private String name;

    TwoDShape(){
        width = height = 0.0;
        name = "none";
    }
    TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }
    // creating a equal constructor
    TwoDShape(double x,String name){
        width = height = x;
        this.name = name;
    }
    // create from existing object
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    String getName() {
        return name;
    }
    void setWidth(double width) {
        this.width = width;
    }
    void setHeight(double height) {
        this.height = height;
    }
    void setName(String name) {
        this.name = name;
    }



    /*
    * custom methods begins
    * */
    void showDimension(){
        System.out.println("Width and Height are "+width+" "
        +"and  "+height);
    }
    double area(){
        System.out.println("area() must be overridden.");
        return 0;
    }
}
