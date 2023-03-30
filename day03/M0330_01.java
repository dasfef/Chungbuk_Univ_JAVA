package day03;

import java.util.Scanner;

public class M0330_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다");
		while(true) {
			System.out.print(">>");
			String text = scan.nextLine();
//			System.out.println(text);
			if(text.equals("exit"))
				break;
			
		}
		System.out.println("종료합니다");
	}

}
