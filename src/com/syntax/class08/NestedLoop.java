package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<2;i++) {
	System.out.println("outter loop");
	for(int j=0;j<2;j++) {
		System.out.println("inner loop");
	}
}

int i=0;
while(i<2) {
	System.out.println("outer");
	for(int j=0;j<3;j++) {
		System.out.println("inner");
	}
	i++;
}
	}

}
