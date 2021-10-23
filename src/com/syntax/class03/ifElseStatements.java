package com.syntax.class03;

public class ifElseStatements {

	public static void main(String[] args) {
		// if statement is a either or depending on condition block of code will execute
		// if does not have to have an else condition but else has to have if 
/*
 * I have money and I know price
 * if i have more money--> I will buy cookies
 * otherwise i will cry
 */
		System.out.println("beggining of program ");
		
		double money=10;
		double $cookie=1.99;
		if(money>$cookie) {//if true
			System.out.println("I am buying those cookies");
		}else {//if false
			System.out.println("I am going to cry");
		}
	}

}
