package com.syntax.homework14;

import java.util.Scanner;

public class UserSetUp {

	/*Accept username, password and confirm password from a user and 
	 * check following requirements:Username and Password cannot be  empty, if so -> message=”Username and Password cannot be empty”.
     *Password should be minimum 8 characters, if less ->message=”Password is too short”.
     *Password cannot contain username if so, -> message=”Password cannot contain username”.
     *Password should match confirmed password, if not  -> message=“Passwords do not match”.
     *Only after all requirements met -> message “Your username and password has been created”
	 */
	
	
	void userAndPassConfirmation(String user,String pass) {
	if(user.equals(" ")&&pass.equals(" "))	{
		System.out.println("user and password cannot be empty");
	}else if(pass.length()<8) {
		System.out.println("Password is too short");
	}else if(user.equalsIgnoreCase(pass)) {
		System.out.println("Password cannot contain User Name");
	}else if(!pass.equals("12345678")) {
		System.out.println("Password must match");
	}else {
		System.out.println("User & Password was Created ");
	}
	}
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	UserSetUp login=new UserSetUp();
	
	System.out.println("Please create your user and password");
	String user=scan.nextLine();
	String pass=scan.nextLine();
	login.userAndPassConfirmation(user,pass);
	
	
	
}
}
