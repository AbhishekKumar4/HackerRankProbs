package com.abhishek.hackerrank.search.linear;

public class LinearSearch {

	/**
	 * 
	 * @param input
	 *            array
	 * @param value
	 *            to be searched
	 * @return index of value to be searched, returns -1 if the value is not in
	 *         the array
	 */
	public static int linearSearch(int[] input, int key) {
		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(linearSearch(input, 9));
	}
}
