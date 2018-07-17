package com.dotzipfile.coding_problems;

import com.dotzipfile.coding_problems.day1.SolutionDayOne;

public class Main {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 1};
		int k = 2;

		SolutionDayOne sol1 = new SolutionDayOne();
		System.out.println(sol1.solve(arr, k));
	}
}
