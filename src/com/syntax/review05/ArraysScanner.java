package com.syntax.review05;

import java.util.Scanner;

public class ArraysScanner {

	public static void main(String[] args) {
		// try avoiding loops takes alot out of your cpu best to use one loop
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter size of array");
		int size=scan.nextInt();
		
		int[] nums=new int[size];
		
		for(int i=0;i<size;i++) {
	       System.out.println("Please enter the numbers");
			nums[i]=scan.nextInt();
		}
for(int i=0;i<size;i++) {
	System.out.println(nums[i]);
}
	}

}
