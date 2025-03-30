package com.s1t11.leetcode;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		// set a variable for sum
		int sum = 0;
		// set a variable for the expected sum, set its value to the the length of the
		// array
		int expectedSum = nums.length;
		// for loop that loops through the index of the array
		for (int i = 0; i < nums.length; i++) {
			// add sum of each element at each index
			sum += nums[i];
			
			// add every index together into expected sum
			expectedSum += i;
		}

		// return expected sum - sum
		return expectedSum - sum;
	}

	public static void main(String[] args) {
	}
}