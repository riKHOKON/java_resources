package java_basic.decision_making;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		
		Scanner inputString = new Scanner(System.in);
		
		User users[] = new User[3];
		users[0] = new User("ri","123");
		users [1] = new User("arif","112");
		users [2] = new User("rubel","232");
		System.out.println("User List :");
		for(int i = 0;i < users.length;++i)
			users[i].showInfo();
		
		/*
		 * Login 
		 * */
		String reqUserName;
		String reqPassword;
		System.out.printf("Enter username :");
		reqUserName = inputString.nextLine();
		System.out.printf("Enter password :");
		reqPassword = inputString.nextLine();
		
		isValid(reqPassword,reqUserName,users);
		
		
		
	}
	public static boolean isValid(String p,String n,User[] users){
		for(int i = 0;i < users.length;++i){
			if(users[i].getUsername() == n && users[i].getPassword() == p){
				return true;
			}		
		}
		return false;
	} 
}
