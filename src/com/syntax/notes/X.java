package com.syntax.notes;

import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		int i=0;
		while(i<10){
			System.out.print(i+" ");
			i++;
		}
		System.out.print(" ");
		System.out.println("\nhello everyone");
System.out.println("largest number");
int num1,num2,num3,max=0;
Scanner scan;
scan=new Scanner(System.in);
System.out.println("ENter 3 numbers");
num1=scan.nextInt();
num2=scan.nextInt();
num3=scan.nextInt();

if (num1>num2) {
	if(num1>num3) {
		max=num1;
	}else {
		max=num3;
	}
}else {
	if(num2>num3) {
		max=num2;
	}else {
		max=num3;
	}
}
System.out.println("max number is "+max);




	}

}
