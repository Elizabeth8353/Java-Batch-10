package com.syntax.class05;

import java.util.Scanner;

public class InitilizeVariableBetterWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		int num1, num2, num3, largest;
//instead of using repetitive block of code its best to use a variable also alot cleaner
		scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers please");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if (num1>num2&&num1>num3) {
			largest=num1;
		}else if(num2>num1&& num2>num3) {
			largest=num2;
		}else {
			largest=num3;
		}
		System.out.println("the largest number "+largest);
		if(largest%2!=0) {
			System.out.println(largest+" number is odd");
		}else {
			System.out.println(largest+" number is even");
		}
	}

}
