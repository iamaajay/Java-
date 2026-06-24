
public class thread1 {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void start() {

	}
}

class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1 = new thread1();
		t1.start();
		t1.run();
	}

}
