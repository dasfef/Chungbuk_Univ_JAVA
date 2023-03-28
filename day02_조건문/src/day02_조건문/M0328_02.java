package day02_조건문;

import java.util.Scanner;

public class M0328_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수(1) 입력 : ");
		int x = scan.nextInt();
		
		System.out.print("정수(2) 입력 : ");
		int y = scan.nextInt();
		
		System.out.print("정수(3) 입력 : ");
		int z = scan.nextInt();
		
		int max;
		if(x > y)
			if(x > z)
				max = x;
			else
				max = z;
		else
			if(y > z)
				max = y;
			else
				max = z;
		System.out.println("최댓값 : " + max);
		
		
		
	}

}
