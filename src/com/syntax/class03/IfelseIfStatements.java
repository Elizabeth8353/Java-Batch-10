package com.syntax.class03;

public class IfelseIfStatements {
public static void main(String[] args) {
	/*
	 * if else if statements more options to choose from and will execute the first true statement will not check further 
	 */
	int num1=0;
	int num2=10;
	
	if(num1>num2) {
		System.out.println(num1+"is larger than "+num2);
	}else if(num1<num2) {
		System.out.println(num1+" is smaller than "+num2);
	}else {
		System.out.println(num1+"is equal to "+num2);
	}
	
	
	System.out.println("--------------------------------------------------------------------------------------");
	
	int day=2;
	
	if(day==1) {
		System.out.println("today is monday");
	}else if (day==2) {
		System.out.println("today is tuesday");
	}else if(day==3) {
		System.out.println("today is wednesday");
	}else if(day==4) {
		System.out.println("today is thursday");
	}else if(day==5) {
		System.out.println("today is friday");
	}else if (day==6) {
		System.out.println("today is saturday");
	}else if (day==7) {
		System.out.println("today is sunday");
	}else {
		System.out.println(" NOT day of a week");
	}
}
}
