package com.s1t11.leetcode;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
	}

	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array
	 * of the squares of each number sorted in non-decreasing order.
	 */

	public int[] sortedSquares(int[] nums) {

		int[] squaredNums = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			squaredNums[i] = nums[i] * nums[i];
		}
		Arrays.sort(squaredNums);
		return squaredNums;

	}

}