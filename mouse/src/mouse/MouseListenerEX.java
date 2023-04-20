package mouse;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEX extends JFrame {
	private JLabel la = new JLabel("O.O");
	
	public void MouseListnerEX() {
		setTitle("EX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =  getContentPane();
		c.addMouseListener(new MyMouseListner());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
		
	}
	public class MyMouseListner implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	public static void main(String[] args) {
		MouseListenerEX ex = new MouseListenerEX();
		ex.MouseListnerEX();
	}

}
