package com.abhishek.hackerrank.search.binary;

public class BinarySearchAlgo {

	/**
	 * 
	 * @param input
	 *            array
	 * @param value
	 *            to be searched
	 * @return index of value to be searched, returns -1 if the value is not in
	 *         the array
	 */
	public static int binarySearch(int[] input, int key) {

		int low = 0;
		int high = input.length - 1;
		while (low <= high) {
			int mid = low + (high-low)/ 2;
			if (input[mid] < key) {
				low = mid + 1;
			} else if (input[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(input, 4));
	}

}
