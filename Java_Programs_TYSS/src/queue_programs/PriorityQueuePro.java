package queue_programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePro {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.offer(52);
		p.add(52);
		p.add(66);
		p.add(12);
		System.out.println(p);
		Iterator i=p.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(p.poll());
	}
}
