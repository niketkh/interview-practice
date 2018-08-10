/*
	Binary Search (Preferred when array is sorted)
	Time Complexity: O(logn), Space Complexity: O(1)
*/

class Main {

	public static int binarySearch(int A[], int key) {
		int l = 0, r = A.length, mid;

		while(r - l > 1) {
			mid = l + (r - l)/2;

			if(A[mid] <= key)
				l = mid;
			else
				r = mid;
		}

		return A[l];
	}

	public static int floor(int A[], int key) {
		if(key < A[0]) return -1;

		return binarySearch(A, key);
	}

	public static void main(String args[]) {
		int array[] = {1, 5, 18, 19, 27, 45};

		int key = 29;
		int floor = floor(array, key);
		System.out.println("Floor of " + key + " = " + floor);

	}
}