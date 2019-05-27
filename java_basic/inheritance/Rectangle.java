package java_basic.inheritance;

public class Rectangle extends Shape{

	private double width;
	private double height;
	
	
	public Rectangle(double xcor, double ycor,double w,double h) {
		super(xcor, ycor);
			width = w;
			height = h;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area(){	
		return  .5 * width * height;
	}
}
