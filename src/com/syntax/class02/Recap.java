package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {
		// The structure of our project consist of JRE which is our library where it contains classes we can use like Syso
		//We also have SRC where we write our source code where it is later change into Binary to comunicate and tell 
		//our computer what to do and execute the our tasks
		//in our src we create a package to keep our programs/classes organized 
		
		byte b=1;
		short s=10;
		int i=100;
		long l=1000000L;
		float f=10.99f;
		double d=100.99;
		
		char c='*';
		boolean bool=false;
		
		System.out.println(d);
		
		//how to change a value of the variable?
	
		//int i=200; we cannot declare same variable twice!!! already declared on line#13
		
		i=200;//reassign value
		bool =true;
		System.out.println(bool);
		
		// we can use other variables to initialize a new variable as long as its the same data type
		int number=i;
		number=500;
		
		
		

	}

}
