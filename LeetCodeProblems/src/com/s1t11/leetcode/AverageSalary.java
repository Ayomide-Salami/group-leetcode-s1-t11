package com.s1t11.leetcode;

import java.util.Arrays;

public class AverageSalary {
	public static void main(String[] args) {

	}

	/**
	 * Return the average salary of employees excluding the minimum and maximum
	 * salary. Answers within 10-5 of the actual answer will be accepted.
	 */
	public double average(int[] salary) {

		int sum = 0;

		Arrays.sort(salary);

		for (int i = 0; i < salary.length; i++) {
			if (salary[i] == salary[0] || salary[i] == salary[salary.length - 1]) {
				continue;
			}
			sum += salary[i];
		}
		return (double) sum / (salary.length - 2);
	}

}
