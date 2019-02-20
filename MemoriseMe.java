package com.abhishek.hackerearth;

public class MemoriseMe {
	
	public void memoriseMe(int input) {
	
		int[] inputArray = {3,1,1,2,2,3,4,7};
		int count = 0;
		
		for(int i=0; i<=inputArray.length-1; i++) {
			if(inputArray[i] == input) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Element not present !!!");
		}
		System.out.println(input + " is repeated :: " + count +" times");
	}
	public static void main(String args[]) {
		new MemoriseMe().memoriseMe(8);
	}
}
