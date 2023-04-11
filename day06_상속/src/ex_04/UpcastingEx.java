package ex_04;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p = new Student("최연웅");
		Student s;
		s = (Student)p;
		
		System.out.println(p.name);
		
		s.grade = "A";
		s.department = "Com";
	}

}
