package com.abhishek.hackerearth;

public class DiagonalDifference {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int sumRTL = 0;
		int sumLTR = 0;
		int diff = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				//System.out.println("in : "+i);
				sumLTR = sumLTR +arr[i++][j];
				//System.out.println(arr[i++][j]);
				
			}

			for(int k = 0;k<arr.length;k++) {
				sumRTL = sumRTL + arr[--i][k];
				//System.out.println(arr[--i][k]);
				
			}
			System.out.println("Sum RTL = "+ sumRTL);
			System.out.println("Sum LTR = "+ sumLTR);
			diff = sumLTR - sumRTL;
			if(i==0) {
				break;
			}
			
		}
		return Math.abs(diff);
	}

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 11, 2, 4 },
									{ 4, 5, 6 },
									{ 10, 8, -12 }};
									
		//System.out.println(arr.length);

		int result = diagonalDifference(arr);
		System.out.println(result);
	}
}
