package com.syntax.class14;

public class Methods {

	int add(int num1,int num2) {
		if(num1>10) {
			return num1;
		}else {
			return num2;
		}
	}
	
	int[] doubleTheArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*2;
		}
		return arr;
	}
}
