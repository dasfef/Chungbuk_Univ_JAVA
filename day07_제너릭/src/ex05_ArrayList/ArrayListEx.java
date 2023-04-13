package ex05_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			String str;
			System.out.print("이름을 입력하세요(공백 제외) >> ");
			str = scan.next();
			list.add(str);
		}
		
		int max = 0;
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i).length()) {
				max = i;
			}
			System.out.print(list.get(i) + " \n");
		}
		
		
		System.out.println("길이가 가장 큰 요소 : " + list.get(max));
		
		
	}
	
}
