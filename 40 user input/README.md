# Taking User Input
## Using Buffered Reader Class
* This method is used by wrapping the System.in (standard input stream) in an InputStreamReader which is wrapped in a BufferedReader, weread the input from the user in the command line.
* To read other types, we use functions like Integer.parseInt(), Double.parseDouble(), etc.
* To read multiple values, we use split(). Usually it is for Arrays.
<br>__Advantages:__
* The input is buffered for efficient reading.
<br>__Drawback:__
* The wrapping code is hard to remember.
* __Examples:__
<br>1.
````
public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();

		System.out.println(str);
	}
}
````
2.
````
public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] str = reader.readLine().split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
````
## Using Scanner Class
* This is most preferred method.
* The main purpose of the Scanner class is to parse primitive types and strings using regular expressions.
* It can also be used to read input from the user in the command line.
<br>__Advantages:__
* Convenient methods for parsing primitives (nextInt(), nextFloat(), …) from the tokenized input.
* Regular expressions can be used to find tokens.
<br>__Drawback:__
* The reading methods are not synchronized.
* __Examples:__
````
public class A {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s);
		int a = scan.nextInt();
		System.out.println(a);
		float b = scan.nextFloat();
		System.out.println(b);

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
## Using Console Class
* It is generally used for reading passwrod-like inputs without echoing the characters entered by the user.
<br>__Advantages:__
* Reading methods are synchronized.
* Reading passwords without echoing the entered characters.
* Format string syntax can be used.
<br>__Drawback:__
* Does not work in non-interactive environment.
* __Examples:__
````
public class A {
	public static void main(String[] args) {
		String str = System.console().readLine();
		System.out.println(str);

		// String[] arr = System.console().readLine().split(" ");
		// for (String i : arr) {
		// System.out.println(i);
		// }
	}
}
````
