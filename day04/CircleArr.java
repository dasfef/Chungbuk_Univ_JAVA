package day04;

public class CircleArr {

	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i + 1);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("반지름이 " + c[i].radius + "인 원의 면적은 " + c[i].getArea() + " 입니다");
		}
	}

}
