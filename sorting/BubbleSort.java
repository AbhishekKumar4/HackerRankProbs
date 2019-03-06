package com.abhishek.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] input) {
		System.out.println("Array before sorting : " + Arrays.toString(input));

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < input.length - 1 - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}

		System.out.println("Array before sorting : " + Arrays.toString(input));
	}

	public static void main(String args[]) {
		int[] input = { 2, 5, 44, 2, 75, 56, 98, 14 };
		bubbleSort(input);
	}

}
