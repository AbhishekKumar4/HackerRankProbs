package com.abhishek.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] input) {
		System.out.println("Array before sorting : " + Arrays.toString(input));

		for (int i = 1; i < input.length - 1; i++) {
			int value = input[i];
			int hole = i;
			while (hole > 0 && input[hole - 1] > value) {
				input[hole] = input[hole - 1];
				hole--;
			}
			input[hole] = value;
		}
		System.out.println("Array after sorting : " + Arrays.toString(input));

	}

	public static void main(String args[]) {
		int[] input = { 2, 5, 44, 2, 75, 56, 98, 14 };
		insertionSort(input);
	}

}
