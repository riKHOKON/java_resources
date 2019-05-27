package java_basic.decision_making;

public class User {
	
	private String password;
	private String username;
	
	public User(String password, String username) {
		super();
		this.password = password;
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void showInfo(){
        System.out.printf(password+"\t");
        System.out.printf(username+"\t");
        System.out.println();
    }
	
}
