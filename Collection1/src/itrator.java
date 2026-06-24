import java.util.ArrayList;
import java.util.Iterator;

public class itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("amit");
		list.add("sita");
		list.add("sumit");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
