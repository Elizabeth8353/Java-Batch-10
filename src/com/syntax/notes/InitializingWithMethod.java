package com.syntax.notes;

public class InitializingWithMethod {
String name;
int grade;

InitializingWithMethod setName(String name) {
	this.name=name;	
	return this;
}

void setGrade(int grade) {
	this.grade=grade;
	System.out.println(grade);
}

	public static void main(String[] args) {
		InitializingWithMethod s=new InitializingWithMethod();
		s.setGrade(10);
		
String f="hi";
System.out.println(f.contains("i"));

	}

}
