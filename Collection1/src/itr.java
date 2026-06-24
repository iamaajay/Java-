import java.util.ArrayList;
import java.util.Iterator;

public class itr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("MCA");
		list.add("BCA");
		list.add("B-tech");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}