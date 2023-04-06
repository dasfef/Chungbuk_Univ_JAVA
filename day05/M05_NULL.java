package day05;

public class M05_NULL {
	
	public static void main(String[] args) {
		// ===== ▣ 1번 : NullPointerException =====
//		int[] intArray = null;
//		intArray[0] = 10;
		
//		String str = null;
//		System.out.println("총 문자수 : " + str.length());
		
		// ===== ▣ 2번 : 배열 참조 =====
//		int [] arr = new int [] {10, 20, 30, 40, 50};
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// ===== ▣ 3번 : String 배열 참조 =====
		String [] arr = new String [5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
