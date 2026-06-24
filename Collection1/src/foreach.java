import java.util.ArrayList;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Black");
		for (String color : list) {
			System.out.println(color);
		}
	}

}
