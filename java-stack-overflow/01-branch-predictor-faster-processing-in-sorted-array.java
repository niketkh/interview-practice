/*
	Processing for sorted array is faster for below scenario, due to branch prediction

	https://stackoverflow.com/questions/11227809/why-is-it-faster-to-process-a-sorted-array-than-an-unsorted-array

*/


import java.util.Random;
import java.util.Arrays;

class Main {

	public static void processSorted() {
		int n = 32768;
		int array[] = new int[n];
		Random random = new Random(0);

		for(int i=0; i<n; i++) {
			array[i] = random.nextInt(256);
		}

		Arrays.sort(array);

		long start = System.currentTimeMillis();

		long sum = 0;

		for (int i = 0; i < 100000; ++i)
        {
            // Primary loop
            for (int j = 0; j < n; ++j)
            {
                if (array[j] >= 128)
                    sum += array[j];
            }
        }

		long end = System.currentTimeMillis();
		System.out.println("Sum: " + sum);
		System.out.println("Time taken sorted: " + ((end - start)/1000) + " seconds");
	}

	public static void processUnsorted() {
		int n = 32768;
		int array[] = new int[n];
		Random random = new Random(0);

		for(int i=0; i<n; i++) {
			array[i] = random.nextInt(256);
		}

		long start = System.currentTimeMillis();

		long sum = 0;

		for (int i = 0; i < 100000; ++i)
        {
            // Primary loop
            for (int j = 0; j < n; ++j)
            {
                if (array[j] >= 128)
                    sum += array[j];
            }
        }

		long end = System.currentTimeMillis();
		System.out.println("Sum: " + sum);
		System.out.println("Time taken unsorted: " + ((end - start)/1000) + " seconds");
	}

	public static void main(String args[]) {
		processSorted();
		processUnsorted();
	}
}