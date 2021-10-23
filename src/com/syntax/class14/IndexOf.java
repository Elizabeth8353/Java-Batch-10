package com.syntax.class14;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="blabla";
System.out.println(str.indexOf("b"));//if you enter a letter will give you the index of it 
//System.out.println(str.indexOf("b",str.indexOf("b")+1));
System.out.println(str.indexOf("b", str.indexOf("b")+1));
//if we wan to know where the second b is located and dont want to hard code it 
	}

}
