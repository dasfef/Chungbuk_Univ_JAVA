package class_;

import java.util.Scanner;

public class PhoneBook {
	static Scanner scan = new Scanner(System.in);
	static int people = 0;
	
	public static void input(Phone book[]) {
		
		for (int i = 0; i < people; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String name = scan.next();
			String tel = scan.next();
			book[i] = new Phone(name, tel);
		}
	}
	
	public static void Search(Phone book[]) {
		while(true) {
			System.out.print("검색할 이름 >>");
			String name = scan.next();
			if(name.equals("그만")) {
				System.out.println("프로그램 종료.");
				break;
			}
			Phone.search(book, name);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("인원수 >> ");
		people = scan.nextInt();
		Phone book[] = new Phone[people];
		input(book);
		Search(book);
	}

}
