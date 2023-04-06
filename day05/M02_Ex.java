package day05;

public class M02_Ex {

	public static void main(String[] args) {
		M02_StaticSample.m = 10;
		
		M02_StaticSample s1 = new M02_StaticSample();
		System.out.println(s1.m);
		s1.f();
		M02_StaticSample.f();
//		System.out.println();
	}

}
