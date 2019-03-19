package com.abhishek.hackerrank.search.binary;

import java.util.Arrays;

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
		// Need to sort input array for binary search
		input = sortArray(input);
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

	public static int[] sortArray(int[] input) {
		System.out.println("Array before sorting : " + Arrays.toString(input));
		for (int i = 0; i <= input.length - 1; i++) {
			for (int j = 0; j <= input.length - 2; j++) {
				if (input[j + 1] < input[j]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		System.out.println("Array after sorting : " + Arrays.toString(input));
		return input;
	}

	public static void main(String args[]) {
		int[] input = { 50, 40, 30, 20, 10 };
		discoverTheMonk(input, 60);
	}

}
