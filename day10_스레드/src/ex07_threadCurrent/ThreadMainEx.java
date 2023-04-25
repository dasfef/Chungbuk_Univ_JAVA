package ex07_threadCurrent;

public class ThreadMainEx {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();			// get Thread ID
		String name = Thread.currentThread().getName();		// get Thread Name
		int priority = Thread.currentThread().getPriority();// get Thread 우선순위
		Thread.State s = Thread.currentThread().getState();
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);
	}
}
