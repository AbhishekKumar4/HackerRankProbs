package com.abhishek.thirtydaysofcode;

import java.util.Scanner;

public class BinaryNumbers {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();

		String binary = "";
		while (n > 0) {
			binary = binary.concat(Integer.toString(n % 2));
			n = n / 2;
		}
		System.out.println(binary);
		int index = binary.length() - 1;
		int sumofones = 0;
		int tempSum = 0;
		for (int i = index; i >= 0; i--) {
			if (binary.charAt(i) == '1') {
				tempSum++;
			} else {
				if (sumofones == 0) {
					sumofones = tempSum;
				} else if (tempSum > sumofones) {
					sumofones = tempSum;

				}
				tempSum = 0;
			}
		}
		if (tempSum > sumofones) {
			sumofones = tempSum;
		}
		System.out.println(sumofones);
	}

}
