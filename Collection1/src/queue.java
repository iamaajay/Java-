import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(0);
		q.add(2);
		q.add(1);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.poll();
		System.out.println(q);
	}

}
