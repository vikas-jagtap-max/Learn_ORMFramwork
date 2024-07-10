package Multithreading;

public class HerThread extends Thread {
	int a;
	int b;

	public HerThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		int c = a - b;
		System.out.println("substraction :" + c);

	}
}
