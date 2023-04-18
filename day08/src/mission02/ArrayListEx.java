package mission02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	
	public static void printArray(ArrayList<Student> result) {
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		
//		Student arrInfo;
		for (int i = 0; i < 4; i++) {
			System.out.print("학생 이름, 학과, 학번, 학점 평균 입력 >> ");
			if (scan.next() == "그만") {
				break;
			}
			String info = scan.nextLine();
			String info_ [] = info.split(",");
			Student arrInfo = new Student(info_[0], info_[1],info_[2],info_[3]);
		}
		printArray(arr);
	}

}
