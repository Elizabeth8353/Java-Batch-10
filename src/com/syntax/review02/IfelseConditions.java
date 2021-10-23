package com.syntax.review02;

import java.util.Scanner;

public class IfelseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String user="Sharif";
String pass="pass123";

Scanner scan=new Scanner(System.in);
System.out.println("Please enter User");
String var=scan.nextLine();
System.out.println("please enter password");
String var2=scan.nextLine();

if(user.equals(var)) {
	if(pass.equals(var2)) {
		System.out.println("Your signed in!!");
	}else {
		System.out.println("user name correct but password isn't");
	}
	
}else {
	System.out.println("invalid UserName");
}
	


	}

}
