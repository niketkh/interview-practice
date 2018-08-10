import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String args[]) {
		List<Integer> integerList = new ArrayList<>();

		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);

		System.out.println(integerList);

		// Convert Integer List to int array

		// Method 1 - Java 8
		int intArray[] = integerList.stream().mapToInt(i -> i).toArray();

		// Method 2 - Java 8
		// int intArray[] = integerList.stream().mapToInt(Integer::intValue).toArray();

		// Method 3 - Java 7
		// int i = 0;
		// int intArray[] = new int[integerList.size()];
		// for(Integer a: integerList) {
		// 	intArray[i] = a;
		// 	i++;
		// }

		for(int a: intArray) {
			System.out.print(a + " ");
		}
		System.out.println();


		// Convert int array to integer list

		// Method 1 - Java 8
		integerList = Arrays.stream(intArray).boxed().collect(Collectors.toList());

		// Method 2 - Java 8
		// integerList = IntStream.of(intArray).boxed().collect(Collectors.toList());

		// Method 3 - Java 7
		// integerList = new ArrayList<>(intArray.length);
		// for(int a: intArray)
		// 	integerList.add(a);

		System.out.println(integerList);


		// Convert integer list to integer array
		Integer integerArray[] = new Integer[integerList.size()];
		integerList.toArray(integerArray);

		System.out.println("\nConvert Integer List to Integer Array");
		for(Integer a: integerArray)
			System.out.print(a + " ");
		System.out.println();


		// Convert integer array to integer list
		System.out.println("\nConvert Integer Array to Integer List");
		integerList = Arrays.asList(integerArray);
		System.out.println(integerList);

	}
}