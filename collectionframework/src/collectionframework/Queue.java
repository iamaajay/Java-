package collectionframework;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(16);
		q.add(12);
		q.add(13);
		q.add(15);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);

	}

}
