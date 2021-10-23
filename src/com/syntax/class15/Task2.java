package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		// substring methods work with integers
String dad="Ali";
String mom="Maria";
String expectation = "girl";
if(expectation.equalsIgnoreCase("boy")) {
	String firstHalf=dad.substring(0,dad.length()/2);
	String secHalf=mom.substring(mom.length()/2);
	System.out.println(firstHalf+secHalf);
}else {
	String firstHalf=mom.substring(0,mom.length()/2);
	String secHalf=dad.substring(dad.length()/2);//from that index forward the one argument it stats taking characters from that to the last 
	System.out.println(firstHalf+secHalf);
}
	}

}
