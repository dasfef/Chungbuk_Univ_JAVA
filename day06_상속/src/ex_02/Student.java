package ex_02;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
		System.out.println(getWeight());
	}
}
