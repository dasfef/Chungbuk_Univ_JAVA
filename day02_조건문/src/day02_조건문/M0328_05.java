package day02_조건문;

import java.util.Scanner;

public class M0328_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {7, 2, 10, 9};
		
		for(int i = 0; i < arr.length-1; i++) {
			int m = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[m] > arr[j]) m = j;
			}
			
			int tmp = arr[i];
			arr[i] = arr[m];
			arr[m] = tmp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
