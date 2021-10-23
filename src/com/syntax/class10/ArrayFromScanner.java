package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("How many elements do you want to store inside an array");
int size=scan.nextInt();
int[] numbers=new int[size];//retreaving values from user
for(int i=0;i<size;i++) {
	numbers[i]=scan.nextInt();
}
for(int num:numbers) {//printing values of what user enter
	System.out.print(num+" ");
}

	}

}
