package com.syntax.class15;

public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I am a good tester. I am a good person";
System.out.println(str.replace("a", "A"));
System.out.println(str.replace("good","naughty"));

String str2="fsnkjf5f125smflR&**OSNKF;lsmnf";
System.out.println(str2.replaceAll("[0-9]", ""));
System.out.println(str2.replaceAll("[A-Z]", "++"));
System.out.println(str2.replaceAll("[j-l5-7]", ""));
System.out.println(str2.replaceAll("[^a-z0-9A-Z]","").replace("F", "D"));
	}

}
