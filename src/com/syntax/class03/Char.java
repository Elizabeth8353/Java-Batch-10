package com.syntax.class03;

public class Char {

	public static void main(String[] args) {
		// Char they store character ($,?,A,f,/ etc.)
		//they store based on the ASCI table every single character is stored based on a number
		// so when we work with char behind the scene it stores it based on a number
		
		int num=3;
		char b='/'; //in ASCI table it equals to 47
		System.out.println(b+num);//java reads it '/' as 47 and adds to our int 

	}

}
