package java_basic.inheritance;

public interface Operation {
	public default double square(double number){
		return number * number;
	}
}
