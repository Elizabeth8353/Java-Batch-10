package com.syntax.class15;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is batch 10 Batch 10 is great";
String [] strArr=str.split(" ");
System.out.println(strArr[0]);
System.out.println(strArr[1]);
System.out.println(strArr[5]);

for(String string:strArr) {
	System.out.println(string);
}
	}

}
