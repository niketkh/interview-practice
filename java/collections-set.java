/*
	Set: 
		add, addAll, remove, removeAll, clear, contains, containsAll, retainAll, isEmpty, size
		equals, hashCode, toArray, iterator, spliterator, stream, parallelStream, removeIf, forEach

	HashSet (Implements Set Interface):
		clone

	LinkedHashSet (Implements Set Interface):
		clone

	TreeSet:
		clone, ceiling, floor, first, last, higher, lower
		headSet, tailSet, subSet
		descendingIterator, descendingSet, pollFirst, pollLast

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
		Set<String> set = new HashSet<>();

		set.add("hello");
		set.add("new");
		set.add("world");
		set.add("test");
		set.add("new");
		set.add("new");
		set.add("old");

		System.out.println(set);
		System.out.println("Size: " + set.size());

		set.remove("new");

		System.out.println(set);

		set.stream().sorted().forEach(System.out::println);
		// set.stream().sorted().forEach(el -> System.out.print(el + " "));
		// System.out.println();

		// LinkedHashSet to maintain insertion order
		Set<String> linkedHashSet = new LinkedHashSet<>();
		set.stream().sorted().forEach(el -> linkedHashSet.add(el));
		System.out.println(linkedHashSet);

		// TreeSet to store elements in sorted order uses Red Black Trees
		Set<String> treeSet = new TreeSet<>(set);

		System.out.println(treeSet);

	}
}