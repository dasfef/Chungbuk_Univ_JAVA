package day03;

import java.util.Scanner;

public class M0330_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int [] array = new int [5];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("정수 입력 : ");
			array[i] = scan.nextInt();
			
			if(array[i] > max)
				max = array[i];
		}
		System.out.printf("가장 큰 수는 %d 입니다", max);
	}

}
