package day05;

public class M06_Circle {
	double radius;
	double pi = 3.14;
	
	public double getArea(double radius) {
		return radius * radius * pi;
	}
	
	public M06_Circle(double radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	
	public M06_Circle(double radius) {
		this.radius = radius;
	}
}

