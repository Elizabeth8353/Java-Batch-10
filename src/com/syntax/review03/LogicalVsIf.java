package com.syntax.review03;

public class LogicalVsIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * if a number is from 0 to 100 print number is in range
 * else print number is out of range
 * 
 */
		int number=1000;
		
		
		if(number>=0) {
			if(number<=100) {
				System.out.println("number is in  range");
			}else {
				System.out.println("number is out of range");
			}
		}else {
			System.out.println("number is out of range");
		}
		
		System.out.println("===========logical operators======================");
		if(number>=0&&number<=100) {
			System.out.println("number is in range");
		}else {
			System.out.println("number is out of range");
		}
	}

}
