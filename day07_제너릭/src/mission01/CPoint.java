package mission01;

public class CPoint {
	int a, b;
	private String color;
	public CPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void show() {
		System.out.println("(" + a + "," + b + ")");
	}
}
