package com.syntax.class04;

import java.util.Scanner;

public class ScannerCompareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner data=new Scanner(System.in);
System.out.println("Please enter 2 numbers");
int num1=data.nextInt();
int num2=data.nextInt();

if (num1>num2) {
	System.out.println(num1+" is grater than "+num2);
}else if(num2>num1){
	System.out.println(num2+" is grater than "+num1);
}else {
	System.out.println(num1+" is equal to "+num2);
}



	}

}
