package setproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetProb {

	public static void main(String[] args) {
		/*
		 * HashSet is a concrete class which implements Set interface. To store elements
		 * HashSet uses hashing mechanism.Hashing involves determining a unique value by
		 * using a key. This unique value is called as hashcode. Then this hashcode is
		 * used for indexing the data associated with the key.
		 * 
		 * HashSet can contains only unique elements. When iterated elements in a
		 * HashSet are returned in a random order. We can store Null values in a set.
		 *
		 * LinkedHashSet In this type of Set, elements are returned in the order of
		 * their insertion.
		 * 
		 * TreeSet It uses tree-based data structure for storing elements. Unique
		 * elements are arranged in their natural ordering inside the set. It throws a
		 * runtime exception if heterogeneous objects are inserted. It depends on the
		 * compareTo() method for ordering as well as for detecting duplicates.
		 */

		Set<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(45);
		hs.add(1);
		hs.add(85);
		System.out.println(hs);// elements will be printed in random order
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(45);
		ts.add(1);
		ts.add(85); // elements will be printed in sorted order
		System.out.println(ts);
		Set<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(5);
		ls.add(45);
		ls.add(1);
		ls.add(85);
		ls.add(85);
		System.out.println(ls);// elements will be printed in insertion order
		System.out.println("**********************************8");
		List<Integer> numList = Arrays.asList(5, 3, 8);

		// converting list to HashSet
		Set<Integer> hset = new HashSet<Integer>(numList);

		// creating iterator object over a set using iterator() method
		Iterator<Integer> setIterator = hset.iterator();

		// using hasNext() method to find if next element is present
		while (setIterator.hasNext()) {
			// using next() method to get the next element
			System.out.println(setIterator.next());
		}

	}
}
