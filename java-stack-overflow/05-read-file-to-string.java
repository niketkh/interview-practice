import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

	private static String readFile(String file) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader (file));
	    String         line = null;
	    StringBuilder  sb = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    try {
	        while((line = reader.readLine()) != null) {
	            sb.append(line);
	            sb.append(ls);
	        }

	        return sb.toString();
	    } 

	    finally {
	        reader.close();
	    }
	}

	public static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static List<String> readLines(String path, Charset encoding) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(path), encoding);
		return lines;
	}

	public static List<String> readLinesJava8(String path, Charset encoding) throws IOException {
		try (BufferedReader r = Files.newBufferedReader(Paths.get(path), encoding)) {
		  return r.lines().collect(Collectors.toList());
		}
	}

	public static void readLinesJava8AnotherMethod(String path, Charset encoding) throws IOException {
		try (Stream<String> lines = Files.lines(Paths.get(path), encoding)) {
  			lines.forEach(System.out::println);
		}
	}

	

	public static void main(String args[]) throws IOException {
		// String fileContent = readFile("05-read-file-to-string.java");
		// System.out.println(fileContent);

		// String fileContent = readFile("05-read-file-to-string.java", StandardCharsets.UTF_8);
		// System.out.println(fileContent);

		// List<String> lines = readLines("05-read-file-to-string.java", StandardCharsets.UTF_8);
		// System.out.println(lines);

		// List<String> lines = readLinesJava8("05-read-file-to-string.java", StandardCharsets.UTF_8);
		// System.out.println(lines);


		readLinesJava8AnotherMethod("05-read-file-to-string.java", StandardCharsets.UTF_8);
	}
}