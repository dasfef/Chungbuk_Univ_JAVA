package mission01;

import java.util.ArrayList;

public class RareInt {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static ArrayList<Integer> search(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 1; j <= arr.get(i); j++) {
				ArrayList<Integer> y = new ArrayList<Integer>();
				if(arr.get(i) % j == 0)
					y.add(arr.get(i));
				if(y.size() > 2) {
					result.add(arr.get(i));
				}
			}
		}
		return result;
	}
	
	public static void printArray(ArrayList<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			int rand = (int)Math.random() * 100;
			arr.add(rand);
		}
		System.out.println(arr.get(0));
		search(arr);
		System.out.print("[");
		printArray(result);
		System.out.print("]");
	}
}
