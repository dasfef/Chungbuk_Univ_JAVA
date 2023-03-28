package day02_home;

import java.util.Scanner;

public class TEST_HOME {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] hobby_name = {"Movie", "Music", "Cycle", "Fishing"};
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("당신의 취미는 ?");
			System.out.print("1.Movie 2.Music 3.Cycle 4.Fishing : ");
			num[i] = scan.nextInt();
		}
		
		int Movie = 0;
		int Music = 0;
		int Cycle = 0;
		int Fishing = 0;
		
		for(int i = 0; i < num.length; i++) {
			switch(num[i]) {
			case 1:
				Movie++;
				break;
			case 2:
				Music++;
				break;
			case 3:
				Cycle++;
				break;
			case 4:
				Fishing++;
				break;
			}
		}
		
		int[] hobby = {Movie, Music, Cycle, Fishing};
		
		System.out.println();
		System.out.println("[ 설문조사 결과 ]");
		
		for(int i = 0; i < hobby.length; i++) {
			System.out.printf("%s : ", hobby_name[i]);
			for(int j = 0; j < hobby[i]; j++) {
				System.out.printf("▦");
			}
			System.out.println();
		}
	}

}
