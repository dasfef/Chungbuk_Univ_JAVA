package mission;

public class M03 {

	public static void main(String[] args) {
		int array[] = new int[100];
		int[] dice = new int[6];
		
		for (int i = 0; i < 100; i++) {
			int rand = (int)(Math.random() * 7);
//			System.out.print(rand);
			array[i] = rand;
			for (int j = 1; j < 7; j++) {
				if(array[i] == j) dice[j-1] += 1;
			}
		}
		
		for(int i = 0; i < 6; i ++ ) {
			System.out.printf("dice[%d] : %d\n", i+1, dice[i]);
		}
		
		int max = 0;
		int num = 0;
		for(int i = 0; i < dice.length; i++) {
			if(dice[i] > max) {
				max = dice[i];
				num = i;
			}
		}
		System.out.printf("최빈값 : %d 의 주사위 눈은 %d 이다", max, num+1);
	}

}
