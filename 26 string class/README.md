# String Class
* A string is basically a sequence or array of characters.
* In Java, String is a class.
* String class is immutable i.e. its objects are constant and cannot be changed once created.
* Creating a String class object:
  - String literal<br>
    `String s = “Hello”;`
  - Using new keyword<br>
    `String s = new String (“GeeksforGeeks”);`
## String Class Constructors
__1.)String(byte[] byte_arr)__<br>
Construct a String by decoding the byte(ASCII codes) array. It uses the ASCII codes and decode them to corresponding characters to form a string.
````
public class A {
	public static void main(String[] args) {
		byte[] byte_arr = {72, 101, 108, 108, 111};
		String s = new String(byte_arr);
		System.out.println(s);
	}
}
````
__output:__
````
Hello
````
__2.)String(byte[] byte_arr, Charset char_set)__<br>
Constructs a String by decoding the byte array and it uses the given character set for decoding. We can choose ascii, UTF-8, UTF-16 and more using char_set object of type Charset.
````
public class A {
	public static void main(String[] args) {
		byte[] byte_arr = {72, 101, 108, 108, 111};
		Charset charset = Charset.defaultCharset();
		String s = new String(byte_arr, charset);
		System.out.println(s);
	}
}
````
__output:__
````
Hello
````
__3.)String(byte[] byte_arr, String char_set_name)__<br>
Construct a new String by decoding the byte array. In the second argument, we can give character set name as string. This constructor also throws UnsupportedEncodingException.
````
public class A {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		String s = new String(byte_arr, "US-ASCII");
		System.out.println(s);

		s = new String(byte_arr, "UTF-8");
		System.out.println(s);
	}
}
````
__output:__
````
Hello
Hello
````
__4.)String(byte[] byte_arr, int start_index, int length)__<br>
Construct a new String from the byte array depending on the start_index and length.
````
public class A {
	public static void main(String[] args) {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		String s = new String(byte_arr, 1, 3);
		System.out.println(s);
	}
}
````
__output:__
````
ell
````
__5.)String(byte[] byte_arr, int start_index, int length, Charset char_set)__<br>
Construct a new String from the byte array depending on the start_index & length, and also specify the character set for encoding.
````
public class A {
	public static void main(String[] args) {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		Charset charset = Charset.defaultCharset();
		String s = new String(byte_arr, 1, 3, charset);
		System.out.println(s);
	}
}
````
__output:__
````
ell
````
__6.)String(byte[] byte_arr, int start_index, int length, String char_set_name)__<br>
Construct a new String from the byte array depending on the start_index and length, and give character set name as a string.This constructor throws UnsupportedEncodingException.
````
public class A {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		String s = new String(byte_arr, 1, 3, "US-ASCII");
		System.out.println(s);
	}
}
````
__output:__
````
ell
````
__7.)String(char[] char_arr)__<br>
Constructs a new String from the given sequence or array of characters.
````
public class A {
	public static void main(String[] args) {
		char[] char_arr = { 'H', 'e', 'l', 'l', 'o' };
		String s = new String(char_arr);
		System.out.println(s);
	}
}
````
__output:__
````
Hello
````
__8.)String(char[] char_array, int start_index, int count)__<br>
Constructs a String from the given character array depending on the offset(start) and count of characters.
````
public class A {
	public static void main(String[] args) {
		char[] char_arr = { 'H', 'e', 'l', 'l', 'o' };
		String s = new String(char_arr, 1, 3);
		System.out.println(s);
	}
}
````
__output:__
````
ell
````
__9.)String(int[] codePoints, int start_index, int count)__<br>
Constructs a String from the given array of unicode array(ASCII unicodes) depending on the start_index and count of characters.
````
public class A {
	public static void main(String[] args) {
		int[] unicodes = { 72, 101, 108, 108, 111 };
		String s = new String(unicodes, 1, 4);
		System.out.println(s);
	}
}
````
__output:__
````
ello
````
__10.)String(StringBuffer s_buffer)__<br>
Constructs a new String from the given StringBuffer class' object.
````
public class A {
	public static void main(String[] args) {
		StringBuffer s_buffer = new StringBuffer("Hello");
		String s = new String(s_buffer);
		System.out.println(s);
	}
}
````
__output:__
````
Hello
````
__11.)String(StringBuilder s_builder)__<br>
Constructs a new String from the given StringBuilder class' object.
````
public class A {
	public static void main(String[] args) {
		StringBuilder s_builder = new StringBuilder("Geeks");
		String s = new String(s_builder);
		System.out.println(s);
	}
}
````
__output:__
````
Hello
````
__12.)String(String original)__<br>
Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string.
````
public class A {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		System.out.println(s1);
		String s2 = "Mittul";
		System.out.println(s2);
	}
}

````
__output:__
````
Hello
Mittul
````

## String Class Methods
<br>__1.)int length()__<br>
Returns the number of characters in the String.
<br>__2.)Char charAt(int i)__<br>
Returns the character at ith index.
<br>__3.)String substring(int i)__<br>
Returns the substring from the ith  index character to end.
<br>__4.)String substring (int i, int j)__<br>
Returns the substring from ith to jth(excluding jth index) index.
<br>__5.)String concat( String str)__<br>
Concatenates the given string at the end of `this` string.
<br>__6.)int indexOf(String s)__<br>
Returns the index of `this` String at which the given String s is first occuring.
<br>__7.)int indexOf (String s, int i)__<br>
Returns the index of `this` String at which the given String s is first occuring but starting from ith index.
<br>__8.)Int lastIndexOf(String s)__<br>
Returns the index of `this` String at which the given String s is last occuring.
<br>__9.)boolean equals( Object otherObj)__<br>
Compares `this` String to the given String. This is a case sensitive comparison.
<br>__10.)boolean  equalsIgnoreCase(String anotherString)__<br>
Compares `this` String to the given String, ignoring case considerations/sensitiveness.
<br>__11.)int compareTo(String anotherString)__<br>
Compares `this` String and given String(i.e. anotherString) lexicographically.
<br>__12.)int compareToIgnoreCase( String anotherString))__<br>
Compares `this` String and given String(i.e. anotherString) lexicographically, ignoring case considerations/sensitiveness.
<br>__13.)String toLowerCase()__<br>
Converts all the characters in `this` String to lower case and returns the result string.
<br>__14.)String toUpperCase()__<br>
Converts all the characters in `this` String to upper case and returns the result string.
<br>__15.)String trim()__<br>
Returns the copy of `this` String, copy String is same as this String copy String does not have whitespaces at both ends. It does not affect the whitespaces in the middle
<br>__16.)String replace(char oldChar, char newChar)__<br>
Returns a new String in which all the occurences of oldChar in `this` char is replaced to newChar.

````
public class A {
	public static void main(String[] args) {
		String s = " Mittul Mandhan ";
		String mystr1 = new String(" Mittul Mandhan ");
		String mystr2 = new String(" mittul mandhan ");
		String mystr3 = "Mittul";
		String mystr4 = "miTTul";

		System.out.println(s.length());// 16
		System.out.println(s.charAt(8));// 'M'
		System.out.println(s.substring(8));// "Mandhan "
		System.out.println(s.substring(3, 7));// "ttul"
		System.out.println(s.concat("is me"));// " Mittul Mandhan is me"
		System.out.println(s.indexOf("Mittul"));// 1
		System.out.println(s.lastIndexOf("dhan"));
		System.out.println(s.equals(mystr1));
		System.out.println(s.equalsIgnoreCase(mystr2));
		System.out.println(s.compareTo(mystr3));
		System.out.println(s.compareToIgnoreCase(mystr4));
		System.out.println(mystr4.toLowerCase());
		System.out.println(mystr4.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.replace('M', 'R'));
	}
}
````
__output:__
````
16
M
Mandhan 
ttul
 Mittul Mandhan is me
1
11
true
true
-45
-77
mittul
MITTUL
Mittul Mandhan
 Rittul Randhan 
````

<br><br>__Resources:__
* https://www.geeksforgeeks.org/string-class-in-java/
* https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

