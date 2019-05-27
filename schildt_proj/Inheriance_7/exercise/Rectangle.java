package schildt_proj.Inheriance_7.exercise;
/**
 * Created by ri on 1/28/17.
 * A sub class of TwoDShape
 */
public class Rectangle extends Shape{
    private int  width,
                height;

    public Rectangle(int xcor,int ycor,int w,int h){
        super(xcor,ycor);
        width = w;
        height = h;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
