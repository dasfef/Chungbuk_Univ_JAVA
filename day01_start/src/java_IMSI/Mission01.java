package java_IMSI;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("세 자리 정수 입력 : ");
		int num = scan.nextInt();
		System.out.printf("백의 자리 : %d\n", num / 100);
		System.out.printf("십의 자리 : %d\n", num % 100 / 10);
		System.out.printf("일의 자리 : %d\n", num % 10);
	}

}
