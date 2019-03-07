package com.abhishek.thirtydaysofcode;

import java.util.Scanner;

public class LetsReview {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int n = scanner.nextInt();
		scanner.nextLine();

		String[] arrayString = new String[n];

		
		for (int i = 0; i < n; i++) {
			//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			String input = scanner.nextLine();
			String left = "";
			String right = "";
			for(int j = 0; j<input.length(); j++) {
				if(j==0) {
					left = left.concat(input.substring(j,j+1));
				}
				if(j!=0 && j%2 ==0) {
					left = left.concat(input.substring(j,j+1));
				}
				else if(j%2 !=0) {
					right = right.concat(input.substring(j,j+1));
				}
			}
			arrayString[i] = left + "  "+ right;
		}
		
		scanner.close();
		
		for(int i = 0; i<arrayString.length; i++) {
			System.out.println(arrayString[i]);
		}

	}

}
