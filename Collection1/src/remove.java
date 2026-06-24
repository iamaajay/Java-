import java.util.ArrayList;
import java.util.Iterator;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int n = itr.next();
			if (n == 40) {
				itr.remove();
			}
		}
		System.out.println(list);

	}
}
