package day02_조건문;

import java.util.Scanner;

public class TEST_08 {

	public static void main(String[] args) {
		// 5명의 학생에게 취미를 물어본 결과를 그래프로 처리
		Scanner scan = new Scanner(System.in);
		
		String[] hobby = {"Movie", "Music", "Cycle", "Fishing"};
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("당신의 취미는 ?");
			System.out.print("1.Movie 2.Music 3.Cycle 4.Fishing : ");
			num[i] = scan.nextInt();
		}
		
		System.out.print("Movie : ");
		int cnt = 0;
		int Movie = 0;
		int Music = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 1)
				Movie++;
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 2)
				Music++;
		}
		
		
		for(int i = 0; i < Movie; i++) {
			System.out.print("▦");
		}
		
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("%s : %c", hobby[i], );
		}
	}

}
