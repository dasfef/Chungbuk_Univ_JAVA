package day05;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 문자열 >> ");
		String str = scan.nextLine();
		System.out.print("출력 문자열 >> ");
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') System.out.printf("%c", '$');
			else System.out.printf("%c", str.charAt(i));
		}
		
		String str_ = str.replace(" ", "$");
		System.out.println("\n" + str_);
		
	}

}
