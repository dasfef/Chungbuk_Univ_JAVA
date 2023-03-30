package day03;

public class M0330_03 {

	enum Week { 월, 화, 수, 목, 금, 토, 일 }
	
	public static void main(String[] args) {
		int [] n = {1, 2, 3, 4, 5};
		String names [] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		// k = n[0], n[1], ... n[4]
		int sum = 0;
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 : " + sum);
		
		// s = names[0], names[1] ... names[5]
		for(String s : names)
			System.out.print(s + " ");
		System.out.println();
		
		// day = Week[0], Week[1], ... Week[-1]
		for(Week day : Week.values())
			System.out.print(day + "요일 ");
		System.out.println();
		
	}

}
