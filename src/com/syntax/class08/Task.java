package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 */
		for(int i=1; i<=50;i++) {
			if(i%3==0) {//% this is mod operator shows us the remeinder
				continue;
			}
			System.out.print(i+" ");
		}
System.out.println("\n=========================================");
Scanner scan=new Scanner(System.in);
//Create a program that will keep asking user to apply for a credit card. As soon you get “yes” from a user program should stop asking.

//System.out.println("Please apply for credit card");//
String yes;
do {
	
	System.out.println("Please apply for credit card");
	yes=scan.next();
if(yes.equalsIgnoreCase("yes")) {
	break;//we can also use continue
}
	
}while(true);
System.out.println("heres your credit card");
	}

}
