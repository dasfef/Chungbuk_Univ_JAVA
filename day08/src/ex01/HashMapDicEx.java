package ex01;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3개의 (key, value) 쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고싶은 단어 >> ");
			String eng = scan.next();
			
			if(eng.equals("exit")) {
				System.out.println("프로그램 종료.");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null) System.out.println(eng + "는 없는 단어 입니다.");
			else System.out.println(kor);
			
		}
	}

}
