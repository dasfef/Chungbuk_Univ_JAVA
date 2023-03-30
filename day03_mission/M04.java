package mission;

import java.util.Scanner;

public class M04 {

	static void scaling(String a[][]) {
		for(int i = 0; i < 3; i++ ) {
			for(int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String arr[][] = new String[3][];
		int arr[][] = new int[3][];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d 행 : ", i+1);
			String num = scan.nextLine();
			int nums = Integer.parseInt(num);
			System.out.println(nums);
//			String[] nums = num.split(" "); 
//			for(int j = 0; j < 3; j++) {
//				arr[i][j] = 
//			}
		}
		
		System.out.println("===== 최종 결과 =====");
		
//		scaling(arr);
	}

}
