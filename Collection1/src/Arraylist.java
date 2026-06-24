import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("MCA");
		list.add("BCA");
		list.add("B-Tech");
		list.add("MBA");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add("MCA-BCA");
		System.out.println(list);
		list.add(2, "Ravi");
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
