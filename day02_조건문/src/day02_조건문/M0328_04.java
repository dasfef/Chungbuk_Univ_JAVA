package day02_조건문;

import java.util.Scanner;

public class M0328_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 101);
			System.out.printf("%d ",arr[i]);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println();
		System.out.println("최솟값 : " + min);
	}

}
