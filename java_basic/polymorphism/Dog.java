package java_basic.polymorphism;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}
	public void bark(){
		System.out.println("Dog's sound is mue ghaw ghaw.");
	}
}
