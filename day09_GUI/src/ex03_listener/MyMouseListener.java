//package ex03_listener;
//
//import java.awt.event.*;
//import java.awt.*;
//import javax.swing.*;
//
//public class MyMouseListener implements MouseListener, MouseMotionListener{
//	public void mousePressed(MouseEvent e) {
//		la.setText("mousePressed (" + e.getX() + ", " + e.getY() + ")");
//	}
//	public void mouseReleased(MouseEvent e) {
//		la.setText("MouseReleased (" + e.getX() + ", " + e.getY() + ")");
//	}
//	public void mouseClicked(MouseEvent e) {}
//	public void mouseEntered(MouseEvent e) {
//		Component c = (Component)e.getSource();
//		c.setBackground(Color.CYAN);
//	}
//	public void mouseExited(MouseEvent e) {
//		Component c = (Component)e.getSource();
//		c.setBackground(Color.YELLOW);
//	}
//	
//	public void mouseDragged(MouseEvent e) {
//		la.setText("MouseDragged (" + e.getX() + ", " + e.getY() + ")");
//	}
//	public void mouseMoved(MouseEvent e) {
//		la.setText("MouseMoved (" + e.getX() + ", " + e.getY() + ")");
//	}
//	
//	public static void main(String[] args) {
//		new MouseListenerAllEx();
//	}
//}


