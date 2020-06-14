import java.util.List;
import java.util.Arrays;

class Main {

	public static int binarySearchUnknownLength(int A[], int key) {
		int p = 0;

		while(true) {
			try {
				int idx = (1 << p) - 1;

				if(A[idx] == key)
					return idx;
				else if(A[idx] > key)
					break;
			}
			catch(IndexOutOfBoundsException e) {
				break;
			}

			p++;
		}


		int l = Math.max(0, 1 << (p - 1)), r = (1 << p) - 2;
		return binarySearch(A, l, r, key);
	}

	public static int binarySearch(int A[], int l, int r, int key) {
		int mid;

		while(l <= r) {
			mid = l + (r - l)/2;
			try {
				if(A[mid] == key)
					return mid;
				else if(A[mid] > key)
					r = mid - 1;
				else 
					l = mid + 1;
			}
			catch(IndexOutOfBoundsException e) {
				r = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String args[]) {
		int A[] = {1, 3, 5, 7, 9, 17, 24, 28, 67, 87};

		int key = 1;
		int idx = binarySearchUnknownLength(A, key);
		if(idx != -1)
			System.out.println(key + " found");

	}
}