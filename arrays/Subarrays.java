package com.abhishek.arrays;

public class Subarrays {
	
	public static void findSubArrays(int[] input, int target) {
		
		for(int i = 0; i<input.length; i++) {
			int sum =  input[i];
			for(int j = i + 1 ; j<input.length; j++) {
					sum = sum +  input[j];
					if(sum ==  target) {
						System.out.println("start : " +  i + "|| End : " +  j);
				}
			}
		}
		
	}
	public static void main(String args[]) {
		
		int[] sample = {1, 3, 7, 9, 11, 15, 8, 6};
		findSubArrays(sample, 20);
	}

}
