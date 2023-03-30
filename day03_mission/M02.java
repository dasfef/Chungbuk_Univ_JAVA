package mission;

import java.util.InputMismatchException;
import java.util.Scanner;

public class M02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		while(true) {
			System.out.printf("%19s\n", "[[좌석상태]]");
			System.out.println("=================================");
			System.out.println("  1  2  3  4  5  6  7  8  9  10");
			System.out.println("=================================");
			
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("  %d", arr[i]);
			}
			System.out.println();
			
			try {
				System.out.println();
				System.out.print("좌석 선택 >> ");
				int select = scan.nextInt();
				
				if(arr[select-1] == 1) {
					System.out.println("※ 이미 예약된 좌석입니다. 다른 좌석을 선택하세요 ※\n");
				}
				
				else {
					for(int i = 0; i < arr.length; i++) 
						arr[select-1] = 1;
					System.out.println("\"예약했습니다\"");
					while(true) {
						System.out.print("계속 하시겠습니까?(Y/N) ");
						char choice = scan.next().charAt(0);
						
						if(choice == 'Y' || choice == 'y') {
							break;
						}
						else if(choice == 'N' || choice == 'n') {
							System.out.println("프로그램을 종료합니다");
							return;
						}
						else {
							System.out.println("※ Y 혹은 N 으로만 선택해주세요 ※\n");
							continue;
						}
					}
					
				}
				
			}
			catch(InputMismatchException e) {
				System.out.println("※ 숫자로만 선택할 수 있습니다. 다시 선택하세요 ※\n");
				scan.next();
			}
		}
	}

}
