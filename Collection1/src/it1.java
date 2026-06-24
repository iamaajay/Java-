import java.util.ArrayList;
import java.util.Iterator;

public class it1 {
	public static void main(String... a) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("shyam");
		list.add("sita");
		list.add("Ravan");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
