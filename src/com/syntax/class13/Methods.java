package com.syntax.class13;

public class Methods {
void repeatWords(int times,String str) {
	for(int i=0;i<times;i++) {
		System.out.println(str);
	
	}
}
void isRaining(boolean isRain) {
	if(isRain) {
		System.out.println("Please take umbrella");
	}else {
		System.out.println("lets go for walk");
	}
}
int add(int num1,int num2) {
	return num1+num2;
}


String co  (String country) {
	
	if(country.equalsIgnoreCase("usa")) {
		return "Hello";
	}else if(country=="serd") {
		return "srov";
	}else if(country=="hi") {
		return "hi";
	}
	return null;
}
public static void main(String[] args) {
	Methods str=new Methods();
	String co=str.co("usa");
		System.out.println(co);
}
}
