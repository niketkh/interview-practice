/*
	Queue Interface Methods:
	 	add, remove, element
	 	offer, poll, peek

	 	(Inherited from Collection) addAll, removeAll, clear, contains, containsAll, equals, hashCode, isEmpty, size, 
	 	toArray, iterator, retainAll, spliterator, stream, parallelStream

	 	(Inherited from Iterable) forEach

	Dequeue Interface Methods:
		add, addFirst, addLast, remove, removeFirst, removeLast, element, getFirst, getLast, removeFirstOccurence, removeLastOccurence
		offer, offerFirst, offerLast, poll, pollFirst, pollLast, peek, peekFirst, peekLast
		push, pop, peek
		contains, iterator, descendingIterator

		(Inhertied from Collection) addAll, removeAll, clear, containsAll, equals, hashCode, isEmpty, 
		toArray, stream, parallelStream, spliterator

		(Inherited from Iterable) forEach


	 LinkedList Methods (Implements Queue Interface):
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
		Queue<Integer> queue = new LinkedList<>();

		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);

		System.out.println(queue);
		System.out.println("Element at start of queue: " + queue.peek());
		System.out.println("Size: " + queue.size());

		while(!queue.isEmpty()) {
			Integer element = queue.poll();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}