package day02_조건문;

import java.util.Scanner;

public class TEST_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int com = (int)(Math.random() * 3) + 1;
			
			int user;
			System.out.print("가위(1) 바위(2) 보(3) : ");
			user = scan.nextInt();
			
			switch(user) {
			case 1:
				if(com==3) {
					System.out.println("컴퓨터는 보를 냈습니다");
					System.out.println("인간 승리");
					break;
				}
				else if(com==1) {
					System.out.println("컴퓨터는 가위를 냈습니다");
					System.out.println("비겼습니다");
					break;
				}
				else {
					System.out.println("컴퓨터는 바위를 냈습니다");
					System.out.println("컴퓨터 승리");
					break;
				}
			case 2:
				if(com == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다");
					System.out.println("인간 승리");
					break;
				}
				else if(com == 2) {
					System.out.println("컴퓨터는 바위를 냈습니다");
					System.out.println("비겼습니다");
					break;
				}
				else {
					System.out.println("컴퓨터는 보를 냈습니다");
					System.out.println("컴퓨터 승리");
					break;
				}
			case 3:
				if(com == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다");
					System.out.println("컴퓨터 승리");
					break;
				}
				else if(com ==2) {
					System.out.println("컴퓨터는 바위를 냈습니다");
					System.out.println("인간 승리");
					break;
				}
				else {
					System.out.println("컴퓨터는 보를 냈습니다");
					System.out.println("비겼습니다");
					break;
				}
			}
			System.out.println();
			
			while(true) {
				System.out.print("계속 하시겠습니까?(Y/N) : ");
				char answer = scan.next().charAt(0);
				if(answer == 'y' || answer == 'Y') {
					break;
				}
				else if(answer == 'n' || answer == 'N'){
					return;
				}
				else {
					System.out.println("잘못된 답변입니다");
					System.out.println("Y 혹은 N 으로 답해주세요");
					System.out.println();
				}
			}
			
			// 교수님 해답
			/* char ans;
			do {
				System.out.println("계속 하시겠습니까?(Y/N) : ");
				char ans = scan.next().charAt(0);
			}while(!(ans == 'n' || ans == 'N' || ans == 'Y' || ans == 'y')); */
			
		}
		
			
	}

}
