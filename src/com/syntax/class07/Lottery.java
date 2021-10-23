package com.syntax.class07;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		/*
		 * Do and while repeat block of code as long as condition is true
		 * while first check condition only then execute
		 * Do executes code once then checks condition
		 * 
		 * We use this loop when we don't know in advance how many times we need to execute block of code
		 * 
		 * 
		 * we have a secret number (any number from 1 till 20)
		 * ask user to guess your secret number
		 * until user enters your secret number
		 */
Scanner in;
int secretNum, userNum;
secretNum=15;

in=new Scanner(System.in);

do {
	System.out.println("Please guess my secret number");
	secretNum=in.nextInt();
	
}while(secretNum!=15);
System.out.println("Congrats you guessed it!!");

	}

}
