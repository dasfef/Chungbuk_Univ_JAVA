package java_IMSI;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char A = 'A';
		char B = 'B';
		char C = 'C';
		
		System.out.print("A.정수를 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.print("B.정수를 입력하시오 : ");
		int num2 = scan.nextInt();
		System.out.print("C.정수를 입력하시오 : ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num2 > num3) {
			System.out.printf("가장 큰 수는 %c : %d입니다", A, num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.printf("가장 큰 수는 %c : %d입니다", B, num2);
		}
		else if (num3 > num1 && num3 > num2) {
			System.out.printf("가장 큰 수는 %c : %d입니다", C, num3);
		}
		else {
			System.out.println("가장 큰 수를 찾을 수 없습니다");
			System.out.println("모두 동일한 크기입니다");
		}
		
// 	방법1)		
//		int max = n1 > n2 ? (n1 > n3? n1 : n3) :n2 > n3? n2: n3;

//	방법2)		
//		int max = n1 > n2 ? n1 : n2;
//		max = max > n3 ? max : n3;
//		System.out.println("최댓값 : " + max);
	}

}
