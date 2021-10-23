package com.syntax.class12;

public class Cat {
	
String name;
String color;
int age;
void eat() {
	System.out.println(name+" is eating ");
}
void sleep() {
	System.out.println(name+" is sleeping");
}

public static void main(String[] args) {
	Cat cat1=new Cat();
	cat1.name="Jerry";
	cat1.color="pink";
	cat1.age=5;
	cat1.sleep();
	cat1.eat();
	
	Cat cat2=new Cat();
	cat2.name="Jerry";
	cat2.color="pink";
	cat2.age=5;
	cat2.sleep();
	//cat2.eat();
}

}
