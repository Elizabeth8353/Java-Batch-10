package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/*
		 * write a program that reads a range of integers from(start and end point)
		 * provide by a user 
		 * and the from that range print the sum of the even and odd int
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter start and end point");
		int start=scan.nextInt();
		int end=scan.nextInt();
		int even=0;
		int odd=0;
		if(start<end) {
		for (int i=start;i<end;i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		}else {
			System.out.println("first number must be smaller then end number");
		}
		
		System.out.println(" the sum of even"+even);
		System.out.println("the sum of odd"+odd);

	}

}
