# StringBuilder Class
* StringBuilder class exists inside java.lang package.
* StringBuilder class is identical to StringBuilder except StringBuilder does not provide syncronization.
* StringBuilder and StringBuilder share same set of functionalities except for syncronization.
* Signature of StringBuilder is same as StringBuilder i.e.<br>
  `public final class StringBuilder extends AbstractStringBuilder implements Serializable, CharSequence`
* String represents fixed-length, immutable character sequences while StringBuilder represents growable and writable character sequences thats why StringBuilder is called mutable class.
* When we have single thread then StringBuilder is recommended to use because it will be faster than StringBuilder when we have only one thread.
* StringBuilder methods can write original character sequence in it.


## StringBuilder Constructors
* __StringBuilder()__: Constructs a StringBuilder object with no characters in it and an initial capacity of 16 characters.<br>
````
StringBuilder sb = new StringBuilder();
````
* __StringBuilder(int capacity)__: Constructs a StringBuilder object with no characters in it and an initial capacity specified by the capacity argument.<br>
````
StringBuilder sb = new StringBuilder(10);
````
* __StringBuilder(CharSequence seq)__: Constructs a StringBuilder object that contains the same characters as specified in the `CharSequence seq` argument.<br>
````
CharSequence cs = "Hello";
StringBuilder sb = new StringBuilder(cs);
````
* __StringBuilder(String str)__: COnstructs a StringBuilder object initialized with the contents of the specified `String str` argument.<br>
````
StringBuilder sb = new StringBuilder("Hello");
````


## StringBuilder Methods
* __length()__: It returns the length of a string builder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
````
__output:__
````
Mittul
6
````
* __capacity()__: It returns the total allocated capacity of the string builder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
````
__output:__
````
Mittul
22
````
* __append()__: It is used to add text in the existing StringBuilder. It is an overloaded method providing the append string, int, float, boolean, long, char, object reference and more at the end of this StringBuilder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.append(" Mandhan"));
	}
}
````
__output:__
````
Mittul
Mittul Mandhan
````
* __insert()__: It is used to insert text at the specified index.It is an overloaded method.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.insert(6, " Mandhan"));
		System.out.println(sb.insert(14, 22));
	}
}
````
__output:__
````
Mittul
Mittul Mandhan
Mittul Mandhan22
````
* __reverse()__: It reverse the sequence of characters in the StringBuilder object.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
````
__output:__
````
Mittul
luttiM
````
* __delete(int startIndex, int endIndex)__: This method deletes the character sequence within this StringBuilder. It takes 2 arguments, startIndex and endIndex.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.delete(1, 5));
	}
}
````
__output:__
````
Mittul
Ml
````
* __deleteCharAt(int loc)__: This method deletes the character at the given position/index.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(0));
	}
}
````
__output:__
````
Mittul
ittul
````
* __replace(int startIndex, int endIndex, String str)__: It replaces the substring of this StringBuilder with the given String str.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.replace(0, 5, "Kewa"));
	}
}
````
__output:__
````
Mittul
Kewal
````
* __ensureCapacity(int capacity)__: It is used to increase the capacity of a StringBuilder object. The new capacity will be set to either the value we specify or twice the current capacity plus two (i.e. capacity+2), whichever is larger. Here, capacity specifies the size of the string builder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
	}
}
````
__output:__
````
22
50
````
* __appendCodePoint(int codePoint)__: This method appends the string representation of the codePoint argument to this character sequence(StringBuilder object).
````
StringBuilder sb = new StringBuilder("Mittul");
sb.appendCodePoint(int codePoint)
````
* __charAt(int index)__: This method returns the char value in this StringBuilder object at the given index.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(4));
	}
}
````
__output:__
````
Mittul
M
u
````
* __chars()__: This method returns a stream of int zero-extending the char values in this character sequence.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.chars());
	}
}
````
__output:__
````
Mittul
java.util.stream.IntPipeline$Head@87aac27
````
* __codePointAt(int index)__: This method returns the character code(unicode code point)  at the specific index.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.codePointAt(0));
	}
}
````
__output:__
````
Mittul
77
````
* __codePointBefore(int index)__: This method returns the character code before the given index.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.codePointBefore(2));
	}
}
````
__output:__
````
Mittul
105
````
* __codePointCount(int beginIndex, int endIndex)__: This method returns the number of unicode code points in the specified text range within this StringBuilder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.codePointCount(0, sb.length()));
	}
}
````
__output:__
````
Mittul
6
````
* __offsetByCodePoints(int index, int codePointOffset)__: This method returns a stream of code point values from this  character sequence.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.offsetByCodePoints(2, 2));
	}
}
````
__output:__
````
Mittul
4
````
* __getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)__: In this method, the characters are copied from this StringBuilder into the destination character array dst.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		char[] dst= {'a','b','c','d','e','f'};
		sb.getChars(0, 4, dst, 0);
		System.out.println(dst);
	}
}
````
__output:__
````
Mittul
Mittef
````
* __indexOf(String str)__: It returns the index of the first occurence of the specified substring within this StringBuilder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.indexOf("it"));
	}
}
````
__output:__
````
Mittul
1
````
* __lastIndexOf(String str)__: It returns the index of last occurence of the specified substring within this StringBuilder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.lastIndexOf("t"));
	}
}
````
__output:__
````
Mittul
3
````
* __offsetByCodePoints(int index, int codePointOffset)__: This method returns the index within this StringBuilder that is offset from the given index by codePointOffset points.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.offsetByCodePoints(0, 4));
	}
}
````
__output:__
````
Mittul
4
````
* __setCharAt(int index, char ch)__: This method is used to set the char at given index to ch.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		sb.setCharAt(3, 'h');
		System.out.println(sb);
	}
}
````
__output:__
````
Mittul
Mithul
````
* __setLength(int newLength)__: This method sets the new length of this StringBuilder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(40);
		System.out.println(sb.length());
	}
}
````
__output:__
````
Mittul
6
40
````
* __subSequence(int start, int end)__: This method returns a new character sequence that is a subsequence of this sequence.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.subSequence(0, 4));
	}
}
````
__output:__
````
Mittul
Mitt
````
* __substring(int start, int end)__: This method returns a new String that contains a subsequence of characters currently contained in this StringBuilder.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.subSequence(1, 5));
		System.out.println(sb.subSequence(3, 6));
	}
}
````
__output:__
````
Mittul
ittu
tul
````
* __toString()__: This method returns a string object representing this character sequence.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.toString());
	}
}
````
__output:__
````
Mittul
Mittul
````
* __trimToSize()__: This method reduces the storage/size/capacity used for the character sequence to the length of this character sequence.
````
public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}
````
__output:__
````
Mittul
22
6
6
````


<br><br>__Resources:__
* https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
* https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
