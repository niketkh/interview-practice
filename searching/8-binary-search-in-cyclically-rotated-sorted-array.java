/*
	Binary Search (Preferred when array is sorted)
	Time Complexity: O(logn), Space Complexity: O(1)
*/

class Main {

	// Find Minimum in Cyclically Rotated Sorted Array
	public static int minimum(int A[]) {
		int l = 0, r = A.length - 1, mid;

		while(l < r) {
			mid = l + (r - l) / 2;
			System.out.println(mid);
			if(A[mid] > A[r] )
				l = mid + 1;
			else 
				r = mid;
		}

		return r;
	}

	public static int binarySearch(int A[], int l, int r, int key) {
		int mid;

		while(l <= r) {
			mid = l + (r - l) / 2;

			if(A[mid] == key)
				return mid;
			else if(A[mid] > key)
				r = mid - 1;
			else 
				l = mid + 1;
		}

		return -1;
	}

	public static void main(String args[]) {
		int array[] = {18, 25, 1, 4, 5, 10, 12};

		int minIndex = minimum(array);
		System.out.println("Minimum in array: " + array[minIndex]);

		int key = 10;
		// Search in first half
		int found = binarySearch(array, 0, minIndex - 1, key);

		// If not found in first half, search in second half
		if(found == -1)
			found = binarySearch(array, minIndex, array.length - 1, key);

		if(found != -1)
			System.out.println(key + " found");
	}
}