package com.syntax.notes;

public class EscapeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Its is a new line. Escape Sequences Escape Sequence Description 
 * \t Insert a tab in the text at this point. \b Insert a backspace in the text at this point. \n Insert a newline in the 
 * text at this point. \r Insert a carriage return in the text at this point.
 * 
 */
		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}else {
				System.out.print(i+"\n");
			}	
		}
		System.out.println("============================================================================================");
		
		for (int i=0;i<5;i++) {
			System.out.println("beginning of my loop");
			if(i==3) {
				System.out.println("Im if num 3");
			}else {
				System.out.println("I'm else");
			}
			System.out.println("end of loop");
		}
	}

}
