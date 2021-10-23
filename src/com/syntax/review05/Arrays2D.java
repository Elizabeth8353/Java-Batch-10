package com.syntax.review05;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] nums=new int[2][];// don't need to specify right away the number of columns
int[] row1=new int[5];
int[] row2=new int[10];
nums[0]=row1;
nums[1]=row2;



for(int i=0;i<nums.length;i++) {
	for(int j=0;j<nums[i].length;j++) {
		System.out.print(nums[i][j]);
	}
	System.out.println();
}
	}

}
