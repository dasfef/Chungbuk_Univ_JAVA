package day05;

import java.util.Scanner;

public class Str_M01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자입력 >> ");
		String str = scan.nextLine();
//		int num = str.length();
//		char result[] = new char[num];
//		
//		for (int i = 0; i < str.length(); i++) {
//			result[i] = str.charAt(str.length() - (i+1));
//		}
//
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i]);
//		}
		
		// 교수님 답안
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
