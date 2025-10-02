package Listproblems;

import java.util.LinkedList;

public class LinkedListdemo {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.remove();
		System.out.println(list);
//		[13, 14] 
//		remove() when called without any parameters removes the element at the front
	}
}