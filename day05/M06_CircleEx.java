package day05;

public class M06_CircleEx {

	public static void main(String[] args) {
//		double radius = 5;
//		double pi = 3.14;
		
//		M06_Circle circle = new M06_Circle(radius, pi);
		M06_Circle [] circle = new M06_Circle[5];
		
		for(int i = 0; i < circle.length; i++) {
			circle[i] = new M06_Circle(i);
			System.out.println(circle[i].getArea(i));
		}
		
	}

}
