package schildt_proj.Inheriance_7.inheritance_example;

/**
 * Created by ri on 1/28/17.
 * subclass of TwoDShape
 */
public class Triangle extends TwoDShape{

    private String style;


    Triangle(){
        super();
        style = "none";
    }

    Triangle(double width, double height,String style) {
        super(width, height, "Triangle");
        this.style = style;
    }
    Triangle(double x){
        super(x,"Triangle");
        this.style = "filled";
    }
    Triangle(Triangle ob){
        super(ob);
        this.style = ob.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle()
    {
        System.out.println("Triangle is "+style);
    }

}
