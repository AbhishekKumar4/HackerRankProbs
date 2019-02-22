package com.abhishek.hackerrank;

import java.io.IOException;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		for(int i=0; i<n; i++) {
			int duplicates = 0;
			for(int j=i+1; j<n; j++) {
				if(ar[i] == ar[j]) {
					duplicates = duplicates + 1;
				}
			}
			int remainder = duplicates % 2;
			pairs = pairs + remainder;
		}
		return pairs;	
	}

	public static void main(String[] args) throws IOException {

		int[] test = {10 ,20 ,20 ,10 ,10 ,30 ,50 ,10 ,20};
		int result = sockMerchant(9, test);

		System.out.println(result);

	}
}
