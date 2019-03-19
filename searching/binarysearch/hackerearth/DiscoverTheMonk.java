package com.abhishek.hackerrank.search.binary;

/**
 * 
 * You are given an array A of size N, and Q queries to deal with. For each
 * query, you are given an integer X, and you're supposed to find out if X is
 * present in the array A or not.
 * 
 * @author abhishek
 *
 */

public class DiscoverTheMonk {

	public static void discoverTheMonk(int[] input, int target) {
		int low = 0;
		int high = input.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (input[mid] > target) {
				high = mid - 1;
			} else if (input[mid] < target) {
				low = mid + 1;
			} else {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

	public static void main(String args[]) {
		int[] input = { 10, 20, 30, 40, 50 };
		discoverTheMonk(input, 50);
	}

}
