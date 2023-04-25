package ex08_randomThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		setSize(300, 200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	}
	
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}
