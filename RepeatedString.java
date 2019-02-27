package com.abhishek.hackerearth;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int count = 0;
		long divisionResult = (n / s.length());
		long remainder = n % s.length();
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)) == 'a') {
				count++;
			}
		}
		long result = count * divisionResult;
		/*
		 * if(remainder != 0) { if(s.charAt((int) (remainder-1)) == 'a'){ result
		 * = result +1; } }
		 */
		for (int j = 0; j < remainder; j++) {
			if (s.charAt(j) == 'a') {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "aba";
		long n = 10;

		System.out.println(repeatedString(s, n));
		System.out.println(repeatedString("a", 1000000000000L));

	}

}
