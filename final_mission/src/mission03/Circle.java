package mission03;

import java.util.Scanner;

public class Circle extends Shape{
	static Scanner scan = new Scanner(System.in);
	int data = 0;
	
	@Override
	public void draw() {
		System.out.println(color + " color 로 " + type + "을(를) 그립니다.");
	}

	@Override
	public void setData() {
		System.out.print("원의 반지름 : ");
		data = scan.nextInt();
	}

	@Override
	public double getArea() {
		double pi = Math.PI * (Math.pow(data, 2));
		return pi;
	}

	
}
