package com.syntax.class09;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		scan=new Scanner(System.in);
		
		int sum=0;
		System.out.println("Please enter number of array");
		int size=scan.nextInt();
		System.out.println("Enter your "+size+" numbers");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			//System.out.println("enter your "+size+" numbers");
			arr[i]=scan.nextInt();
		}
		
		for(int a:arr) {
			sum+=a;
		}
		System.out.println(sum);
		

	}

}
