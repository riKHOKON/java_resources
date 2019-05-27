package java_basic.polymorphism;

public class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name, age);
	}
	public void bark(){
		System.out.println("cat's sound is mue mue.");
	}
	
}
