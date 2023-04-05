package class_;

public class Phone {
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public static void search(Phone book[], String n) {
		String result_name = null;
		String result_tel = null;
		String failure = null;
		boolean flag = true;
		for (int i = 0; i < book.length; i++) {
			if(book[i].name.equals(n)) {
				result_name = n;
				result_tel = book[i].tel;
				flag = false;
			}
			else
				failure = "존재하지 않는 이름입니다";
			
		}
		
		if (flag == false) {
			System.out.printf("%s 의 번호는 %s 입니다", result_name, result_tel);
		}
		else System.out.println(failure);
		
	}
}
