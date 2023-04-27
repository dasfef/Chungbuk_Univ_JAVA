package mission03;

import java.util.Scanner;

public class ShapeEx {
	static Shape shape = null;
	static Scanner scan = new Scanner(System.in);
	static int colNum = 0;
	static int menuNum = 0;

	private static void colMenu() {
		while(true) {
			System.out.println("[ 색상 선택 ]");
			System.out.println("(1) Red ");
			System.out.println("(2) Green ");
			System.out.print("(3) Blue >> ");
			colNum = scan.nextInt();
			switch(colNum) {
			case 1:
				shape.color = "Red"; 
				break;
			case 2:
				shape.color = "Green"; 
				break;
			case 3:
				shape.color = "Blue"; 
				break;
			default :
				System.out.println("사용할 수 없는 색상입니다. 다시 선택해주세요."); continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		while(true) {
			System.out.println("[ 도형선택 ]");
			System.out.println("1. CIRCLE");
			System.out.println("2. TRIANGLE");
			System.out.println("3. RECTANGLE");
			System.out.println("4. EXIT");
			System.out.println();
			System.out.print("메뉴 선택 >> ");
			menuNum = scan.nextInt();
			if (menuNum == 4) {
				System.out.println("프로그램 종료.");
				return;
			}
			else if (menuNum >= 5) {
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
				continue;
			}
			
			else {
				switch(menuNum) {
				case 1:	
					shape = new Circle();
					shape.type = "Circle";
					break;
				case 2:	
					shape = new Triangle(); 
					shape.type = "Triangle";
					break;
				case 3:	
					shape = new Rectangle(); 
					shape.type = "Rectangle";
					break;
				case 4:	break;
				}
			}

			shape.setData();
			System.out.printf("[ 선택한 도형 %s의 면적 ] : %.2f\n", shape.type, shape.getArea());
			colMenu();
			shape.draw();
		}
	}
}
