package java_basic.classes_and_objects;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date(4,24,2017);
		Date tomorrow = new Date(4,25,2017);
		System.out.println("Today is : "+today.toString());
		System.out.println("Tomorrow is : "+tomorrow.toString());
		tomorrow.setDay(5);
		System.out.println("Tomorrow is : "+tomorrow.toString());
		System.out.println("Today is again "+today.getMonth()+"/"
				+today.getDay()+"/"+today.getYear());
	}

}
