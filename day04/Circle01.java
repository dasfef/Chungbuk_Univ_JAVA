package day04;

public class Circle01 {
	int radius;
	public Circle01(int radius) {
		this.radius = radius;
	}
	
	public void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle01 ob1 = new Circle01(1);
		Circle01 ob2 = new Circle01(2);
		Circle01 s;
		
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.radius = " + s.radius);
		System.out.println("ob2.radius = " + ob2.radius);
	}

}
