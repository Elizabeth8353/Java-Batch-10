package com.syntax.notes;

public class ForLoopNested {

	public static void main(String[] args) {
		
		System.out.println("======================WHY WE CAN'T INCREMENT OUTER LOOP IN INNER LOOP==========================");
for(int i=0;i<2;i++) {
	System.out.println("Most Outter loop "+i);
//	for(int j=0;j<3;i++) {  IF WE TRY TO INCREMENT i THEN J CAN'T GET INCREMENTED AND J WILL ALWAYS BE SMALLER THEN 3 SO INFINITE INNER LOOP
	//	System.out.println("Medium Outter loop "+j);

//	}

}
System.out.println("===============WHY WE CANT USE SAME VARIABLE=============================");
for (int i =0;i<2; i++) {//beginning of outer loop scope
	//for (int i=1;i<2;i++) {
		//Duplicate variable i since it's in the scope of outter loop 
	//}
}//end of outer loop scope
System.out.println("====================WHY WE CAN'T USE INNER LOOP VAR IN OUTER LOOP===========================");
for(int i=0; i<3;i++) {
	//System.out.println(j); PROGRAM RUNS FROM TOP TO BOTTOM 'J' ONLY EXISTS AFTER LINE 25 NOT BEFORE WHICH IS WHY WE GET CE(COMPILER ERROR)
	for(int j=0;j<2;j++) {
		System.out.println(i+" "+j);
	}
	//System.out.println(j); Variable 'j' only exists within the scope of line 25 to 27	
}
//System.out.println(i);  variable 'i' only exists within line 23 to 27 with in it's scope 

	}

}
