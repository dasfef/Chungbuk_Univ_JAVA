package mission03;

import java.util.Scanner;
import java.util.Vector;

public class Collection_01 {
	private static int findMax(Vector<Integer> vrr) {
		int max = 0;
		for(int i = 0; i < vrr.size(); i++) {
			if(max < vrr.get(i)) 
				max = vrr.get(i);
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		while(true) {
			System.out.print("정수(-1)이 입력될 때까지 입력 >> ");
			int nums = scan.nextInt();
			v.add(nums);
			
			if(nums == -1) break;
		}
		System.out.println("가장 큰 수는 : " + findMax(v));
	}
}
