import java.util.HashMap;

public class map1 {
	public static void main(String... a) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "MCA");
		map.put(3, "BCA");
		map.put(2, "B-Tech");
		map.put(0, "MBA");
		map.put(4, "XYZ");
		System.out.println(map);
		System.out.println("Find The No =" + map.get(2));
	}
}
