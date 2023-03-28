package day02_조건문;

import java.util.Scanner;

public class TEST_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수(1) 입력 : ");
		int x = scan.nextInt();
		
		System.out.print("정수(2) 입력 : ");
		int y = scan.nextInt();
		
		int max;
		int min;
		if(x > y) {
			max = x;
			min = y;
		}
		else {
			max = y;
			min = x;
		}
			
		int sum = max + min;
		int sub = max - min;
		
		System.out.println("두 수의 합 : " + sum);
		System.out.println("두 수의 차 : " + sub);
	}

}

