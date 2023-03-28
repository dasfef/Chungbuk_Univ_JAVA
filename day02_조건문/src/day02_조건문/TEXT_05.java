package day02_조건문;

public class TEXT_05 {

	public static void main(String[] args) {
		// 1부터 100까지 3의 배수이면서 동시에 5의 배수인 숫자 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0)
				System.out.print(i + " ");
		}
	}

}
