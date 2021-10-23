package com.syntax.notes;

public class ImutableString {

	public static void main(String[] args) {
		// Strings are imutable
		//Below is example of string being imutable we are only printing
	// it shows on console but the str was not assigned anythig just printing 
		String str="ABCD";
		System.out.println(str.concat("Z"));//ABCZ
		System.out.println(str);//ABCD

	}

}
