/*
	Binary Search (Preferred when array is sorted)
	Time Complexity: O(logn), Space Complexity: O(1)
*/

class Main {

	public static int binarySearch(int A[], int key) {
		int l = 0, r = A.length - 1, mid;

		while(l <= r) {
			mid = l + (r - l)/2;

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
		int array[] = {1, 5, 18, 19, 27, 45};
		int key = 48;
		if(binarySearch(array, key) != -1) {
			System.out.println(key + " found");
		}

	}
}