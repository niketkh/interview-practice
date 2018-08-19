import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;

class Main {
	public static void main(String args[]) throws IOException {
		// Write to File - Method 1
		// PrintWriter pw = new PrintWriter("06-write-string-to-file.txt");
		// pw.println("Hello World");
		// pw.println("Hello India");
		// pw.println("Hello Mumbai");
		// pw.close();

		// Write to File - Method 2
		List<String> lines = Arrays.asList("Hello World", "Hello Mumbai");
		Files.write(Paths.get("06-write-string-to-file.txt"), lines);

		// Read From File - Method 1
		// Scanner sc = new Scanner(new File("06-write-string-to-file.txt"));
		// String content = sc.useDelimiter("\\A").next();
		// sc.close();

		// Read From File - Method 2
		byte array[] = Files.readAllBytes(Paths.get("06-write-string-to-file.txt"));
		System.out.println(new String(array));

	}
}