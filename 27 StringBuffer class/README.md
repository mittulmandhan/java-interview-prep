# StringBuffer Class
* StringBuffer class is a peer class of String class and provides the mostly similar functionalities.
* It extends Object class and implements Serializable, Appendable & CharSequence interfaces.
* StringBuffer is public final class.
* So, the signature of StringBuffer is<br>
  `public final class StringBuffer extends Object implements Serializable, CharSequence, Appendable`
* String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
* StringBuffer class is synchronizable and data in  each thread is thread safe.


## StringBuffer Constructors
* __StringBuffer()__: It reserves space for 16 characters without reallocation.<br>
  `StringBuffer s=new StringBuffer();`
* __StringBuffer( int size)__: It accepts a String argument that explicitly sets the size of the buffer.<br>
  `StringBuffer s=new StringBuffer(20);`
* __StringBuffer(String str)__: It accepts a String argument that sets the initial contents of the StringBuffer object and reserves room for 16 more/additional characters without reallocation.<br>
  `StringBuffer s=new StringBuffer("GeeksforGeeks");`


## StringBuffer Methods
* __length()__: It returns the length of a string buffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __capacity()__: It returns the total allocated capacity of the string buffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __append()__: It is used to add text in the existing StringBuffer. It is an overloaded method providing the append string, int, float, boolean, long, char, object reference and more at the end of this StringBuffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
* __reverse()__: It reverse the sequence of characters in the StringBuffer object.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __delete(int startIndex, int endIndex)__: This method deletes the character sequence within this StringBuffer. It takes 2 arguments, startIndex and endIndex.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
* __replace(int startIndex, int endIndex, String str)__: It replaces the substring of this StringBuffer with the given String str.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __ensureCapacity(int capacity)__: It is used to increase the capacity of a StringBuffer object. The new capacity will be set to either the value we specify or twice the current capacity plus two (i.e. capacity+2), whichever is larger. Here, capacity specifies the size of the buffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __appendCodePoint(int codePoint)__: This method appends the string representation of the codePoint argument to this character sequence(StringBuffer object).
````
StringBuffer sb = new StringBuffer("Mittul");
sb.appendCodePoint(int codePoint)
````
* __charAt(int index)__: This method returns the char value in this StringBuffer object at the given index.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __chars()__: This method returns a stream of int zero-extending the char values in this sequence.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
* __codePointCount(int beginIndex, int endIndex)__: This method returns the number of unicode code points in the specified text range within this StringBuffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
* __getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)__: In this method, the characters are copied from this StringBuffer into the destination character array dst.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __indexOf(String str)__: It returns the index of the first occurence of the specified substring within this StringBuffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __lastIndexOf(String str)__: It returns the index of last occurence of the specified substring within this StringBuffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
* __offsetByCodePoints(int index, int codePointOffset)__: This method returns the index within this StringBuffer that is offset from the given index by codePointOffset points.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
* __setLength(int newLength)__: This method sets the new length of this StringBuffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
* __substring(int start, int end)__: This method returns a new String that contains a subsequence of characters currently contained in this StringBuffer.
````
public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
		StringBuffer sb = new StringBuffer("Mittul");
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
