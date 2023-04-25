package ex05_RunnableSwing;

import java.awt.*;
import javax.swing.*;

public class RunnableTimerEx extends JFrame{
	public RunnableTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
		
	}
	public static void main(String[] args) {
		new RunnableTimerEx();
	}
}
