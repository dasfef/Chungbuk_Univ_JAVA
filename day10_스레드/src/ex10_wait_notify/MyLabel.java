package ex10_wait_notify;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyLabel {
	int barSize = 0;
	int maxBarSize;
	
	MyLabel(int maxBarSize){
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)((double)(this.getWidth()) / maxBarSize * barSize);
		if(width == 0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			}
			catch(InterruptedException e) {return;}
		}
		barSize++;
		repaint();
		notify();
	}
}
