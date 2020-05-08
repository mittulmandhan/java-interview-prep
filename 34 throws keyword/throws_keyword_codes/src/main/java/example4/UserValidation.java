package example4;

import exception.InvalidUserException;

// Here we are not using throws statement in main() unlike previous example
// now we need to handle the exception by using try/catch block inside main()
public class UserValidation {
	public boolean isValidUser(String name) throws InvalidUserException {
		if (name.equals("")) {
			throw new InvalidUserException();
		}
		return true;
	}

	public static void main(String[] args) {
		try {
			System.out.println(new UserValidation().isValidUser(""));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("in catch");
		}

	}
}
