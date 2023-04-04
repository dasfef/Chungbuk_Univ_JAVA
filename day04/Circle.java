package day04;

public class Circle {
	public int radius;
	public String name;
	
	public Circle(int i, String string) {
		radius = i;
		name = string;
	}

	public Circle() {
	}

	public Circle(int i) {
		this.radius = i;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}
