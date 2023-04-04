package day04;

public class TV {
	String tv;
	int year;
	int inch;

	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV",tv, year, inch);
	}
	
	public TV(String a, int b, int c) {
		this.tv = a;
		this.year = b;
		this.inch = c;
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
