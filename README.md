# README

## Overview
This repository contains Java implementations of common algorithmic problems for the Leetcode Team Challenge, each with a detailed explanation of the approach used. These implementations demonstrate efficient problem-solving techniques, including iteration, two-pointer strategies, linked list manipulation, and mathematical computations.

## Implementations

### 1. Average Salary Excluding the Minimum and Maximum
#### Approach:
- Iterate through the array to find the minimum and maximum values.
- Compute the sum of all elements.
- Subtract the min and max values from the sum and divide by the length minus two to compute the average.
#### Complexity:
- **Time Complexity:** O(n) – Single pass to determine min, max, and sum.
- **Space Complexity:** O(1) – Uses only a few extra variables.

### 2. Squares of a Sorted Array
#### Approach:
- Use a two-pointer technique to compare absolute values at both ends of the sorted input array.
- Place the larger squared value at the end of the result array and decrement the corresponding pointer.
- This ensures that the resulting array remains sorted.
#### Complexity:
- **Time Complexity:** O(n) – Each element is processed once.
- **Space Complexity:** O(n) – Stores the squared values in a new array.

### 3. Missing Number
#### Approach:
- Compute the sum of all elements in the array.
- Compute the expected sum of the first `n` natural numbers using the formula `n(n+1)/2`.
- The missing number is found by subtracting the computed sum from the expected sum.
#### Complexity:
- **Time Complexity:** O(n) – Two passes to compute sums.
- **Space Complexity:** O(1) – Uses only two integer variables.

### 4. Add Two Numbers (Linked List Representation)
#### Approach:
- Use two pointers to traverse the linked lists representing numbers in reverse order.
- Add corresponding digits while maintaining a carry-over for sums exceeding 9.
- Construct a new linked list to store the resulting sum.
#### Complexity:
- **Time Complexity:** O(max(m, n)) – Where `m` and `n` are the lengths of the input lists.
- **Space Complexity:** O(max(m, n)) – Stores the result in a new linked list.

### 5. Merge Two Sorted Lists
#### Approach:
- Use a dummy node to simplify linked list operations.
- Traverse both lists, adding the smaller of the two current nodes to the result list.
- If one list is exhausted, append the remaining nodes from the other list.
#### Complexity:
- **Time Complexity:** O(m + n) – Processes all nodes in both lists.
- **Space Complexity:** O(1) – Modifies the input lists in place.

## Summary
These implementations provide optimized solutions to the Leetcode Team Challenge, focusing on efficient space and time complexity. The use of iterative loops, two-pointer techniques, and linked list manipulations ensures that the solutions are both effective and scalable.
