package mission02;

public class MyColorPoint extends MyPoint{
	public String color = null;
	public MyColorPoint(int x, int y, String Color) {
		super(x, y);
		color = Color;
	}

	@Override
	protected void move(int x, int y) {
		this.x += x; this.y += y;
	}

	@Override
	protected void reverse() {
		int temp = x;
		this.x = y; 
		this.y = temp;
	}
	
	public static void main(String[] args) {
		MyColorPoint p = new MyColorPoint(2, 3, "Blue");
		p.move(13, 41);
		p.reverse();
		p.show();
	}
}
