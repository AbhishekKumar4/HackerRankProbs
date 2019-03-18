package com.abhishek.hackerrank.search.binary;

/*Bishu went to fight for Coding Club. There were N soldiers with various powers. 
 * There will be Q rounds to fight and in each round Bishu's power will be varied. With power M, 
 * Bishu can kill all the soldiers whose power is less than or equal to M(<=M). After each round, 
 * All the soldiers who are dead in previous round will reborn.Such that in each round there will be N soldiers to fight. 
 * As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and total sum of their powers.
*/
public class BishuAndSoldiers {

	public static void bishuAndSoldiers(int[] input, int target) {
		int low = 0;
		int high = input.length - 1;
		int index = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (input[mid] > target) {
				high = mid - 1;
			} else if (input[mid] < target) {
				low = mid + 1;
			} else {
				index = mid;
				break;
			}
		}
		if (index == 0) {
			index = input.length - 1;
		}
		int canKill = 0;
		int sumOfPowers = 0;
		for (int i = 0; i <= index; i++) {
			canKill = canKill + 1;
			sumOfPowers = sumOfPowers + input[i];
		}
		System.out.println("Bishnu can kill : " + canKill);
		System.out.println("Sum of powers : " + sumOfPowers);
	}

	public static void main(String args[]) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		bishuAndSoldiers(input, 2);
	}

}
