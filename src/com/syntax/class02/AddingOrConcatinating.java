package com.syntax.class02;

public class AddingOrConcatinating {

	public static void main(String[] args) {
		// when + is in between strings it concatinates
		// when + is in between to numbers it adds them
		// when printing program runs from top to bottom and left to right if it the first data type is a string
		// it will concatinate attaching the numbers as one big string
		
		String a="hello";
		String b="world";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b);//30helloworld
		System.out.println(a+c+b+d);//hello10world20
		System.out.println(a+(c+d)+b);//hello30world
		System.out.println(a+c+d+b);//hello1020world
		
		String combine=a+b+c+d;
		System.out.println(combine);
		
		char grade='A';
		String str="Student";
		
		String newString=grade+" "+str;
		System.out.println(newString);
		
		

	}

}
