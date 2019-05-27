package java_basic.frist_Program;

public class Welcome {

	public static void main(String[] args) {
		String user = "KHOKON";
		// note: Java Program always begins from main method.
		displayMessage(user);
	}
	public static void displayMessage(String userName){
		System.out.println("Wlecome to Java Programming. "+userName);
	}

}
