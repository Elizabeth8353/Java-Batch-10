package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		/*Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 *  Miss and  Smith, Jordan, Jackson, Obama.
         *After storing values print the following:
         *Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		String[][] prefix= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jorday","Jackson","Obama"}
		};
		System.out.println(prefix[0][1]+prefix[1][0]);
		System.out.println("==============================================================================");
		for(int r=0;r<prefix.length;r++) {
			for(int c=0;c<prefix[r].length;c++) {//inner loop iterates over columns
				System.out.print(prefix[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("=================For each loop==========");
		for(String[] arr:prefix) {
			for(String a:arr) {
				System.out.println(a);
			}
		}
		
		
		System.out.println("===============task4===========================");
		/*Create a 2D array that first row will contain 4 names and second row will contain grades.
		 *  Then your program should print name of the students that has A and B grade
		 */

	}

}
