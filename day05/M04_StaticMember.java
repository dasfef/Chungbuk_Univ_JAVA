package day05;

import java.util.Scanner;

public class M04_StaticMember {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("환율(1달러) >> ");
		double rate = scan.nextDouble();
		M04_CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + M04_CurrencyConverter.toDollar(1000000) + " 입니다.");
		System.out.println("$100는 " + M04_CurrencyConverter.toKWR(100) + "원 입니다.");
		scan.close();
		System.out.println(Math.PI);
	}

}
