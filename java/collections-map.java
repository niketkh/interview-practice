/*
	Map: 
		Map.Entry
		get, getOrDefault, put, putAll, putIfAbsent, remove, containsKey, containsValue, size, isEmpty
		keySet, values, entrySet
		equals, hashCode, replace, replaceAll, merge, forEach, compute, computeIfAbsent, computeIfPresent

	HashMap (Implements Map Interface):
		clone

	LinkedHashMap:
		clone, removeEldestEntry

	TreeMap:
		clone, ceilingEntry, ceilingKey, floorEntry, floorKey, 
		firstEntry, firstKey, lastEntry, lastKey, 
		higherEntry, higherKey, lowerEntry, lowerKey
		headMap, tailMap, subMap
		pollFirstEntry, pollLastEntry, descendingKeySet, descendingMap

	Collections:
		EMPTY_LIST, EMPTY_SET, EMPTY_MAP
		addAll, binarySearch, sort, copy, fill, frequency, indexOfSubList, lastIndexOfSubList, min, max, 
		nCopies, reverse, reverseOrder, shuffle, swap
		synchronizedList, synchronizedSet, synchronizedMap
		unmodifiableList, unmodifiableSet, unmodifiableMap
		emptyList, emptySet, emptyMap

	Comparator: 
		compare, comparing, comparingInt, comparingLong, comparingDouble, reversed, naturalOrder, reverseOrder, nullsFirst, nullsLast
*/
import java.util.*;
import java.util.stream.*;

class Main {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();

		map.put("hello", 1);
		map.put("world", 3);
		map.put("india", 5);
		map.put("mumbai", 100);

		// Print Value of Key
		System.out.println("Mumbai: " + map.get("mumbai"));

		// Print Map
		System.out.println(map);

		// Print Keys in Map
		System.out.println("Keys: " + map.keySet());

		// Print values in Map
		System.out.println("Values: " + map.values());

		// Print entrySet of Map
		System.out.println("Entry Set: " + map.entrySet());

		// Get List of EntrySet from Map
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		System.out.println(list);

		// LinkedHashMap from Sorted Map (Maintains insertion order)
		Map<String, Integer> linkedHashmap = map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue())
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(linkedHashmap);


		// TreeMap - Stores Elements sorted by keys using Red Black Trees (Balanced BST)
		Map<String, Integer> treeMap = new TreeMap<>(map);
		System.out.println(treeMap);

	}
}