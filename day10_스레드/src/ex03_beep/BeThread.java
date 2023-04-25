package ex03_beep;

import java.awt.Toolkit;

public class BeThread extends Thread{
	@Override
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
}
