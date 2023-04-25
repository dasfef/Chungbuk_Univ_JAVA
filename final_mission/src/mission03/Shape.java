package mission03;

public abstract class Shape {
	double area;
	String color;
	String type;
	
	public Shape(double area, String color, String type) {
		this.area = area;
		this.color = color;
		this.type = type;
	}
	
	public abstract void draw();
	public abstract void setData();
	public abstract double getArea();
}
