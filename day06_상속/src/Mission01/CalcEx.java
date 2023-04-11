package Mission01;

import java.util.Scanner;

public class CalcEx {

	static void prn() {
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MUL");
		System.out.println("4. DIV");
		System.out.println("5. EXIT");
		System.out.print("메뉴선택 >> ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			prn();
			int ch = scan.nextInt();
			System.out.print("두 정수 입력 >> ");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			Calc cc = null;
			switch(ch) {
				case 1 : cc = new Add(); break;
				case 2 : cc = new Sub(); break;
				case 3 : cc = new Mul(); break;
				case 4 : cc = new Div(); break;
				case 5 : return;
				default : System.out.println("메뉴에 맞게 선택해주세요.");
			}
			cc.setValue(x, y);
			System.out.println("결과 : " + cc.calculate());
			System.out.println();
		}
	}


}
