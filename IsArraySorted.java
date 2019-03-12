package com.abhishek.recursion;

public class IsArraySorted {

	public static int isArraySorted(int[] array, int index) {
		if (index == 1) {
			return 1;
		}
		return array[index - 1] < array[index - 2] ? 0 : isArraySorted(array, index - 1);
	}

	public static void main(String args[]) {
		int[] input = { 1, 2, 3, 4, 6, 5 };
		System.out.println(IsArraySorted.isArraySorted(input, input.length));
	}

}
