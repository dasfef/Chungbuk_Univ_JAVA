package day03;

import java.util.Scanner;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		int result = 0;
		
		try {
			System.out.print("분자를 입력하세요 : ");
			dividend = scan.nextInt();
			System.out.print("분모를 입력하세요 : ");
			divisor = scan.nextInt();
			
			result = dividend / divisor;
		}
		catch(ArithmeticException e) {
			System.out.println("분모가 0입니다");
		}
		System.out.println(result);
	}

}
