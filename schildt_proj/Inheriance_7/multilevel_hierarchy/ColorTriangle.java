package schildt_proj.Inheriance_7.multilevel_hierarchy;

/**
 * Created by RI on 5/28/2017.
 */
public class ColorTriangle extends  Triangle {

    private String color;

    public ColorTriangle(double width, double height, String style, String color) {
        super(width, height, style);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void showColor(){
        System.out.println("Color is : "+color);
    }
}
