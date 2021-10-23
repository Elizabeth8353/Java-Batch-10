package com.syntax.class06;

public class LocalOperatorsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================OR==========================================");
String position="Automation Tester";
if(position.equals("Automation Tester")||position.equals("Manual Tester")) {
	System.out.println("I am Happy");
}
System.out.println("======================And======================================");
int salary=1000;

if(position.equals("Automation Tester")&& salary>=1000) {
	System.out.println("I'm happy");
}
System.out.println("======================Not=============================");

boolean study=true;
if(!study) {
	System.out.println("You are not getting a job");
}

	}

}
