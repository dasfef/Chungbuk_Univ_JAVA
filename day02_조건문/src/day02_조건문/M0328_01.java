package day02_조건문;

import java.util.Scanner;

public class M0328_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수 입력 : ");
		int num = scan.nextInt();
		String str;
		
		if (num % 2 == 0)
			str = "짝수";
		else
			str = "홀수";
		
		System.out.println(num + "은 " + str + "입니다");
	}

}
