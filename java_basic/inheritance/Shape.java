package java_basic.inheritance;

public class Shape {
	
	private double x;
	private double y;
	
	public Shape(double xcor, double ycor) {
		super();
		this.x = xcor;
		this.y = ycor;
	}
	public double getX() {
		return x;
	}
	public void setX(double xcor) {
		this.x = xcor;
	}
	public double getY() {
		return y;
	}
	public void setY(double ycor) {
		this.y = ycor;
	}
	public void set(double xcor,double ycor){
		setX(xcor);
		setY(ycor);
	}
	public void move(double x1, double y1){
		set(getX()+x1,getY()+y1);
	}
}
