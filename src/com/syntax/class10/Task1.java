package com.syntax.class10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner 
		 * calculate the sum of that array
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your how many decimals you want");
		int size=input.nextInt();//size always int
		
		double[] num=new double[size];
		double sum=0;
		
		for(int i=0;i<size;i++) {
			num[i]=input.nextDouble();
		sum+=num[i];
		}
		System.out.println("The sum of my doubles "+sum);
		
		

	}

}
