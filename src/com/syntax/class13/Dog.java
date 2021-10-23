package com.syntax.class13;

public class Dog {
//attributes
	String breed;
	int age;
	char gender;
	String name;
	
	//Behaviors
	
	void yourDog() {
		System.out.println("The breed of your dog is "+breed+" and gender is "+gender+" and age is "+age+" name is "+name);
	}
	 String bark(String str) {
		 String bark=null;
		switch(str){
			case "Husky":
				bark="WOW WOW WOW";
				break;
			case "labrador":
			bark="BOW BOW BOW";
				break;
			case "Bulldog":
				bark="Woof Woof Woof";
				break;
		}
		return bark;
		 
	 }
	 public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.breed="Husky";
		Husky.age=5;
		Husky.gender='F';
		Husky.name="Lily";
		Husky.yourDog();
		System.out.println(Husky.bark("Husky"));
	}
	
	
}
