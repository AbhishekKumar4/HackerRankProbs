package com.abhishek.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int[] input) {
		System.out.println("Array before sorting : " + Arrays.toString(input));
		
		for(int i  = 0; i<input.length-1; i++) {
			int min_index = i;
			for(int j = i+1; j<input.length;j++) {
				if(input[j] < input[min_index]) {
					min_index = j;
				}
			}
			int temp = input[min_index];
			input[min_index] = input[i];
			input[i] = temp;
		}
		System.out.println("Array after sorting : " + Arrays.toString(input));
		
	}

	public static void main(String args[]) {
		int[] input = {2, 5, 44, 75, 56, 98, 14};
		selectionSort(input);
	}
}
