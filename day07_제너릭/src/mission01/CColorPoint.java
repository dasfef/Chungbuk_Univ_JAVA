package mission01;

public class CColorPoint extends CPoint{
	private String color = null;
	public CColorPoint(int a, int b, String c) {
		super(a, b);
		color = c;
	}
	
	protected void show() {
//		CPoint c = new CPoint(a, b);
//		System.out.println();
//		c.show();
//		System.out.println(color);
		super.show();
	}
	
	@Override
	public String toString() {
		return "(" + a + "," + b + ")";
	}
	
}
