package com.abhishek.hackerearth;

public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {

		double positives = 0;
		double negatives = 0;
		double zeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negatives++;
			} else if (arr[i] > 0) {
				positives++;
			} else {
				zeros++;
			}
		}
		System.out.println(String.format("%.6f", positives / arr.length));
		System.out.println(String.format("%.6f", negatives / arr.length));
		System.out.println(String.format("%.6f", zeros / arr.length));
	}

	public static void main(String[] args) {
		int[] arr = { -4, 3, -9, 0, 4, 1 };

		plusMinus(arr);
	}
}
