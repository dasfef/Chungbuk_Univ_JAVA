package day02_조건문;

import java.util.Scanner;

public class TEST_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.printf("막대 길이 %d: ", cnt);
			int qty = scan.nextInt();
			
			if(qty > 50) {
				System.out.println("허용되지 않는 수입니다");
				System.out.println("다시 입력하세요 :D");
				System.out.println();
				continue;
			}
			else {
				for(int j = 1; j <= qty; j++) {
					System.out.printf("#");
				}
			}
			cnt++;
			System.out.println();
		}
		System.out.println("");
	}
			

}
