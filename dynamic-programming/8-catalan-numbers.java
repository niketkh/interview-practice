/*
	Catalan Numbers

	Cn+1 = Summation from i = 0 to n of Ci * Cn-i where C0 = 1

	Cn = (2n)! / (n! * (n+1)!)

	Cn = C(2n, n) / (n + 1)

	Useful in many counting problems:
	1) Count number of expressions containing n pairs of parentheses which are balanced
	2) Number of Binary Search Trees with n keys
	3) Number of Full Binary Trees

*/

class Main {

	// Recursive Approach 
	// Based on formula 
	// Cn+1 = Summation from i = 0 to n of Ci * Cn-i where C0 = 1
	// Time Complexity: O(3^n), Space Complexity: O(3^n)
	public static int catalanNumberNaive(int n) {
		if(n == 0) return 1;

		int sum = 0;
		for(int i = 0; i <= n-1; i++) 
			sum += catalanNumberNaive(i) * catalanNumberNaive(n-1-i);

		return sum;
	}

	// DP Approach
	// Time Complexity: O(n^2), Space Complexity: O(n)
	public static int catalanNumberDP(int n) {
		if(n == 0) return 1;

		int catalanNumbers[] = new int[n+1];
		catalanNumbers[0] = 1;

		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++)
				catalanNumbers[i] += catalanNumbers[j] * catalanNumbers[i-1-j];
		}

		return catalanNumbers[n];
	}

	// Using Binomial Coefficient
	// Cn = C(2n, n) / (n+1)
	// Time Complexity: O(n), Space Compexity: O(1)
	public static int catalanNumber(int n) {
		int catalanNumber = 1;
		for(int i = 0; i < n; i++) {
			catalanNumber *= (2 * n - i);
			catalanNumber /= (i+1);
		}

		catalanNumber = catalanNumber / (n+1);

		return catalanNumber;
	}

	public static void main(String args[]) {
		System.out.println("Print first 11 catalan numbers - Recursive Approach");
		for(int i = 0; i <= 10; i++)
			System.out.print(catalanNumberNaive(i) + " ");

		System.out.println();

		System.out.println("Print first 11 catalan numbers - DP Approach");
		for(int i = 0; i <= 10; i++)
			System.out.print(catalanNumberDP(i) + " ");

		System.out.println();

		System.out.println("Print first 11 catalan numbers - Using Binomial Coefficient Approach");
		for(int i = 0; i <= 10; i++)
			System.out.print(catalanNumber(i) + " ");

		System.out.println();
	}
} 