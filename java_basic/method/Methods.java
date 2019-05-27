package java_basic.method;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String user = "KHOKON";
		displayMessage(user);
		System.out.println("2 power 3 is "+qubicPowerValue(2));
		System.out.println(acceleration(10,1,100));
		
		int a = 3;
		int v1 = 10;
		int s = 60;
		String currentVelocity;
		currentVelocity = velocity(a,v1,s);
	
		System.out.println("Velocity : "+currentVelocity);

	}
	public static void displayMessage(String userName){
		System.out.println("Welcome!"+userName);
	}
	public static int qubicPowerValue(int number){
		int result;
		result = number * number * number;
		return result;
	}
	public static int acceleration(int currentVelocity,int startingVelocity,int time){
		int a = 0;
		a = (currentVelocity - startingVelocity) / time;
		return a;
	}
	public static String velocity(int a,int startingVelocity,int distance ){
		
		String result = "";
		double value;
//		int currentVelocity;
		value = Math.sqrt((startingVelocity * startingVelocity) + 2 * a * distance);
		return result+value+" m/s-1"; 
	}

}
