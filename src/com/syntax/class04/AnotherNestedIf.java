package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {
		/*
		 * we have test-->yes or no
		 * 
		 * if you done test then I want to check the score
		 * 
		 * score is more than -->A student
		 * score is more than -->B student
		 * score is more than -->C student
		 * otherwise: you should study more
		 */
		
		//make sure your logic is correct 
boolean isComplete=true;
int score=79;

if(isComplete) {
	System.out.println("Lets check your grade");
	if(score>=90) { //make sure logic is correct if score<=80 was first that would of been executed 
		System.out.println("A student");
	}else if(score>=80){
	System.out.println("B student");
	}else if (score>=70) {
		System.out.println("C student");
	}else if(score>=60) {
		System.out.println("D student");
	}else {
		System.out.println("you should of studied more");
	}
}else {
	System.out.println("you should have taken the test!!!!!");
}
	}

}
