package com.abhishek.hackerrank.linearsearch;

public class MonkTakesAWalk {
	
	
	public static void main(String args[]) {
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o', 'u'};
		int takeCare = 0;
		
		String input = "JHkIsnZtTL";
		char[] inputArray = input.toCharArray();
		
		for(int i = 0; i<vowels.length;i++) {
			for(int j = 0; j<inputArray.length; j++) {
				if(vowels[i] == inputArray[j]) {
					takeCare++;
				}
			}
		}
		
		System.out.println("Result : " + takeCare);
	}

}
