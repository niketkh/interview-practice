/*
	Binary Search (Preferred when array is sorted)
	Time Complexity: O(logn), Space Complexity: O(1)
*/

class Main {

	public static int firstOccurence(int A[], int key) {
		int l = 0, r = A.length, mid;

		while(r - l > 1) {
			mid = l + (r - l)/2;

			if(A[mid] >= key)
				r = mid;
			else
				l = mid;
		}

		return r;
	}

	public static int lastOccurence(int A[], int key) {
		int l = 0, r = A.length, mid;

		while(r - l > 1) {
			mid = l + (r - l)/2;

			if(A[mid] <= key)
				l = mid;
			else
				r = mid;
		}

		return l;
	}

	public static void main(String args[]) {
		int array[] = {1, 5, 5, 5, 5, 18, 19, 27, 45};

		int key = 5;
		int first = firstOccurence(array, key);
		int last = lastOccurence(array, key);
		if(array[first] == key && array[last] == key)
			System.out.println("Number of occurences of " + key + " = " + (last - first + 1));

	}
}