package ex01_thread;

public class TestThread {
	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
	}
}
