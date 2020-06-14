/*
	Bell Numbers - Number of ways to partition a set

	Let S(n, k) be total number of partitions of n elements into k non empty subsets. 
	The value of nth Bell Number is sum of S(n, k) for k = 1 to n.

	Bell(n) = Sum from k = 0 to n of S(n, k)

	Recursive formula to find S(n, k):

	S(n, k) = k * S(n-1, k) + S(n-1, k-1)

	S(n, k) is called Stirling numbers of second kind

*/

class Main {

	public static int bellNumber(int n) {
		int bellNumber = 0;

		for(int i = 0; i <= n; i++)
			bellNumber += partitions(n, i);

		return bellNumber;
	}

	public static int bellNumberDP(int n) {
		int bellNumber = 0;

		for(int i = 0; i <= n; i++)
			bellNumber += partitionsDP(n, i);

		return bellNumber;
	}

	// Recursive Approach
	// Count number of ways to partition a set of n elements into k non empty subsets
	// Time Complexity: O(2^n)
	public static int partitions(int n, int k) {
		if(n == 0 || k == 0 || k > n)
			return 0;

		if(k == 1 || k == n)
			return 1;

		return k * partitions(n-1, k) + partitions(n-1, k-1);
	}

	// DP Approach
	public static int partitionsDP(int n, int k) {
		int partitions[][] = new int[n+1][k+1];

		// Base cases
		for(int i = 0; i <= n; i++)
			partitions[i][0] = 0;

		for(int i = 0; i <= k; i++)
			partitions[0][i] = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= Math.min(i, k); j++) {
				if(j == 1 || j == i)
					partitions[i][j] = 1;
				else 
					partitions[i][j] = j * partitions[i-1][j] + partitions[i-1][j-1];
			}
		}

		return partitions[n][k];


	}

	public static void main(String args[]) {
		System.out.println("First Few Bell Numbers - Recursive Approach");
		for(int i = 1; i <= 10; i++)
			System.out.print(bellNumber(i) + " ");
		System.out.println();
		System.out.println("First Few Bell Numbers - DP Approach");
		for(int i = 1; i <= 10; i++)
			System.out.print(bellNumberDP(i) + " ");
	}
}