package com.s1t11.leetcode;

public class AverageSalary {
	public static void main(String[] args) {

	}

	/**
	 * Return the average salary of employees excluding the minimum and maximum
	 * salary. Answers within 10-5 of the actual answer will be accepted.
	 */
	public double average(int[] salary) {
		//Declare variables to store the sum, minimum value and maximum value of the array,
		//Initialize the variables to 0 and the first element of the array. 
		int sum = 0;
		int minValue = salary[0];
		int maxValue = salary[0];

		//Iterates over the entire array 
		for (int i = 0; i < salary.length; i++) {
			//Updates the minValue if a smaller value than the current minValue is found
			if (minValue > salary[i]) {
				minValue = salary[i];
			}
			//Updates the maxValue if a larger value than the current maxValue is found
			if (maxValue < salary[i]) {
				maxValue = salary[i];
			}
			//Updates the sum by adding the current array value to itself
			sum += salary[i];
		}

		//Casts the sum of the array minus the minValue and maxValue into a double,
		//Perform double division of the new sum divided the array length minus 2,
		//return the resulting average.
		return (double) (sum - minValue - maxValue) / (salary.length - 2);
	}

}
