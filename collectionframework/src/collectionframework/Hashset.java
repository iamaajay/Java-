package collectionframework;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("orange");
		set.add("Banana");
		set.add("Apple");
		set.add("orange");
		System.out.println(set);
	}

}
