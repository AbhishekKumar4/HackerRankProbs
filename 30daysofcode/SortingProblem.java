package com.abhishek.thirtydaysofcode;

import java.util.Scanner;

public class SortingProblem {

	public static void bubbleSort(int[] input) {
		int swaps = 0;
		for (int i = 0; i <= input.length - 1; i++) {
			for (int j = 0; j <= input.length - 1 - 1; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					swaps++;
				}
			}
		}
		System.out.println(String.format("Array is sorted in %s swaps.", swaps));
		System.out.println(String.format("First Element: %s", input[0]));
		System.out.println(String.format("Last Element: %s", input[input.length - 1]));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		bubbleSort(a);
	}

}
