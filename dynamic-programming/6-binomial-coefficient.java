/*

	Find C(n, k) 

*/

class Main {


	// Recursive Approach
	// C(n, k) = C(n-1, k-1) + C(n-1, k)
	// Time Complexity: O(2^n), Space Complexity: O(2^n)
	public static int binomialCoefficient(int n, int k) {
		if(n == k || k == 0)
			return 1;

		return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
	}

	// Iterative Approach
	// C(n, k) = (n * (n-1) * ... * n-k+1) / (1 * 2 * 3 * ... * k)
	// Also C(n, k) = C(n, n-k)
	// Time Complexity: O(k), Space Complexity: O(1)
	public static int binomialCoefficientI(int n, int k) {
		int coefficient = 1;

		if(k > n - k)
			k = n - k;

		for(int i = 0; i < k; i++) {
			coefficient *= (n-i) / (i+1);
		}

		return coefficient;
	}

	// Dynamic Programming Approach for Above Recursive Solution
	// Time Complexity: O(n*k), Space Complexity: O(n*k)
	public static int binomialCoefficientDP(int n, int k) {
		int coefficients[][] = new int[n+1][k+1];

		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= Math.min(i, k); j++) {
				if(i == j || j == 0)
					coefficients[i][j] = 1;
				else 
					coefficients[i][j] = coefficients[i-1][j-1] + coefficients[i-1][j];
			}
		}

		return coefficients[n][k];
	}


	// Dynamic Programming Approach - Space Optimized
	// Time Complexity: O(n*k), Space Complexity: O(k)
	public static int binomialCoefficientDPO(int n, int k) {
		int coefficients[] = new int[k+1];

		coefficients[0] = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = Math.min(i, k); j > 0; j--) {
				coefficients[j] = coefficients[j] + coefficients[j-1];
			}
		}

		return coefficients[k];
	}




	public static void main(String args[]) {
		System.out.println("Find Binomial Coefficient 5C2 - Recursive Approach: " + binomialCoefficient(5, 2));
		System.out.println("Find Binomial Coefficient 5C2 - Iterative Approach: " + binomialCoefficientI(5, 2));
		System.out.println("Find Binomial Coefficient 5C2 - DP Approach: " + binomialCoefficientDP(5, 2));
		System.out.println("Find Binomial Coefficient 5C2 - DP Approach Optimized: " + binomialCoefficientDPO(5, 2));

	}
}