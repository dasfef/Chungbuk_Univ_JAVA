package mission02;

import java.util.Scanner;

public class UserEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("이름, 타입(학생, 교직원, 시민) 입력 >> ");
			String name = scan.next();
			if(name.equals("exit")) {
				System.out.println("프로그램 종료.");
				return;
			}
			String type = scan.next();
			User user = null;
			
			switch(type) {
			case "학생" :
				user = new Student(); break;
			case "교직원" :
				user = new Staff(); break;
			case "시민" :
				user = new Citizen(); break;
			default :
				System.out.println("잘못된 타입입니다. 다시 입력해주세요."); continue;
			}
			user.setValue(name, type);
			System.out.println(user.getType() + " " + user.getName() + "(가) 도서관을 이용중입니다.");
		}
	}
}
