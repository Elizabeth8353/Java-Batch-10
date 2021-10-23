package com.syntax.notes;

public class IfNoBraces {

	public static void main(String[] args) {
		// if you don't use the braces only one line belongs to if condititon
		// if you have multiple lines java will only consider one line as if statement and 
		// see others as independent 
		String day="friday";
		
		if(day.equals("Friday"))
			System.out.println("first print without braces");//false so this line will not print
		System.out.println("second print without braces");//will print considered independent 
		
		System.out.println("===========end of first if=================");
		if(day.equals("friday")) {
			System.out.println("first print of if with braces");
			System.out.println("second print with braces");
		}
		
		System.out.println("=================if else no braces ====================");
		int i=10;
		if(i>=10)
			System.out.println("number is lager then 10");
		else
			System.out.println("else statement");
		System.out.println("second else statement");

	}

}
