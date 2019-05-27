package advanced_java_practices;

public class Test {

	public static void main(String[] args) {
		/*
		 * Creation of String
		 * */
		// direct way to create a string
		String name = "Rashedul Islam";
		String message = "Good afternoon budy!";
		// manipulating the string 
		System.out.println("Hello "+name+"!\n"+message);
		/*
		 * Another way to create String
		 * */
		char[] charArray = {'H','e','l','l','o'};
		String msg = new String(charArray);
		System.out.println(msg);
		/*
		 * Strings are immutable thus we can't change after it's creation
		 * Still we can modify the string using the StruingBuffer or StringBuilder class
		 * 			THE STRINGBUFFER CLASS AND IT'S METHODS
		 * */
		StringBuffer aString = new StringBuffer(name);
		aString.append(" Khokon");
		System.out.println(aString+"5");
		//aString.reverse();
		//System.out.println(aString);				
		aString.delete(21, 22);
		System.out.println(aString);
		aString.insert(8, "\t");
		System.out.println(aString);
		System.out.println(aString.indexOf("Rashedul"));
		aString.replace(8, 22," Ulipur");
		System.out.println(aString);
		System.out.println(aString.capacity());
		System.out.println(aString.charAt(4));
		System.out.println(aString.length());
		aString.setLength(20);
		System.out.println(aString.length());
		System.out.println(name.concat(", "+message));
		System.out.println("**********************************");
		System.out.println("\tFormated String");
		System.out.println("**********************************");
		/*
		 * Creation of formatted string
		 * */
		float afloat = 0.2f;
		int anInt = 5;
		
		String fs = String.format("The value of the float variable is "+
									"%.2f, while the value of the integer "+
									"variable is %d, and the string "+
									"is %s",afloat,anInt,name);
		System.out.println(fs);
		/*
		 * String methods >>>>>>>>>>>>
		 * */
		String first_name = new String("Rashedul");
		String last_name = new String("Islam");
		System.out.println(first_name.charAt(1));
		System.out.println(last_name.compareTo("Islam")); // if smiler then returns true that is 0. Note: it is case sensitive
		System.out.println(last_name.compareToIgnoreCase("islam"));
		System.out.println("Here is the trim method");
		System.out.println(last_name.trim());
	}

}
