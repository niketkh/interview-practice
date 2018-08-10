/*
	List Interface Methods:
	 	add, addAll, get, set, remove, removeAll, clear, isEmpty, size, contains, toArray, iterator, listIterator, 
	 	replaceAll, retailAll, subList, hashCode, equals, indexOf, lastIndexOf, spliterator

	 LinkedList Methods (Implements List Interface):
	 	addFirst, addLast, remove, removeFirst, removeLast, removeFirstOccurence, removeLastOccurence, element, getFirst, getLast, 
	 	offer, offerFirst, offerLast, peek, peekFirst, peekLast, poll, pollFirst, pollLast
	 	push, pop, peek
	 	descendingIterator

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


class Main {
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(6);

		System.out.println("Size: " + list.size());
		System.out.println(list);

		Collections.sort(list);
		System.out.println("Sorted List: " + list);


		// Create a list from array
		LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 5, 6, 7, 9, 0));
		
		linkedList.sort(Comparator.naturalOrder());
		// linkedList.sort(Comparator.reverseOrder());
		// Collections.sort(linkedList);
		// Collections.sort(linkedList, Collections.reverseOrder());
		System.out.println(linkedList);

		linkedList.add(10);
		linkedList.addLast(20);
		linkedList.addFirst(-1);

		// Removes element at index 6
		linkedList.remove(6);


		// Remove element 6
		linkedList.remove((Integer) 6);

		System.out.println(linkedList);
		System.out.println("Element at index 0: " + linkedList.get(0));


	}
}

/*
	List Java Docs: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
*/

/*
	LinkedList Java Docs: https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
*/

/*
	Comparator Java Docs: https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html

	Examples: https://www.baeldung.com/java-8-comparator-comparing

*/