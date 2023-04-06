package day05;

import java.util.Scanner;

public class Str_indexOf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "2023년 4월 Java를 공부중~ Java는~";
		System.out.print("[첫 Java 위치] : ");
		System.out.println(str.indexOf("Java"));
		System.out.print("[마지막 Java 위치] : ");
		System.out.println(str.lastIndexOf("Java"));
		
		String str1 = str.replace("Java", "자바");
		System.out.println(str1);
		System.out.println(str.substring(0, 4));
		
		String[] str2 = str.split(" ");
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}

}
