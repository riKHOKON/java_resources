package java_basic.input_output;

public class FormatingOutput {

	public static void main(String[] args) {
//		System.out.print("Hello, world!\n");
//		System.out.print("Day1\tDay2\tDay3\tDay4");
	
		
		final double PI = 3.14159263;
		System.out.printf("pi = %.4f",PI);
		System.out.println();
		System.out.printf("pi = %10.5f",PI);
		System.out.println();
		System.out.printf("pi = %20.6f",PI);
		
	// see the specialty of the printf() method. 	
	}

}
