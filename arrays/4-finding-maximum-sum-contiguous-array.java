/*
	Given an arrays of positives and negatives, find contiguous sub array maximum sum
*/


class Main {

	// Find sum of all subarrays
	// Time Complexity: O(n^2), Space Complexity: O(1)
	public static int findMaxSumNaive(int A[]) {
		int currentSum = 0, maxSum = Integer.MIN_VALUE, len = A.length;
		for(int i = 0; i < len; i++) {
			currentSum = 0;
			for(int j = i; j < len; j++) {
				currentSum += A[j];
				if(currentSum > maxSum)
					maxSum = currentSum;
			}
		}

		return maxSum;

	}

	// Kadane Algorithm
	// Time Complexity: O(n), Space Complexity: O(1)
	public static int findMaxSum(int A[]) {
		int currentSum = 0, maxSum = 0, len = A.length;

		// Handle for case where all numbers are negative
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < len; i++) {
			if(A[i] > max)
				max = A[i];
		}

		if(max < 0) return max;

		for(int i = 0; i < len; i++) {
			if(currentSum > 0)
				currentSum = Math.max(currentSum + A[i], A[i]);

			if(currentSum > maxSum)
				maxSum = currentSum;
		}

		return maxSum;

	}

	public static void main(String args[]) {
		// int array[] = {-1, -2, -3};
		int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};

		System.out.println("Max Contiguous Sum - Naive Approach: " + findMaxSumNaive(array));
		System.out.println("Max Contiguous Sum - Kadane Algorithm: " + findMaxSumNaive(array));
	}
}