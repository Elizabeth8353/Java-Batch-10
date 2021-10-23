package com.syntax.class06;

public class SwitchDemoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char gender='M';

switch(gender) {
case 'M':
	System.out.println("Male");
	break;
//case'M':
//	System.out.println("lalala");    Matching cases are not allowed 
	//break;
case 'F':
	System.out.println("Female");
	break;
	default:
		System.out.println("Gender is unknown");
}
	}

}
