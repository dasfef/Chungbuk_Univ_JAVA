package day04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.print("가로 길이 : ");
		rec.width = scan.nextInt();
		System.out.print("세로 길이 : ");
		rec.height = scan.nextInt();
		
		System.out.println("면적 : " + rec.getArea());
	}
}
