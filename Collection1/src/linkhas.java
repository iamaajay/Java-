import java.util.LinkedHashSet;

public class linkhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(1);
		set.add(0);
		set.add(3);
		set.add(4);
		set.add(2);
		System.out.println(set);
		set.remove(2);
		System.out.println(set);
		set.remove(3);
		System.out.println(set);
	}

}
