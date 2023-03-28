package day02_조건문;

import java.util.Scanner;

public class TEST_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("과세 표준 : ");
		double value = scan.nextInt();
		double result;
		
		if(value < 1000) {
			result = value * 0.08;
		}
		else if(value > 1000 && value <= 4000) {
			result = value * 0.17;
		}
		else if(value > 4000 && value <= 8000) {
			result = value * 0.26;
		}
		else
			result = value * 0.35;
		
		System.out.println("산출 세액 : " + (int)result + "만원");
	}

}
