package com.abhishek.hackerearth;

public class JumpingOnTheClouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		for(int n = 0; n<c.length ; n++) {
				jumps++;
			if(n+2<c.length && c[n+2]==0) {
				n++;
			}
		}
		return jumps;
	}

	public static void main(String[] args) {

		int n = 6;

		int[] c = {0, 0, 0, 0, 1, 0};

		int result = jumpingOnClouds(c);
		System.out.println(result);

	}
}
