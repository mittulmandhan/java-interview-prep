package example3;

import exception.InvalidUserException;

// when we throw error to jvm and dont handle it
// jvm handles the exception by calling toString() method
public class UserValidation {
	public boolean isValidUser(String name) throws InvalidUserException {
		if (name.equals("")) {
			throw new InvalidUserException();
		}
		return true;
	}

	public static void main(String[] args) throws InvalidUserException {
		System.out.println(new UserValidation().isValidUser(""));
	}
}
