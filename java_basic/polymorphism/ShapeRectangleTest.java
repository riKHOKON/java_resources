package java_basic.polymorphism;

public class ShapeRectangleTest {

	public static void main(String[] args) {
		//Shape s1 = new Shape(10,10); shape is abstract.
		Rectangle r1 = new Rectangle(10,200,5,8);
		Circle c1 = new Circle(50,50,10);
		//s1.draw();
		System.out.println();
		r1.draw();
		System.out.println();
		c1.draw();
	}

}
