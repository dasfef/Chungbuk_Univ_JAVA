package day04;

import java.util.Scanner;

public class Init {
	static Scanner scan = new Scanner(System.in);
	
	static int prn() {
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.println("5. EXIT");
		System.out.println("메뉴 선택 >> ");
		int m = scan.nextInt();
		return m;
	}
	
	static int addData(int x, int y) {
		return x + y;
	}
	
	static int subData(int x, int y) {
		return x - y;
	}
	
	static int divData(int x, int y) {
		return x / y;
	}
	
	static int mulData(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		while(true) {
			int m = prn();
			int result = 0;
			
			if(m == 5) {
				System.out.println("프로그램 종료"); return;
			}
			
			if(m < 1 || m > 5) {
				System.out.println("존재하지 않는 항목입니다.");
				continue;
			}
			
			System.out.print("두 정수 입력 >> ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			switch(m) {
			case 1: result = addData(x, y);	break;
			case 2: result = subData(x, y);	break;
			case 3: result = mulData(x, y);	break;
			case 4: result = divData(x, y);	break;
			}
			
			System.out.println("계산 결과 : " + result);
		}
	}

}
