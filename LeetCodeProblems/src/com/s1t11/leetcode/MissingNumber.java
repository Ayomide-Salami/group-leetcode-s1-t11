package com.s1t11.leetcode;

public class MissingNumber {

	public int missingNumber(int[] nums) {
      //set a variable for sum
		int sum = 0;
     //set a variable for the expected sum
		int expectedSum = 0;

    //for loop that loops through the index of the array
		for (int i = 0; i < nums.length; i++) {

	//add sum of each element at each index
			sum += nums[i];

		}

    //another for loop that loops through the length of the array +1 

		for (int i = 0; i < nums.length+1; i++) {
			
	//add every index together into expected sum
			expectedSum += i;

		}

	//return expected sum - sum 
		return expectedSum - sum;

	}

	public static void main(String[] args) {

	}

}
