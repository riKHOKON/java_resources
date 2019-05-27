package schildt_proj.Inheriance_7.inheritance_example;

/**
 * Created by ri on 1/28/17.
 * A sub class of TwoDShape
 */
public class Rectangle extends TwoDShape{

    Rectangle(){
        super();
    }
    Rectangle(double w, double h){
        super(w,h,"Rectangle");
    }
    Rectangle(double x){
        super(x,"Rectangle");
    }
    Rectangle(Rectangle ob){
        super(ob);
    }

    boolean isSquare(){
        if (getWidth() == getHeight())return true;
        else return false;
    }
    double area(){
        return getWidth() * getHeight();
    }
}
