package com.abhishek.hackerrank;

/*Sunny and Johnny like to pool their money and go to the ice cream parlor.
 *Johnny never buys the same flavor that Sunny does. The only other rule they have is that they spend all of their money.
 *Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 *For example, they have m = 6 to spend and there are flavors costing cost = [1, 3, 4, 5, 6].
 *The two flavors costing  1 and 5 meet the criteria. Using 0-based indexing, they are at indices 0 and 3.
*/
public class IceCreamParlor {

	public static void compute(int[] array, int targetSum) {
		for(int i = 0; i<array.length; i++ ) {
			for(int j = i+1; j<array.length;j++) {
				if(array[i] + array[j]==targetSum) {
					System.out.println("Values are :: " + i + " and " + j);
				}
			}
		}
	}
	
	public int[] sortArray(int[] array) {
		//Implement sorting
		return null;
	}
	public static void main(String args[]) {
		//taking sorted array as of now
		//sorting function to implement in case of unsorted array
		int[] sampleInput = new int[] {1, 5, 6, 8};
		compute(sampleInput, 6);
	}
}
