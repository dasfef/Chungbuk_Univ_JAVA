package mission01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {
	public static int search(ArrayList<Integer> arr, int key) {
		Collections.sort(arr);
		int low = 0;
		int high = arr.size();
		
		while(low <= high) {
			int mid = low + high / 2;
			if(key == arr.get(mid)) {
				return mid + 1;
			}
			else if(key < mid) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("정수 값 입력 >> ");
			arr.add(scan.nextInt());
		}
		System.out.print("찾는 값을 입력하세요 >> ");
		int num = scan.nextInt();
		
		if (arr.contains(num) == false) {
			System.out.println("당신이 찾는 데이터가 없습니다.");
		}
		else if(arr.contains(num) == true){
			System.out.println("당신이 찾는 데이터는 " + search(arr, num) + " 에 있습니다");
		}
	}

}
