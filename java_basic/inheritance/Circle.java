package java_basic.inheritance;

public class Circle extends Shape implements Operation{
	
	private double radious;

	public Circle(double xcor, double ycor, double radious) {
		super(xcor, ycor);
		setRadious(radious);
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	// area
	public double area(){	
		return  3.1416 * square(radious);
	}
}
