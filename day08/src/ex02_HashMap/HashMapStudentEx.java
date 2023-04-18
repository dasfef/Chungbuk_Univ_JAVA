package ex02_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) {
		// 학생 이름 + Student Class 객체를 저장하는 HashMap 컬렉션 생성
		HashMap<String, Student> student = new HashMap<String, Student>();
		
		student.put("황기태", new Student(1, "010-111-1111"));
		student.put("이재문", new Student(2, "010-222-2222"));
		student.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = scan.nextLine();
			if(name.equals("exit")) break;
			
			Student st = student.get(name);
			
			if(st == null) System.out.println(name + "은 없는 사람입니다.");
			else System.out.println("id : " + st.getId() + " 번호 : " + st.getTel());
		}
	}

}
