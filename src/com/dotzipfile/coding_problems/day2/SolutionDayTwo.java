package com.dotzipfile.coding_problems.day2;

public class SolutionDayTwo {

	public int[] solve(int[] arr) {

		// Define return array and long to hold total sum of items in the array
		int[] prodArr = new int[arr.length];
		long totalSum = 1L;

		// Sum up items in the array
		for(int i = 0; i < arr.length; i ++) {

			totalSum *= arr[i];
		}

		for(int i = 0; i < arr.length; i ++) {

			// Insert total sum divided by current index 
			// This is to exclude current element from the sum
			prodArr[i] = (int)totalSum / arr[i];
		}

		// Return finished array if there's more than 1 element
		// Otherwise return an array with no elements
		return prodArr.length > 1 ? prodArr: new int[0];
	}
}
