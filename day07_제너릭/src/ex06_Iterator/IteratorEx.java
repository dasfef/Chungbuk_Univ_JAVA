package ex06_Iterator;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 1; i < 101; i++ ) {
			v.add(i);
		}
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n + " ");
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			sum += it.next();
		}
		System.out.println("벡터에 존재하는 모든 정수의 합 : " + sum);
	}
}
