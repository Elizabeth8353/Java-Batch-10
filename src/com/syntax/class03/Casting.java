package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// Casting in JAVA: is converitng one data type to another 
		/*
		 * widening/implicit/automatic
		 * byte->short->int->long->float->double
		 * 
		 * narrowing/explicit/manual  (potential loss of data will happen)
		 * double->float->long->int->short->byte
		 */
		
		
int i=10;
double d=i;//widening/implicit/automatic casting storing a small data type in a larger one no loss of data and java dont complain
System.out.println(d);//10.0

//int b=1.99; CE cannot directly store a bigger data type directly to a smaller one
int b=(int)1.99;//narrawing/explicit/manual casting need us to manually assure java we are 
byte c=(byte)128;// sure we want to store a bigger datatype int to a smaller one because of potential loss of data 
System.out.println(c); //-128 loss of data


int num=20;
int num1=3;//we are dividing two int values and they do not have decimals
System.out.println(num/num1);//answer should be 6.6666667 but because we are using a smaller data type we have loss of data

double num2=20;
double num3=3; //convertion from int to double happens
System.out.println(num2/num3);
//we diviede 2 int values and only then the 
	}

}
