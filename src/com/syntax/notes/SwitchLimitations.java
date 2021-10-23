package com.syntax.notes;

public class SwitchLimitations {
/*
 * 	 In switch remember :
		 * 1.variable type and case must be same data type
		 * 2.always use break 
		 * 3.No relational operators allowed ( <,>,<=,>=,==,)
		 * 4.No logical operator (&& - ||- !=)
		 * 4.Cannot work with double
		 * 5.Cannot work with boolean
		 * 6.Cannot work with long
		 * 7.Cannot work with float
		 * 8.duplicate case not allowed
		 * 
 */
	
	public static void main(String[] args) {
		int day=3;
		//when break is not present code will go to the the exact day and execute code plus other 
		//codes after it not before it 
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			//break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");//will execute
		//break;
		case 4:
			System.out.println("Thursday");//will execute
			//break;
		case 5:
			System.out.println("Friday");// will execute
			//break;
			//default:
			//	System.out.println("invalid");
		}
		System.out.println("===================================================");
		char code='C';
		//char b='B';
		double disc;
		
		switch(code) {
		case 'A':
			disc=0.0;
			break;
		case 'B':
			disc=0.1;
			//break;
		case 'C':          //nothing will print out but first 0.2 will be assigned to code then 0.3 
			               // because their is no break
			disc=0.2;
			//break;
		default:
			disc=0.3;
		}
		System.out.println("=========================================================");
		
		int a=7*3+6/2-5;
		System.out.println(a);
		int b=21-8+a%3*11;
		System.out.println(b);
		
		//if(a=b) {    Reassigning is not allowed in a conditional statement
			//}
		if(1<2) {
			System.out.println("A is smaller then B");
		}
		if(a>b) {
			System.out.println("A is bigger then B");
		}
	}
}
