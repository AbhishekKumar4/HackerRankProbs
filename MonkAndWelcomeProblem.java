package com.abhishek.hackerearth;

public class MonkAndWelcomeProblem {

	public void monkAndWelcomeProblem() {
		int[] array1 = {2,8,9,6,5};
		int[] array2 = {11,5,8,3,4};
		
		int[] resultingArray = new int[array1.length];
		for(int i=0; i<=array1.length-1;i++) {
			int sum = array1[i] + array2[i];
			resultingArray[i] = sum;
		}
		
		for(int i=0; i<=resultingArray.length-1;i++) {
		System.out.print(resultingArray[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		new MonkAndWelcomeProblem().monkAndWelcomeProblem();
	}
}
