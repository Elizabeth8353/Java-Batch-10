package com.syntax.class15;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This us Batch 10.Batch 10 is great";
String[] strArr=str.split("[.]");

for (String str2:strArr) {
	System.out.println(str2);
}
	}

}
