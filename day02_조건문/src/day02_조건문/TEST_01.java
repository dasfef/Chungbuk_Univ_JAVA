package day02_조건문;

import java.util.Scanner;

public class TEST_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("임의의 문자 입력 : ");
		char x = scan.next().charAt(0);
		
		if((int)x < 97)
			System.out.println("해당 문자" + x + "는 대문자입니다");
		else
			System.out.println("해당 문자" + x + "는 소문자입니다");
	}

}
