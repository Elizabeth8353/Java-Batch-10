package com.syntax.notes;

public class NamingConvention {

	/*
	 * Identifiers=names of our variables
	 * 1.Donot use keyword as Identifiers
	 * 2.Identifiers Cannot contain spaces 
	 * 3.Identifiers Cannot start with numbers 
	 * 4.Identifiers cannot have special characters  excerpt _ or $
	 * 
	 * 
	 * 
	 * 
	 * Naming convention:
	 * 1. We use camel casing
	 * 2. classes start with Upper cases and will fallow camel casing
	 * 3. variables start with lower cases and will fallow camel casing 
	 * 4. packages we use lower case and use name as reverse way of URL
	 * 5. use meaningful name for your variables/identifiers
	 */
	
public static void main(String[] args) {
	int num$;
	//int 1num; cannot start with numbers 
	//int var one; No spaces
	//int break; No Keywords
	String str;//declaration happens once /creation of variable
	str="hello";//initialization / assigning value can be re-assigned as many times
	int l=str.length();
	System.out.println(l);
	
	
}
}
