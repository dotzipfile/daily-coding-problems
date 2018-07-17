package com.dotzipfile.coding_problems.day1;

import java.util.Arrays;

public class SolutionDayOne {

	public boolean solve(int[] arr, int k) {

		Arrays.sort(arr);

		// Initialise access values for start and end of array
		int i = 0, j = arr.length -1;

		// Loop until method terminates
		while(true) {

			// Make sure no access values have gone out of bounds
			if(i > arr.length - 1 || j < 0) {

				return false;
			} else if(arr[i] > arr[j]) {
				// If access values have crossed over, return false as a suitable value will never be reached

				return false;
			} else if(arr[i] + arr[j] == k) {
				// Return true if suitable values have been found (same number at the same index counts)

				return true;
			} else if(arr[i] + arr[j] < k) {
				// Increment start access value if current sum is smaller than target

				i ++;
			} else if(arr[i] + arr[j] > k) {
				// Decrement end access value if current sum is larger than target

				j --;
			}
		}
	}

}
