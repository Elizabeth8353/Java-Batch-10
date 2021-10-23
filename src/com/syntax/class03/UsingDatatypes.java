package com.syntax.class03;

public class UsingDatatypes {

	public static void main(String[] args) {
		// It's important to use the correct datatype
		
		int num=20;
		int num1=3;//we are dividing two int values and they do not have decimals
		System.out.println(num/num1);//answer should be 6.6666667 but because we are using a smaller data type we have loss of data

		double num2=20;
		double num3=3; //convertion from int to double happens
		System.out.println(num2/num3);
		//we diviede 2 int values and only then the 
	}

}
