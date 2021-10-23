package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String fname=input.nextLine();
		System.out.println("Please enter last name");
		String lname=input.nextLine();
		System.out.println("Please enter your city");
		String city=input.nextLine();
		System.out.println("Hello "+fname+" "+lname+" from "+city);
		
		/*
		 * next()-is used to capture a String value before space 
		 * nextLine()-is used to capture String Value (full Line including space)
		 */
		
	}

}
