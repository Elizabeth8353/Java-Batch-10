package com.syntax.notes;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic Operators= just like our math operators =  +, - , % modulus , /division, * multiplication
		//operation presidency: %-> *-> / -> + -> -  but watever is in the () has presidency over */+- 
		int one=1;
		int two=4;
		int sum=one+two;
		System.out.println(sum);
		int minus=one-two;
		System.out.println(minus);
		int division=one/two;
		System.out.println(division);
		int multiplication= one*two;
		System.out.println(multiplication);
		int modulus=10%3;//means what will be left after 3 goes into 10 3 times and 1 is reminder 
		System.out.println(modulus);
		
		// Compound Operators shorter way of using our arithmetic operators
		
		int a=100;
		a+=500;
		System.out.println(a);
		
		a-=67;
		System.out.println(a);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake%=7;
		System.out.println(cake);
		
		

	}

}
