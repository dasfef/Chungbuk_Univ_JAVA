package ex05_exception;

public class MultiCatchEx {
	public void method1() throws Exception {
//		method2();
		throw new Exception();
	}
	
	public void method2() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
	public static void main(String[] args) {
		MultiCatchEx ok = new MultiCatchEx();
		try {
			ok.method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
