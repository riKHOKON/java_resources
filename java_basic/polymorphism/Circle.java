package java_basic.polymorphism;

public class Circle implements Shape{
	
	
	private double x;
	private double y;
	private double radious;

	public Circle(double xcor, double ycor, double radious) {
		this.x = xcor;
		this.y = ycor;
		setRadious(radious);
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	public void draw(){
		System.out.println("Drawing circle at x : "+getX()+", y :"+getY()+", radious : "+getRadious());
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