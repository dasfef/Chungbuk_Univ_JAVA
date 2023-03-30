package day03;

public class M0330_06 {
	
	static int[] makeArray() {
		int[] temp = new int[4];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = i + 10;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int [] intArray;
		intArray = makeArray();
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

}
