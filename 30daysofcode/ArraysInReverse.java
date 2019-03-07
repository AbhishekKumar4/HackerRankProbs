package com.abhishek.thirtydaysofcode;

public class ArraysInReverse {

	public static void printReverse(int[] input) {

		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String args[]) {
		int[] input = { 1, 4, 3, 2 };
		printReverse(input);
	}

}
