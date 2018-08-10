class Main {


	// Numbers in array lies between 1 to n + 1
	// Where n is length of array
	public static int findMissing(int A[]) {
		int n = A.length;

		int sum = (n + 1) * (n + 2) / 2;
		int arraySum = 0;

		for(int element: A) {
			arraySum += element;
		}

		return sum - arraySum;
	}

	public static int findMissingUsingExor(int A[]) {
		int exor = 0, n = A.length; 

		for(int i = 1; i <= n + 1; i++)
			exor ^= i;

		for(int i = 0; i < n; i++)
			exor ^= A[i];

		return exor;
	}

	public static void main(String args[]) {
		int array[] = {1, 2, 3, 4, 6};

		System.out.println("Missing number: " + findMissing(array));
		System.out.println("Missing number using Exor: " + findMissingUsingExor(array));
	}


}