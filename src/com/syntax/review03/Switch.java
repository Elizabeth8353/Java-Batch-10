package com.syntax.review03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// always prefer switch over if because its way faster 
		// the downside is its limitations
System.out.println("Enter two numbers");
Scanner scan=new Scanner(System.in);
double number1=scan.nextDouble();
double number2=scan.nextDouble();

System.out.println("Enter the operation");
char operation=scan.next().charAt(0);

if(operation=='+') {
	System.out.println(number1+number2);
}else if(operation=='-') {
	System.out.println(number1-number2);
}else if(operation=='*') {
	System.out.println(number1*number2);
}else if(operation=='/') {
	System.out.println(number1/number2);
}else {
	System.out.println("operator not suported");
}

switch(operation) {
case '+':
	System.out.println(number1+number2);
	break;
case '-':
	System.out.println(number1-number2);
	break;
case '*':
	System.out.println(number1*number2);
	break;
case '/':
	System.out.println(number1/number2);
	break;
	default:
		System.out.println("invalid input");
}


	}

}
