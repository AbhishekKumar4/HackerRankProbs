package com.abhishek.thirtydaysofcode;

public class Loops {

	public static void main(String[] args) {
		int n = 2;
		
		for(int i = 1; i<=10; i++) {
			String result = String.format("%s x %s = %s",n ,i, n*i);
			System.out.println(result);
		}

	}

}
