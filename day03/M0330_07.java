package day03;

public class M0330_07 {
	static double avgExe(int[] a) {
		int sum = 0;
		
		for(int i = 0; i< a.length; i++) {
			sum += a[i];
		}
		return (double)sum / a.length;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 101);
		}
		
		double avg = avgExe(arr);
		System.out.println("배열 arr의 평균 : " + avg);
	}

}
