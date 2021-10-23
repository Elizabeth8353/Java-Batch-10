package com.syntax.class08;

public class Continue {

	public static void main(String[] args) {
		// is used to skip the current iteration
for(int i=0;i<=3;i++) {
	if(i==1) {
		System.out.println("continue");
		continue;
	}
	System.out.println(i);
}
for(int i=0;i<=10;i++) {
	if(i==5) {
		continue;
	}
	System.out.print(i+" ");
}
System.out.println("==============================using ||==============================");
for(int i=0;i<=10;i++) {
	if(i==4||i==8) {
		continue;//will skip 4 and 8 once it sees continue goes directly back to line 21 and does not go to line 25
	}
	System.out.print(i+" ");
}
	}

}
