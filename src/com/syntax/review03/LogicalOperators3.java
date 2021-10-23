package com.syntax.review03;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String userName="Maria";
String passWord="pass123";
int availableFunds=1000;

if(userName.equals("Maria")&&passWord.equals("pass123")){
	System.out.println("Enter the amount of money you want to transefer ");
	Scanner scan=new Scanner(System.in);
	double amountTranser=scan.nextDouble();
	if(availableFunds>100) {
		System.out.println("transfer successful");
	}else {
		System.out.println("not enough funds");
	}
}else {
	System.out.println("incorrect password or user");
}
	}

}
