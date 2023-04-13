package ex04_Vector_class;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		
		// 3개의 Point 객체 삽입
		v.add(2);
		v.add(5);
		v.add(30);
		
		v.remove(1);
		
		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i = 0; i < v.size(); i++) {
			Integer p = v.get(i);
			System.out.println(p);
		}
		
		printVector(v);
		
		
	}
	
	public static void printVector(Vector<Integer> v) {
		for(int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
	}

}
