package com.s1t11.leetcode;

public class MissingNumber {

	public int missingNumber(int[] nums) {

		int sum = 0;
		int expectedSum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		
		for (int i = 0; i < nums.length+1; i++) {
			expectedSum += i;

		}
		return expectedSum - sum;

	}

	public static void main(String[] args) {

	}

}
