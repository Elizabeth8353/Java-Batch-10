package com.syntax.notes;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
System.out.println(++i);// = 11  the ++ works as an assining and incrementing so prints 11
System.out.println(i++);// = 10 we are printing the value of i and then incrementing 
System.out.println(i);//=12 line 9 after it was incremented 

int x=5;
System.out.println(++x+(++x));//=13  (x=(x+1=6)7+6) x is incremented in parenthesis to 6 and 6 is stored
//in x outside of parenthesis and 6 is incremented to 7 then added to 6
int y=2;
System.out.println(y+++(y++));//=5 (y++=3 (y++=2))

//++x or x++  calculation will only act differently if in same line 
//if in separate lines it wont matter 


	}

}
