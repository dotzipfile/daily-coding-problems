package com.dotzipfile.coding_problems;

import com.dotzipfile.coding_problems.day2.SolutionDayTwo;

public class Main {

	public static void main(String[] args) {
		int[] arr = {2};

		SolutionDayTwo sol2 = new SolutionDayTwo();
		int[] prodArr = sol2.solve(arr);

		for(int item: prodArr) {

			System.out.println(item);
		}
	}
}
