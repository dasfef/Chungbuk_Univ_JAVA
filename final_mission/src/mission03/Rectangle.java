package mission03;

import java.util.Scanner;

public class Rectangle extends Shape{
	static Scanner scan = new Scanner(System.in);
	int data_x = 0;
	int data_y = 0;
	
	@Override
	public void draw() {
		System.out.println(color + " color 로 " + type + "을(를) 그립니다.");
	}

	@Override
	public void setData() {
		System.out.print("가로 축, 세로 축 길이 입력 : ");
		data_x = scan.nextInt();
		data_y = scan.nextInt();
	}

	@Override
	public double getArea() {
		area = (data_x * data_y);
		return area;
	}

	
}
