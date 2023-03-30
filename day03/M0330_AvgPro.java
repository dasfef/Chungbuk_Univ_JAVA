package day03;

import java.util.Scanner;

public class M0330_AvgPro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		System.out.println("평균 값 : " + (sum / arr.length));
	}

}
