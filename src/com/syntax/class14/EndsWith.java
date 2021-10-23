package com.syntax.class14;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This class is easy";
System.out.println(str.endsWith("y"));
System.out.println(str.endsWith("This class is easy"));
System.out.println(str.endsWith("is ")); //even complete sentence will be true as long as matching 
	}

}
