package day05;

import java.util.Scanner;

public class Str_M02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");
		String str = scan.nextLine();
//		int num = str.length();
		System.out.print("변환된 문자열 >> ");
		
//		char result [] = new char [num];
//		
//		for (int i = 0; i < str.length(); i++) {
//			int ch = str.charAt(i);
//			if(ch < 97 && ch >= 65) result[i] += ch + 32;
//			else if(ch >= 97 && ch < 130) result[i] += ch - 32;
//			else if(ch == ' ') result[i] += ' ';
//			else result[i] += str.charAt(i);
//		}
//		
//		for (int i = 0; i < result.length; i++) {
//			System.out.printf("%s",result[i]);
//		}
		
		// 교수님 답안
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				System.out.printf("%c", str.charAt(i) + 32);
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				System.out.printf("%c", str.charAt(i) - 32);
			else
				System.out.printf("%c", str.charAt(i));
		}
	}

}
