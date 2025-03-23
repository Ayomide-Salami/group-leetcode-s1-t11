package com.s1t11.leetcode;

import java.util.Arrays;

public class MissingNumber {
	
	public static int missingNumber(int[] nums) {
		//checks if the smallest value of the array is 0
		//if it is not then the missing number is 0.
		if(Arrays.stream(nums).min().getAsInt() != 0) {
			return 0;
		}
		
		//Declare a variable that stores the largest value of the array
		int endRange = Arrays.stream(nums).max().getAsInt();
		
		//Declare a variable that stores the sum from [0,endRange]
		//Using Gauss' Summation Formula
		int supposedSum = (endRange*(endRange + 1))/2;
		
		//Declare a variable that stores the sum of all elements in the array
		int actualSum = Arrays.stream(nums).sum();
		
		//If supposedSum and actualSum match then the missing number is endRange + 1
		if(supposedSum-actualSum == 0) {
			return endRange + 1;
		}
		
		//Returns the missing number
		return supposedSum-actualSum;
	}
}
