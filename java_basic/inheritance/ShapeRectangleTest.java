package java_basic.inheritance;

public class ShapeRectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,200,5,8);
		System.out.println(r1.area());
//		System.out.println(r1.getX());
//		System.out.println(r1.getY());
//		System.out.println(r1.getHeight());
//		System.out.println(r1.getWidth());
		
		Circle c1 = new Circle(50,50,10);
		System.out.println(c1.area());
//		System.out.println(c1.getX());
//		System.out.println(c1.getY());
//		System.out.println(c1.getRadious());
	
	}

}
