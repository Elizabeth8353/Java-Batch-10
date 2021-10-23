package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user
		 *  to enter 2 numbers and operator(+,-,*,/). Based on operator
		 *   provide the result to user.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 2 numbers and");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Now enter your operator");
		char operator=scan.next().charAt(0);
		int sum=0;
		switch(operator) {
		case '+':
			sum=num1+num2;
			break;
		case '-':
			sum=num1-num2;
			break;
		case '*':
			sum=num1*num2;
			break;
		case '/':
			sum=num1/num2;
			break;
		}
		System.out.println(num1+" "+operator+" "+num2+" = "+sum);
		System.out.println("=========================else if ================================");
		if(operator=='+') {
			sum=num1+num2;
		}else if(operator=='-') {
			sum=num1-num2;
		}else if(operator=='*') {
			sum=num1*num2;
		}else if(operator=='/') {
			sum=num1/num2;
		}
System.out.println(sum);
	}

}
