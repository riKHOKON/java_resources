package java_basic.polymorphism;

import java.util.ArrayList;

public class RealPolymorphismTest {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList();
		Rectangle r1 = new Rectangle(10,200,5,8);
		Circle c1 = new Circle(50,50,10);
		shapes.add(r1);
		shapes.add(c1);
		for(int i = 0;i < shapes.size();++i){
			shapes.get(i).draw();
		}
	}

}
