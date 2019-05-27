package java_basic.classes_and_objects;

public class Date {
	// instance variables
	public int month;
	public int day;
	public int year;
	/*
	 * /
	 * @param month
	 * @param day
	 * @param year
	 */
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public Date(int month, int year) {
		super();
		this.month = month;
		this.year = year;
	}
	public Date(){
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}
	/*
	 * Setter and getter
	 * */
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	/*
	 * Other methods'
	 * */
	public String toString(){
		return month+"/"+day+"/"+year;
	}
}
