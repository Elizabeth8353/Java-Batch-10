package com.syntax.class01;

public class DataTypesAndVariables { // CLASS ALWAYS START WITH UPPER CASE AND FALLOW CAMEL CASING

	public static void main(String[] args) {
		// VARIABLES ALWAYS START WITH LOWER CASE AND START WITH LOWER CASE AND FALLOW CAMEL CASING 
/*
 * JAVA has 2 different types of Data Types
 * PRIMITIVE AND NON-PRIMITIVE
 * THIER IS 8 PRIMITIVE DATA TYPES (bite,short,int,long,float,double,char,boolean)
 * In order to use our data we need to store it in a variable it holds our data
 * TO CREATE A VARIABLE YOU NEED: 1.datatype 2.name 3."="to assign  4.value
 */
		
		//JAVA IS VERY STRICT YOU NEED TO STORE DATA TYPE THAT MATCHES VALUE(CAN'T STORE DOUBLE INTO INT)
		//DATA TYPES WERE CREATED BECAUSE IN THE PAST MEMORY WAS VERY EXPENSIVE SO TO NOT WAIST MEMORY 
		//EACH DATATYPE OCCUPIES A CERTAIN AMOUNT OF SPACE 
		
		/*
		 * byte  -data type
		 * variable  -variable/box/container name
		 * =  -assign
		 * 10 -value
		 */
		
		//Storing whole numbers
		byte variable=10;//SMALEST DATA TYPE CAN HOLD FROM (-128 TO 127)
		short variable1=100;//CAN HOLD FROM(-32768 TO 32767)
		int var3=100000;//CAN HOLD FROM (-2147483648 TO 2147483647)****MOST POPULAR
		long var4=1000000;//TO SPECIFY ITS LONG PLACE "L" IN THE END CAN HOLD UP TO 9,223,372,036,854,775,807
		
		//Storing numbers with decimal
		float myFloat=10.99f; // CAN HOLD 5 TO 6 DECIMAL PLACES
		double myDouble=100.99;//CAN HOLD 14 TO 15 DECIMAL PLACES**** MOST POPULAR
		
		//Storing single character
		char singleLetter='J';
		char specialCharacter='/';
		
		//Store boolean values:yes or no
		
		boolean myBoo=true;
		boolean myBoo2=false;
		
		
		System.out.println(variable); //yellow warning shows as a warning that variable not being used once printed disappears
		System.out.println("variable");//in double quotes its a string 
		//============================================================================
		
		//System.out.println(myBoo1);CE program runs top to bottom you need to first create then use ( you cannot print before it's created
		boolean myBoo1=true;
		System.out.println(myBoo1);
		
		
		
		
		
	}

}
