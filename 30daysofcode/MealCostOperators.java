package com.abhishek.thirtydaysofcode;

public class MealCostOperators {

	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double tipCost = meal_cost * tip_percent/100;
		double taxCost = meal_cost * tax_percent/100;
		
		double totalCost = meal_cost + tipCost + taxCost;
		System.out.println(String.format("%.5f", totalCost));
	}

	public static void main(String[] args) {
		double meal_cost = 12.00;
		int tip_percent = 20;
		int tax_percent = 8;
		solve(meal_cost, tip_percent, tax_percent);
	}

}
