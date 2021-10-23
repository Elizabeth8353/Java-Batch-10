package com.syntax.review05;

public class NestedLoops {

	public static void main(String[] args) {
		/*Task 1
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 */
		for (int i=1;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("==========================task 2================================");
		/*54321
		 *54321
		 *54321
		 *54321
		 */
		for (int i=5;i>1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	
		

	}

}
