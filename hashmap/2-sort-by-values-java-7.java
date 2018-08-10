import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String args[]) {
		Map<Integer, Integer> map = new HashMap<>();

		map.put(2, 6);
		map.put(1, 6);
		map.put(5, 6);
		map.put(3, 5);

		// List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		// Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
		// 	public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
		// 		int compare = e2.getValue().compareTo(e1.getValue());

		// 		if(compare == 0)
		// 			return e1.getKey().compareTo(e1.getKey());
		// 		else
		// 			return compare;
		// 	}
		// });
		// System.out.println(list);

		// OR Use TreeSet with similar comparator

		// OR Java 8 
		// (Collections.reverseOrder() or Comparator.reverseOrder() for reverse ordering)
		// Use map(e -> e.getKey())  to collect for keys
		List<Map.Entry<Integer, Integer>> sortedList = map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
			.collect(Collectors.toList());

		System.out.println(sortedList);

		Map sortedMap = map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(sortedMap);
	}
}

// Java 7 -  https://stackoverflow.com/questions/11647889/sorting-the-mapkey-value-in-descending-order-based-on-the-value

// Java 7 - https://www.mkyong.com/java/how-to-sort-a-map-in-java/

// Java 8 - http://www.mkyong.com/java8/java-8-how-to-sort-a-map/

// Java 8 - https://howtodoinjava.com/sort/java-sort-map-by-values/