package com.s1t11.leetcode;

public class SquaresArray {
	public int[] sortedSquares(int[] nums) {

		int[] sortedSquared = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}

		int j = nums.length - 1;
		

		for (int i = 0; i < sortedSquared.length; i++) {

			sortedSquared[i] = nums[j];
			j--;

		}
		return sortedSquared;

	}

}
