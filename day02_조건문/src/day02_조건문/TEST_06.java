package day02_조건문;

import java.util.Scanner;

public class TEST_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1 12 123 1234 출력
		System.out.print("숫자 입력 : ");
		int num = 1;
		int cnt = scan.nextInt();
	
		for(int i = 1; i <= cnt; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.printf("%d ", j);
			}
			num++;
			System.out.println();
		}
	}

}
