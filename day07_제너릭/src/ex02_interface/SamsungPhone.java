package ex02_interface;

interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() { System.out.println("** Phone **"); }
}

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다");
	}
	
	public void flash() { System.out.println("전화기에 불이 켜졌습니다"); }

}
