package exception;

public class InvalidUserException extends Exception {

	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Given User is INVALID";
	};
}
