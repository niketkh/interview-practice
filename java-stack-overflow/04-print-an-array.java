import java.util.*;

class Main {
	public static void main(String args[]) {
		Integer array[] = {1, 2, 3, 4, 5, 6};

		System.out.println(Arrays.toString(array));

		System.out.println(Arrays.asList(array));

		Integer twoDArray[][] = {
			{1, 2},
			{3, 4},
			{5, 6}
		};

		// System.out.println(Arrays.toString(twoDArray));

		System.out.println(Arrays.deepToString(twoDArray));

		// System.out.println(Arrays.asList(twoDArray));
	}
}