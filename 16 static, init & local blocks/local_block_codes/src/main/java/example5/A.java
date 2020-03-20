package example5;

public class A {
	public static void main(String[] args) {
		// In this for loop semicolon just after
		// the parenthesis means that the for loop body ends here
		// and the block, i.e. {}, you are seeing is a local block
		// but the error occurs when this local block tries to access
		// the variable(i) whose scope is limited to the for loop only
		// compiler will show an error message "i cannot be resolved to a variable"
		for (int i = 1; i < 5; i++);
		{
			System.out.println(i);
		}
	}
}
