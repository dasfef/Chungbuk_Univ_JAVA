package ex06_exceptionBank;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {
		BalanceInsufficientException(String message) {
			super(message);
		}
	}
}
