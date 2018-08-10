/*
	Binary Search (Preferred when array is sorted)
	Time Complexity: O(logn), Space Complexity: O(1)
*/

class Main {
	public static int binarySearch(int A[], int key) {
		int l = 0, r = A.length, mid;

		while(r - l > 1) {
			mid = l + (r - l) / 2;

			if(A[mid] >= key)
				r = mid;
			else 
				l = mid;
		}

		return A[r];
	}

	public static int ceil(int A[], int key) {
		if(key > A[A.length - 1])
			return -1;
		else if(key <= A[0])
			return A[0];

		return binarySearch(A, key);
	}

	public static void main(String args[]) {
		int array[] = {1, 2};

		int key = 2;
		int ceil = ceil(array, key);
		if(ceil != -1)
			System.out.println("Ceil of " + key + " = " + ceil);
	}
}