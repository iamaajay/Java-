package abesec;

interface Car {
	void start();

	void run(String n);

}

class Maruti implements Car {

	public Maruti(boolean acSwitch, boolean window) {
		super();
		this.acSwitch = acSwitch;
		this.window = window;
	}

	private boolean acSwitch;
	private boolean window;

	@Override
	public String toString() {
		return "Maruti [acSwitch=" + acSwitch + ", window=" + window + "]";
	}

	public boolean isAcSwitch() {
		return acSwitch;
	}

	public boolean getWindow() {
		return window;
	}

	@Override
	public void start() {

		System.out.println("Car is started....");
	}

	@Override
	public void run(String n) {
		boolean status = false;
		if (isAcSwitch() == true) {
			System.out.println("Ac started");
			if (window == true) {
				System.out.println("Window Locked...ready to go");
				status = true;
			} else {
				System.out.println("Please locked window first");
			}

			if (status) {
				System.out.println("Running....");

			} else {
				System.out.println("Could not start, please lock the window");
			}

		} else {
			System.out.println("Could not start, please switch on the a/c");
		}
	}
}

public class abes implements ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti m1 = new Maruti(false, false);
		m1.start();
		m1.run("hi");
	}

}
