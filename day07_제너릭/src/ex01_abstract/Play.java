package ex01_abstract;

public class Play {

	public static void main(String[] args) {
		GoodCalc g = new GoodCalc();
		int [] b = {1, 2, 3, 4, 5};
		System.out.println(g.add(1, 2));
		System.out.println(g.subtract(2, 1));
		System.out.println(g.average(b));
	}

}
