package java_basic.polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Animal cat =  new Cat("jon",2);
		Dog dog = new Dog("Guddu",7);
		cat.bark();
		dog.bark();
		
	}

}
