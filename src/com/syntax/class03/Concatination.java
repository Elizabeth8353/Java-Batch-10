package com.syntax.class03;

public class Concatination {

	public static void main(String[] args) {
		// Based on the data type used when concatinating it will act differently depending 
		// what data type is being concatinated 
		// it will also act different depending on the order we are printing
		
		
		// when concatinating strings it will attach words
		String word="hi";
		String word1="eli";
		
		System.out.println(word+word1); //hieli
		
		//when concatinating int or number datatypes it will act as addition
		int num=10;
		int num1=11;
		System.out.println(num+num1); //21
		
		double d=3.99;
		   System.out.println(num+d);//13.99
		   
		//when concatinating char and a number it will also act as addition since char is stores as number behind the scene
		
		char c='?';
		System.out.println(num+c); //73
		
		//when you start with a string it will concatinate
		
		System.out.println(word+num+c);//hi10?
		System.out.println(word1+num+num1);//eli1011
		
		// when you place it in parenthesis it will give priority
		
		System.out.println(word1+(num+num1));//eli21
		
//Contatinating a boolean to integer
		// when concatinating a boolean to int when java sees two primitive it automatically wants 
		// to act as an arithmetic operator plus sign by adding when it sees boolean and int it wants 
		// to add it which is not possible so a Compiler error will show
		// to concatinate we need to either use a string to separate them or begin with a string 
		//or use print and println
		
		int i=4;
		boolean boo=true;
		//System.out.println(i+boo);CE java confused and wants to perform addition
		System.out.println("hi"+boo+i);//one way to concatinate both
		System.out.println(i+" "+boo);//another way to concatinate
		System.out.print(i); //and another way
		System.out.println(boo);
		
	}

}
