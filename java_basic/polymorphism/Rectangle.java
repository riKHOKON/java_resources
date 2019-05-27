package java_basic.polymorphism;

public class Rectangle implements Shape{

	private double x;
	private double y;
	private double width;
	private double height;
	
	
	public Rectangle(double xcor, double ycor,double w,double h) {
		this.x = xcor;
		this.y = ycor;
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
	public void draw(){
		System.out.println("Drawing rectangle at x:"+getX()+" , y : "+getY()
				+", width : "+getWidth()+", height : "+getHeight());
	}
	@Override
	public double getX() {
		return x;
	}
	@Override
	public void setX(double x) {
		this.x = x; 	
	}
	@Override
	public double getY() {
		return y;
	}
	@Override
	public void setY(double y) {
		this.y = y;
	}
	
}
