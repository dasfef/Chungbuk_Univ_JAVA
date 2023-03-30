package mission;

import java.util.InputMismatchException;
import java.util.Scanner;

public class M01 {

	static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	static int times(int a, int b) {
		int result = a * b;
		return result;
	}
	
	static double divide(int a, int b) {
		double result = (double)a / (double)b;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
				
		while(true) {
			System.out.println("===== [[ 계산기 ]] =====");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 종료");
			System.out.print("메뉴 선택 >> ");
			
			try {
				int menu = scan.nextInt();
				
				if (menu == 5){
					System.out.println("프로그램 종료");
					return;
					}
				else if(menu != 5) {
					System.out.print("정수 1 : ");
					int x = scan.nextInt();
					System.out.print("정수 2 : ");
					int y = scan.nextInt();
					
					switch(menu) {
					case 1:
						result = plus(x, y);
						System.out.printf("결과 : %d\n", result);
						break;
					case 2:
						result = subtract(x, y);
						System.out.printf("결과 : %d\n", result);
						break;
					case 3:
						result = times(x, y);
						System.out.printf("결과 : %d\n", result);
						break;
					case 4:
						double result_;
						result_ = divide(x, y);
						System.out.printf("결과 : %.2f\n", result_);
						break;
						}
					}
				}
			catch(InputMismatchException e) {
				System.out.println("숫자만 입력가능합니다. 다시 입력하세요");
				scan.next();
			}
		}

	}
}
