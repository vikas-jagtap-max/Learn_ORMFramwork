package Multithreading;

public class MainThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread(5, 10);
		HerThread t2 = new HerThread(5, 10);

		t1.start();
		t2.start();
	}

}
