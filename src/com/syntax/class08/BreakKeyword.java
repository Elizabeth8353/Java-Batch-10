package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<6;i++) {
	System.out.println("Sunday");
	break;
}

boolean summer=true;
int temp=90;

while(summer) {
	temp++;
	if(temp>95) {
		System.out.println("I do not love hot summer");
		break;
	}
	System.out.println("I love summer");
	//temp++; you can place it anywhere outter loop
}
	}

}
