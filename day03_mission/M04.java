package mission;

import java.util.Scanner;

public class M04 {

	static void printing(int a[][]) {
		
		for(int i = 0; i < 3; i++ ) {
			int sum = 0;
			for(int j = 0; j < 3; j++) {
				System.out.printf("%3d ", a[i][j]);
				sum += a[i][j];
			}
			
			System.out.printf("%3d\n",sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d 행 : ", i+1);
			for(int j = 0; j < 3; j++) {
				int nums = scan.nextInt();
				arr[i][j] = nums;
			}
			
		}
		
		System.out.println("===== 최종 결과 =====");
		
		printing(arr);
	}

}
