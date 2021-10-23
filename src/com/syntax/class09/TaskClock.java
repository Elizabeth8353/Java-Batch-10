package com.syntax.class09;

public class TaskClock {

	public static void main(String[] args) {
		for (int h=0;h<24;h++) {
			for(int m=0;m<60;m++) {
				if(h<10&&m<10) {
					System.out.println("0"+h+":0"+m);
				}else if(h<10&&m>=10) {
					System.out.println("0"+h+":"+m);
				}else if(h>=10&&m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
				
			}
		}
		System.out.println("=======================Nested if=============================");
for(int h=0;h<24;h++) {
	for(int m=0;m<60;m++) {
		if(h<10) {
			if(m<10) {
				System.out.println("0"+h+":0"+m);
			}else {
				System.out.println("0"+h+":"+m);
			}
		}else {
			if(m<10) {
				System.out.println(h+":0"+m);
			}else {
				System.out.println(h+":"+m);
			}
		}
	}
}
System.out.println("==========================nestedloops===========================================");
for (int r=0;r<=2;r++) {
	for(int c=0;c<=4;c++) {
		for(int j=0;j<=5;j++) {
			for(int k=0;k<=9;k++)
			System.out.println(r+""+c+":"+j+""+k);
		}
	}
}
	}

}
