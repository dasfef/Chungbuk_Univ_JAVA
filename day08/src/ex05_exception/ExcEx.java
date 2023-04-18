package ex05_exception;

public class ExcEx {
	public static void main(String[] args) {
		// Class 존재 여부 확인 오류
//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("클래스가 존재하지 않습니다");
//		}
		
//		String data1 = null;
//		String data2 = null;
//		
//		try {
//			data1 = args[0];
//			data2 = args[1];
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다");
//		}
		
		String data1 = "100";
		String data2 = "a100";
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		}
		finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
