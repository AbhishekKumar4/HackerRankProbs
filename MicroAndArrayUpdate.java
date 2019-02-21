package com.abhishek.hackerearth;

public class MicroAndArrayUpdate {
	
	int microAndArrayUpdate(int input) {
		int sum = 0;
		for(int i = 1; i<=input; i++){
			if(input%i == 0) {
				System.out.println("Divisor : " + i);
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String args[]) {
		System.out.println("Sum is : " + new MicroAndArrayUpdate().microAndArrayUpdate(9));
	}

}
