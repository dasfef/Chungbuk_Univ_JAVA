package day05;

public class Str_trim {

	public static void main(String[] args) {
		String str = " abc 한글 DEF ";
		String result = "";
		
		System.out.println("원본 문자열 ==> " + str);
		System.out.println("\n대문자로 ==> " + str.toUpperCase());
		System.out.println("소문자로 ==> " + str.toLowerCase());
		System.out.print("모든 공백을 제거한 결과 ==> ");
		
		for (int i = 0; i < str.length(); i++) {
			if(!(str.charAt(i) == ' ')) result += str.charAt(i);
		}
		System.out.println(result);
		System.out.print("양 사이드 공백 제거 결과 ==> ");
		System.out.println(str.trim());
	}

}
