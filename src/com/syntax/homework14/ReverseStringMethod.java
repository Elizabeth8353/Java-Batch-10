package com.syntax.homework14;

public class ReverseStringMethod {
	String reverseString(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String[] args) {
		ReverseStringMethod str=new ReverseStringMethod();
		String rev=str.reverseString("elizabeth");
		System.out.println(rev);
		
	
		
	}
	
}
