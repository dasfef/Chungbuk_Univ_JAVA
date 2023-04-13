package mission01_ans;

public class MyColorPoint extends MyPoint {
	String color;
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	@Override
	protected void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	@Override
	protected void reverse() {
		int temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3, "blue");
		p.move(3,  4);
		p.reverse();
		p.show();
	}
	
}
