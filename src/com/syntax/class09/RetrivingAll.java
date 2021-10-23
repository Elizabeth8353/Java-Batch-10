package com.syntax.class09;

public class RetrivingAll {
public static void main(String[] args) {
	char[] grades= {'A','B','C','D','E','F'};
	int size=grades.length;//this property gives you the size->how many elements in that array
	
    
	System.out.println(grades[1]);
	
	int i=0;
	System.out.println(grades[i]);
	
	i++;
	System.out.println(grades[i]);
	
	for(int j=0;j<size;j++) {// best not to use <= or will be out of bound
		System.out.println(grades[j]);
		
		
		
	}
	
}
}
