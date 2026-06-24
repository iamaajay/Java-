package collectionframework;

import java.util.ArrayList;

public class coll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<>();
		name.add("java");
		name.add("c++");
		name.add("c");
		name.add("DSA");
		System.out.println(name);
		System.out.println("First Element =" + name.get(0));
		name.remove(1);
		System.out.println(name);
		name.add(1, "ravi");
		System.out.println(name);
		name.clear();
		System.out.println(name);
	}

}
