package com.syntax.class05;

import java.util.Scanner;

public class InitilizeVariables {

	public static void main(String[] args) {
		/*
		 * ask user to enter 3 numbers then find the largest
		 */
		Scanner scan;
		int num1, num2, num3;

		scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers please");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		//can be fixed with = sign
		if(num1>=num2&&num1>=num3) {
			System.out.println(num1+" Is largest number");
		}else if(num2>=num1&&num2>=num3) {
System.out.println(num2+" is largest number");
	}else if (num3>=num2&&num3>=num1) {
		System.out.println(num3+" is largest number");
	}//else if(num1==num2&&num2==num3){
		//System.out.println("they are equal");
	//}
	System.out.println("=====Another way========================");
if (num1==2&& num2==num3) {
	System.out.println("All number are equal");
}else {
	if(num1>=num2&&num1>=num3) {
		System.out.println(num1+" Is largest number");
	}else if(num2>=num1&&num2>=num3) {
System.out.println(num2+" is largest number");
}else if (num3>=num2&&num3>=num1) {
	System.out.println(num3+" is largest number");
}
}
}
}
