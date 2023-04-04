package day04;

public class Rectangle_M {
	int x, y, width, height;
	
	public Rectangle_M(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.printf("(%d, %d)에서 크기가 %d x %d 인 사각형\n", x, y, width, height);
	}
	
	public boolean contains(Rectangle_M r) {
		if(r.x <= this.x && r.y <= this.y && r.square() <= this.square()) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle_M rec1 = new Rectangle_M(2, 2, 8, 7);
		Rectangle_M rec2 = new Rectangle_M(5, 5, 6, 6);
		Rectangle_M rec3 = new Rectangle_M(1, 1, 10, 10);
		
		rec1.show();
		System.out.println("rec2의 면적은 " + rec2.square());
		if(rec3.contains(rec1)) System.out.println("rec3은 rec1을 포함합니다");
		if(rec3.contains(rec2)) System.out.println("rec3은 rec2을 포합합니다"); 
	}

}
