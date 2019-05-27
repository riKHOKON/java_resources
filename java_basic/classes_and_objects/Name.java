package java_basic.classes_and_objects;

public class Name {
	
	private String fristName;
	private String middleName;
	private String lastName;

	/*
	 * constructor
	 * */
	public Name(String fristName, String middleName, String lastName) {
		super();
		this.fristName = fristName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	public Name(String fristName) {
		super();
		this.fristName = fristName;
	}

	/*
	 * setter and getter
	 * */
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getMiddleName() {
		return middleName; 
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	/*
	 * Other methods
	 * */
	public String displayName(){
		return fristName+" "+middleName+" "+lastName;
	}
	
	public String getInitials(){
		return fristName.substring(0,1)+middleName.substring(0,1)+
				lastName.substring(0,1);
	}
	public String toString(){
		return fristName+" "+middleName+" "+lastName;
	}
	/*
	 * main method
	 * */
	public static void main(String args[]){
		Name myName = new Name("Rashedul","Islam","Khokon");
		Name youName = new Name("Arif");
		System.out.println(myName.displayName());
		System.out.println(youName.displayName());
		//System.out.println(youName.getInitials());
	}
}
