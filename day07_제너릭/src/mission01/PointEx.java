package mission01;

public class PointEx {

	public static void main(String[] args) {
		CPoint a = new CPoint(2, 3);
		CColorPoint b = new CColorPoint(3, 4, "red");
		
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}

}
