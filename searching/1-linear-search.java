/*
	Linear Search in an array (Prefered if array is not sorted)
	Time Complexity: O(n), Space Complexity: O(1)

*/

class Main {

	public static int search(int A[], int key) {
		if(A.length == 0) 	return -1;

		int len = A.length;
		for(int i = 0; i < len; i++) {
			if(A[i] == key)
				return i;
		}

		return -1;
	}

	public static void main(String args[]) {
		int array[] = {1, 5, 7, 3, 18, 12};
		int key = 3;
		if(search(array, key) != -1)
			System.out.println(key + " found");
	}
}