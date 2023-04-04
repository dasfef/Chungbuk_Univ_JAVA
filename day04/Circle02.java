package day04;

public class Circle02 {
	private double x, y;
	private int radius;
	private double result;
	public Circle02(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public Circle02(double a) {
		this.result = a;
	}
	
	public void show() {
//		System.out.printf("(%.1f, %.1f) %d\n", x, y, radius);
		System.out.printf("가장 면적이 큰 원은 (%.1f, %.1f) %d", x, y, radius);
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}