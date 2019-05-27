package java_basic.inheritance;

public class Tester2 {

	public static void main(String[] args) {
		Object anObject = new Employee("KHOKON",3000);
		System.out.println("Type of anObject: "+anObject.getClass().getName());
		//Employee e1 = (Employee) anObject; casting
		System.out.println(((Employee) anObject).getEmpInfo());
	}

}
