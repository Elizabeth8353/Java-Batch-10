package com.syntax.review03;

public class FloatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//floats can not always be accurate when comparing decimal numbers because of potential loss of data
		//by defult the number we put in our if condition are double as default
		//always use doubles for decimal and and int for whole numbers
		//float will work 2.5 or 2.0 because of how data is stored in our computer and those two numbers will work
		//but a 2.3 will not since work becuase .3 is infinite and float can only hold certain amount and double can hold more
		
float number=2.5F;
if(number==2.5) {// 2.1 is double
	System.out.println("success");
}else {
	System.out.println("failure");
}
float f=2.3f;
double d=2.3;
System.out.println(f);
System.out.println(d);
	}

}
