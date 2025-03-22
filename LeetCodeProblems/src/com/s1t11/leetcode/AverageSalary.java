package com.s1t11.leetcode;

public class AverageSalary {
	public static void main(String[] args) {

	}

	/**
	 * Return the average salary of employees excluding the minimum and maximum
	 * salary. Answers within 10-5 of the actual answer will be accepted.
	 */
	public double average(int[] salary) {
		int sum = 0;
		int minValue = salary[0];
		int maxValue = salary[0];

		for (int i = 0; i < salary.length; i++) {
			if (minValue > salary[i]) {
				minValue = salary[i];
			}
			if (maxValue < salary[i]) {
				maxValue = salary[i];
			}
			sum += salary[i];
		}

		return (double) (sum - minValue - maxValue) / (salary.length - 2);
	}

}
