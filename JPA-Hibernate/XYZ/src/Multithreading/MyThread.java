package Multithreading;

public class MyThread extends Thread {
	int a;
	int b;

	public MyThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		int c = a + b;
		System.out.println("addition :" + c);

	}

}
