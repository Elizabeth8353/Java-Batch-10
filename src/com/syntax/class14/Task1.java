package com.syntax.class14;

public class Task1 {

	void printGrater(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+"is larger");
		}else {
			System.out.println(num2+" is larger");
		}
	}
	
	void printOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}
	
	void printHello(String country) {
		switch(country) {
		case "USA":
			System.out.println("Hello");
			break;
		case "German":
			System.out.println("Halo");
			break;
		case "Afghanistan":
			System.out.println("slamaleco");
			break;
		case "turkey":
			System.out.println("Merhaba");
			break;
			default:
				System.out.println("Invalid");
		}
	}
	String createEmail(String firstName,String lastName,String emailtype) {
		return firstName+lastName+"@"+emailtype;
	}
	
	
	boolean isPrime(int number) {
		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
	
	
	char getGrade(double score) {
		if(score>90) {
			return'A';
		}else if(score>80) {
			return 'B';
		}else if(score>50) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	
}
