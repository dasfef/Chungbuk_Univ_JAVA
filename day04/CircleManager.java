package day04;

import java.util.Scanner;

public class CircleManager{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle02 c[] = new Circle02[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius 입력 >> ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle02(x, y, radius);
		}
//		for (int i = 0; i < c.length; i++) {
//			c[i].show();
//			scan.close();
//		}
		
		Circle02 [] max = new Circle02 [1];
		for(int i = 0; i < c.length-1; i++) {
			for(int j = 1; j < c.length; j++) {
				if(c[i].getArea() < c[j].getArea()) max[0] = c[j];
			}
		}
		
		max[0].show();
	}

}