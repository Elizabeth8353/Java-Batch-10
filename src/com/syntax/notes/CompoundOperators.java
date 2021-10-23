package com.syntax.notes;

public class CompoundOperators {

	public static void main(String[] args) {
		// Compound Assignment/shorthand Operators
		//shorter way to express an arithmetic operation
		
		//how we normally do it 
		int num=4;
		num=num+num; // 4+4=8 
		System.out.println(num);//8
		System.out.println("/n===========================================================");
		int num1=2;
		num1+=num1; // 2+2=4
		System.out.println(num1);//4
		
		int a=1;
		//a=a+1;
		a+=10;
		System.out.println(a);

		
		int b=10;
		b+=500;
		System.out.println(b);
		
		int c=100;
		c-=67;
		System.out.println(c);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake%=7;
		System.out.println(cake);
		
	}

}
