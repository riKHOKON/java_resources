package schildt_proj.Inheriance_7.exercise;

/**
 * Created by ri on 1/29/17.
 */
public class Shape {
    private int x;
    private int y;

    public Shape(int xcor,int ycor){
        x = xcor;
        y = ycor;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void set(int xcor,int ycor){
        setX(xcor);
        setY(ycor);
    }
    public void move(int x1,int y1){
        set(getX()+x1,getY()+y1);
    }
}
