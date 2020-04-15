// we want to convert a int into corresponding binary string format or hexadecimal format

package example3;

public class A {
	public static void main(String args[]) {
		int x = 6;
		String binary = Integer.toBinaryString(x);
		String hex = Integer.toHexString(x);
		String octal = Integer.toOctalString(x);

		System.out.println(binary);// 110
		System.out.println(hex);// 6
		System.out.println(octal);// 6
	}
}