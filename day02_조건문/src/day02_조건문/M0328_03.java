package day02_조건문;

import java.util.Scanner;

public class M0328_03 {
	static final int N = 6;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int[] arr = {10, 20, 30};
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
			arr[i] = (int)(Math.random() * 101);
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.printf("평균 : %.2f", ((double)sum / arr.length));
	}

}
