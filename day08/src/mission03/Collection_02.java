package mission03;

import java.util.HashMap;
import java.util.Scanner;

public class Collection_02 {
	static HashMap<String, Nations> nations = new HashMap<String, Nations>();
	static Scanner scan = new Scanner(System.in);
	
	public static void putIn() {
		for (int i = 0; i < 10; i++){
			System.out.print("나라 이름, 인구 >> ");
			String name = scan.next();
			int people = scan.nextInt();
			
			if(name.equals("그만")) return;
			else 
				nations.put(name, new Nations(name, people));
		}
		return;
	}
	
	public static void search() {
		while(true) {
			System.out.print("인구 검색 >> ");
			String search = scan.next();
			
			if(search.equals("그만")) break;
			
			Nations nt = nations.get(search);
			System.out.println(nt.getName() + "의 인구는 " + nt.getPeople());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("나라 이름과 인구를 10개 입력하시오.(예 : Korea 5000)");
		putIn();
		search();
	}
}
