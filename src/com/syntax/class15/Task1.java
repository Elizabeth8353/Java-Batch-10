package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username="Sharif";
String password="pass12345";
String confirmPassword="pass12345";

if(!(username.isEmpty()||password.isEmpty())){
	System.out.println("User name and password are not empty");
	if(password.length()>=8) {
		if(!password.equals(username)) {
			if(password.equals(confirmPassword)) {
				System.out.println("Your username and password should be created ");
			}else {
				System.out.println("Password not match");
			}
		}else {
			System.out.println("Password cannot contain username");
		}
	}else {
		System.out.println("Password is to short");
	}
}else {
	System.out.println("User name and password cannot be empty");
}
	}

}
