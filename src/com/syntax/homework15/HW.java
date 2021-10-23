package com.syntax.homework15;

public class HW {
	public static void main(String[] args) {
	//Create a String that will hold a sentence. Write a program to get a new String without any spaces.

		String str="Good morning batch 10";
		String newStr=str.replaceAll(" ", "");
		System.out.println(newStr);
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String str2="Hello class j@va B@TCH 10 !";
		String newStr2=str2.replaceAll(" ", "");
		String repStr3=newStr2.replaceAll("[a-zA-Z0-10]","");
		System.out.println("number of special characters="+repStr3.length());
		int alpha=newStr2.length()-repStr3.length();
		System.out.println(alpha);
				
		//You have a String a=”Is it saturday? Is it raining? 
		//Do we have a Java Class today?” How would you find out how many sentences are in that String?
		String a="Is is saturday? Is it raining? Do we have a java Class today?";
		String[] arr=a.split("[?]");
		System.out.println("Total number of sentences "+arr.length);
		
		//How would you reverse a String character by character?
		String letter="Hello";
		String reverse="";
		for(int i=letter.length()-1;i>=0;i--) {
			reverse+=letter.charAt(i);
		}
		System.out.println(reverse);
		//How would you reverse a String word by word?
		String rev="Hi batch 10";
		String[] arr3=rev.split(" ");
		for(int i=arr3.length-1;i>0;i--) {
			System.out.println(arr3[i]);
		}
		//How would you check if String is palindrome or not?
		String r="";
String s="bye";
		for( int i=s.length()-1;i>=0;i--) {
			r+=s.charAt(i);
		}
			if(s.equals(reverse)) {
				System.out.println("is palindrone "+true);
			}else {
				System.out.println("is palindrone "+false);
			}
	}
}
