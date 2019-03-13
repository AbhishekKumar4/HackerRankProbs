package com.abhishek.hackerearth;

import java.util.Collections;
import java.util.Scanner;

public class Staircase {

	// Complete the staircase function below.
	static void staircase(int n) {

		for (int i = 1; i <= n; i++) {
			String line = "";
			for (int j = 1; j <= n - i; j++) {
				line = line.concat(" ");
			}
			line = line + String.join("", Collections.nCopies(i, "#"));
			System.out.println(line);
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}

}
