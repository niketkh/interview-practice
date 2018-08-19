/*
	https://stackoverflow.com/questions/46898/how-to-efficiently-iterate-over-each-entry-in-a-map

	https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap

*/

import java.util.Map;
import java.util.HashMap;

class Main {
	public static void main(String args[]) {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);


		System.out.println(map);

		map.forEach((k, v) -> System.out.print(k + "=" + v + ", "));
		System.out.println();

		for(Map.Entry<Integer, Integer> entry: map.entrySet())
			System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
		System.out.println();

	}
}