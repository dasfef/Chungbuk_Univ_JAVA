package day05;

import java.util.Scanner;

public class Str_With {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("입력 문자열 >> ");
		String str = scan.nextLine();
		
		if(!str.startsWith("(")) System.out.print("(");
		
		System.out.print(str);
		if(!str.endsWith(")")) System.out.print(")");
		
		String _str [] = "자바는 참 즐거워요".split(" ");
		System.out.println(_str[0]);
		
	}

}
