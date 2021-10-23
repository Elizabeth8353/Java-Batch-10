package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested 
		 * if provided by a user (numbers must be distinct)
		 */
		
		Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter 3 distinct numbers");
		  int num1=scan.nextInt();
		  int num2=scan.nextInt();
		  int num3=scan.nextInt();
if(num1!=0&&num2!=0&&num3!=0) {
	
		  if(num1>num2){
		    if(num1>num3){
		      System.out.println("The largest number is "+num1);
		    }else{
		      System.out.println("The largest number is "+num3);
		    }
		  }else{
		    if(num2>num1){
		      if(num2>num3){
		        System.out.println("The largest number is "+num2);
		      }else{
		        System.out.println("The largest number is "+num3);
		      }
		    }
		  }
		  
}else {
	System.out.println("0 is not an option please enter a number");
}

	}

}
