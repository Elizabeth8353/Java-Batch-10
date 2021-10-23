package com.syntax.class12;

public class Dog {
String name; //THIS IS CLASS
String breed;
String color;
int age;
double height;
char gender;

void bark() {
	System.out.println("Dog can bark");
}
void sleep() {
	System.out.println("Dog can sleep");
}
	public static void main(String[] args) {
		// This is my first object stores in my ram and is non primitive data type
		
Dog dog1=new Dog();//obj stored in ram
dog1.name="James";
dog1.breed="Bull dog";
dog1.color="white";
dog1.age=20;
dog1.height=15;
dog1.gender='M';
dog1.bark();
dog1.sleep();

//My second object
Dog dog2=new Dog();
dog2.name="Bongo";
dog2.breed="shitzu";
dog2.color="Blue";
dog2.age=100;
dog2.height=10;
dog2.gender='M';
dog2.sleep();




	}

}
