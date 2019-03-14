package com.abhishek.hackerearth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<Integer>();
		int alice = 0;
		int bob = 0;
		for(int i =0; i<a.size();i++) {
			if(a.get(i).intValue() > b.get(i).intValue()) {
				alice++;
			}
			if(a.get(i).intValue() < b.get(i).intValue()) {
				bob++;
			}
		}
		result.add(alice);
		result.add(bob);
		return result;
	}

	public static void main(String[] args) throws IOException {

		List<Integer> a = new ArrayList<>();

		List<Integer> b = new ArrayList<>();

		List<Integer> result = compareTriplets(a, b);
		System.out.println(result);
	}
}
