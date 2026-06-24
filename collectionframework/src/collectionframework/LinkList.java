package collectionframework;

import java.util.LinkedList;

public class LinkList {
	public static void main(String... a) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(12);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.remove(2);
		list.add(100);
		System.out.println(list);

	}
}
