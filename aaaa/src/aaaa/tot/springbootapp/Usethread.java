package aaaa.tot.springbootapp;

public class Usethread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usethread t1 = new Usethread();
		Usethread t2 = new Usethread();
		Usethread t3 = new Usethread();
		t1.setName("Rahul");
		t2.setName("Amit");
		t3.setName("Sita");
		t1.start();
		t2.start();
		t3.start();
	}
}
