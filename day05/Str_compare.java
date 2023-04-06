package day05;

import java.util.Scanner;

public class Str_compare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "Heal the world";
		String str_ = "Heel the world";
		System.out.println(str.compareTo(str_));
		System.out.println(str.contains("the"));
	}

}
