package class_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthSchedule {
	static Scanner scan = new Scanner(System.in);
	static Day day = new Day();
	static int date = 0;
	
	public static int date() {
		System.out.print("날짜(1~30) >>");
		int date = scan.nextInt();
		return date;
	}
	
	public static void input() {
		System.out.print("할일(빈칸없이 입력) >>");
		String work = scan.next();
		day.set(work);
	}
	
	public static void view(int a) {
		System.out.print(a + "일의 할 일은 "); day.show();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("이번달 스케줄 관리 프로그램");
		while(true) {
			try {
				System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
				int _num = scan.nextInt();
				if(_num <= 3 && _num > 0) {
					switch(_num) {
					case 1:
						date = date();
						input();
						break;
						
					case 2:
						date = date();
						view(date);
						break;
						
					case 3:
						System.out.println("프로그램 종료.");
						return;
						
					default :
						System.out.println("잘못된 선택입니다. 다시 선택하세요.");
						continue;
							
					}
				}
			
			}
			catch(InputMismatchException e) {
				System.out.println("숫자로만 선택해주세요. 다시 선택하세요.");
				scan.next();
			}
		}
	}
}
