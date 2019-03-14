package com.abhishek.hackerrank;

public class CountingValleys {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int level = 0;
		int valleys = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				level++;
				if(level == 0) {
					valleys++;
				}
			}
			if (s.charAt(i) == 'D') {
				level--;
			}
		}

		return valleys;
	}

	public static void main(String args[]) {

		int numberSteps = 8;
		String s = "UDDDUDUU";
		int result = countingValleys(numberSteps, s);
		System.out.println("Result : " + result);
	}

}
