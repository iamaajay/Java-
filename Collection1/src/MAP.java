import java.util.HashMap;

public class MAP {
	public static void main(String... a) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "ajay");
		map.put(3, "vijay");
		map.put(1, "kumar");
		map.put(2, "rathi");
		System.out.print(map);
		System.out.println(map.get(3));
	}
}
