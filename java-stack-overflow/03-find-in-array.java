import java.util.Arrays;
import java.util.stream.IntStream;

class Main {

	public static void main(String args[]) {
		int array[] = {1, 20, 30, 78, 48, 90 , 62, 37};

		int key = 78;
		int found = Arrays.binarySearch(array, key);
		System.out.println(key + " found " + found);


		System.out.println(key + " " + IntStream.of(array).anyMatch(x -> x == key));

		// Arrays.asList(array).contains(key) // Use with objects
		
	}
}