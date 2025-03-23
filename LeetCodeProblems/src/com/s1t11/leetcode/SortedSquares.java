package com.s1t11.leetcode;

public class SortedSquares {
	
	public int[] sortedSquares(int[] nums) {
		//Declare a new array with the same length as nums
		int [] result = new int [nums.length];
		
		//Declare a pointer for that starts at the leftmost index of the new array, 0.
		int leftIndex = 0;
		
		//Declare a pointer for that starts at the rightmost index of the new array, its length - 1.
		int rightIndex = nums.length - 1;
		
		//Declare a pointer for the current index, starting at the last element of the array
		int index = nums.length - 1;
		
		while(leftIndex <= rightIndex) {
			
			//Checks if the element at the left pointer has greater absolute value
			//than the element at the right pointer  
			if(Math.abs(nums[leftIndex]) > Math.abs(nums[rightIndex])) {
				
				//The new array has its largest non-sorted value
				//placed in the appropriate position, at the current index, index.
				result[index] = nums[leftIndex] * nums[leftIndex];
				
				//Current index is updated
				index--;
				
				//Left pointer is updated
				leftIndex++;
			}
			
			//Checks if the element at the right pointer has greater or equal absolute value
			//than the element at the left pointer 
			else {
				
				//The new array has its largest non-sorted value
				//placed in the appropriate position, at the current index, index.
				result[index] = nums[rightIndex] * nums[rightIndex];
				
				//Current index is updated
				index--;
				
				//Right pointer is updated
				rightIndex--;
			}
		}
		
		//Return the sorted square array
		return result;
	}
	
}
