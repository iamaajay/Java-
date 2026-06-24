
public class thread2 extends Thread {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "is Running");
		}
	}

	public static void main(String[] args) {
		thread2 t1 = new thread2();
		thread2 t2 = new thread2();
		thread2 t3 = new thread2();
		t1.setName("Amit");
		t2.setName("Pankaj");
		t3.setName("Devendra");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();

	}

}
