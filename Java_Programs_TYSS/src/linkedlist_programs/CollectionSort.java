package linkedlist_programs;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionSort {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(9);
		l.add(5);
		l.add(1);
		l.add(7);
		l.add(3);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}