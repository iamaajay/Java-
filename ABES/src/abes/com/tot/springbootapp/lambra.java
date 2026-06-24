package abes.com.tot.springbootapp;

interface car {
	void mess();

	static void hello() {
		System.out.println("i am from static method ");
	}

	default void callme() {
		System.out.println("call me any time");
	}
}

public class lambra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = () -> {
			System.out.println("hello22");
		};
		c.mess();
		car.hello();
		c.callme();
	}

}
