package com.syntax.class15;

public class StringBuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ABCD";
System.out.println(str.concat("z"));
System.out.println(str);//string are imutable

StringBuilder str2=new StringBuilder("ABC");
System.out.println(str2.append("Z"));
System.out.println(str2);

str2.reverse();
System.out.println(str2);
	}

}
