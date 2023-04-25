package ex03_beep;
import java.awt.Toolkit;

public class BeepEx {
	public static void main(String[] args) {
		// 방법 1
		Thread th = new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		// 방법 2
//		Runnable r = new RunBe();
//		Thread th = new Thread(r);
//		th.start();

		// 방법 3
//		Thread th = new Thread(new RunBe());
//		th.start();

		// 방법 4
//		BeThread th = new BeThread();
//		th.start();

		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
