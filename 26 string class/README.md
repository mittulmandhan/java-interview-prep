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
__2.)String(byte[] byte_arr, Charset char_set)__<br>
Constructs a String by decoding the byte array and it uses the given character set for decoding. We can choose ascii, UTF-8, UTF-16 and more using char_set object of type Charset.
````
````
__3.)String(byte[] byte_arr, String char_set_name)__<br>
Construct a new String by decoding the byte array. In the second argument, we can give character set name as string. This constructor also throws UnsupportedEncodingException.
````
````
__4.)String(byte[] byte_arr, int start_index, int length)__<br>
Construct a new String from the byte array depending on the start_index and length.
````
````
__5.)String(byte[] byte_arr, int start_index, int length, Charset char_set)__<br>
Construct a new String from the byte array depending on the start_index & length, and also specify the character set for encoding.
````
````
__6.)String(byte[] byte_arr, int start_index, int length, String char_set_name)__<br>
Construct a new String from the byte array depending on the start_index and length, and give character set name as a string.This constructor throws UnsupportedEncodingException.
````
````
__7.)String(char[] char_arr)__<br>
Constructs a new String from the given sequence or array of characters.
````
````
__8.)String(char[] char_array, int start_index, int count)__<br>
Constructs a String from the given character array depending on the offset(start) and count of characters.
````
````
__9.)String(int[] uni_code_points, int start_index, int count)__<br>
Constructs a String from the given array of uni_code_array(ASCII unicodes) depending on the start_index and count of characters.
````
````
__10.)String(StringBuffer s_buffer)__<br>
Constructs a new String from the given StringBuffer class' object.
````
````
__11.)String(StringBuilder s_builder)__<br>
Constructs a new String from the given StringBuilder class' object.

## String Class Methods
__1.)int length()__<br>
Returns the number of characters in the String.
__2.)Char charAt(int i)__<br>
Returns the character at ith index.
__3.)String substring(int i)__<br>
Returns the substring from the ith  index character to end.
__4.)String substring (int i, int j)__<br>
Returns the substring from ith to jth(excluding jth index) index.
__5.)String concat( String str)__<br>
Concatenates the given string at the end of `this` string.
__6.)int indexOf(String s)__<br>
Returns the index of `this` String at which the given String s is first occuring.
__7.)int indexOf (String s, int i)__<br>
Returns the index of `this` String at which the given String s is first occuring but starting from ith index.
__8.)Int lastIndexOf(String s)__<br>
Returns the index of `this` String at which the given String s is last occuring.
__9.)boolean equals( Object otherObj)__<br>
Compares `this` String to the given String. This is a case sensitive comparison.
__10.)boolean  equalsIgnoreCase(String anotherString)__<br>
Compares `this` String to the given String, ignoring case considerations/sensitiveness.
__11.)int compareTo(String anotherString)__<br>
Compares `this` String and given String(i.e. anotherString) lexicographically.
__12.)int compareToIgnoreCase( String anotherString))__<br>
Compares `this` String and given String(i.e. anotherString) lexicographically, ignoring case considerations/sensitiveness.
__13.)String toLowerCase()__<br>
Converts all the characters in `this` String to lower case and returns the result string.
__14.)String toUpperCase()__<br>
Converts all the characters in `this` String to upper case and returns the result string.
__15.)String trim()__<br>
Returns the copy of `this` String, copy String is same as this String copy String does not have whitespaces at both ends. It does not affect the whitespaces in the middle
__16.)String replace (char oldChar, char newChar)__<br>
Returns a new String in which all the occurences of oldChar in `this` char is replaced to newChar.



