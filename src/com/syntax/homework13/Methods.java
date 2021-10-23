package com.syntax.homework13;

public class Methods {
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void largestNum(int a, int b) {
		if(a>b) {
			System.out.println(a+" is the largest number");
		}else {
			System.out.println(b+" is the largest number");
		}
	}
	
	//Create a method that will take a number and prints whether the number is even or odd.
	
	void evenOrOdd(int a) {
		if(a%2==0) {
			System.out.println(a+" is an even number");
		}else {
			System.out.println(a+" is an odd number");
		}
	}
	
	//Create a method that will print whether given String is palindrome or not.
	String palindrome(String str) {

		String reverse="";

		for( int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
			if(str.equals(reverse)) {
				System.out.println("is palindrone "+true);
			}else {
				System.out.println("is palindrone "+false);
			}
		
		return reverse;
}


	//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	String hello(String language) {
		String hello=null;
		switch(language) {
		case "English":
			hello="Hello";
			break;
		case "Spanish":
			hello="Hola";
			break;
		case "French":
			hello="Bonjour";
			break;
		}
		return hello;
	}
	

}
