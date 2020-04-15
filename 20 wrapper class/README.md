# Wrapper Class
* A wrapper class is a class whose object wraps or contains a primitive data types.
* When we create a wrapper class it contains a field/variable, we can store a premitive data types in this field. In other words, we can wrap a premitive data type in an object of wrapper class.

### Need for Wrapper Class
1. To convert simple data types into objects i.e to give a data type a form of an object. Objects are needed if we want to modify the value of arguments passed into a method because primitive types are passed by value and you can modify them once passed as an argument.
````
// here string is changed into integer primitive type by using parseInt() method.

class A {
  public static void main(String args[]) {
    String number = "1234";
    int x = Integer.parseInt(number);
    System.out.println(x);
  }
}
````
2. The classes in java.util package handles only objects and hence wrapper classes help in this also.
3. Data structures in Collection framework such as ArrayList, Stack, Set, Queue and Vector store only objects, not primitive data types.
4. An object is needed to support synchronization in multi-threading.
5. To convert strings into data types wwhich is known as parsing operations, here method are used such as parseInt(), parseShort(), parseFloat(), etc.

Primitive data Types | Wrapper Class
-------------------- | -------------
char                 | Character
int                  | Integer
boolean              | Boolean
long                 | Long
short                | Short
float                | Float
double               | Double
byte                 | Byte

### Autoboxing
* Autoboxing is conversion of primitive types into the object of their corresponding wrapper class.
* For eg: conversion of int to Integer, float to Float, char to Character, etc.
````
import java.util.ArrayList;

class Autoboxing {
  public static void main(String args[]) {
    char ch = 'a';
    
    // Autoboxing: primitive char to Character object conversion
    Character a = ch;
    
    // printing autoboxed Character object
    System.out.println(a);
    
    ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
  
    // Autoboxing because ArrayList stores only objects 
    arrayList.add(25); 
  
    // printing the value from Integer object
    System.out.println(arrayList.get(0));// 25
  }
}
````
__output:__
````
a
25
````

### Unboxing
* It is just the reverse of the Autoboxing.
* Converting an object of wrapper class into its corresponding primitive type is known as Unboxing.
* For eg: conversion of Float to float, Byte to byte, Short to short, etc.
````
import java.util.ArrayList;

class Unboxing {
  public static void main(String args[]) {
    Character ch ='a';
    
    // unboxing: Character object to premitive char type conversion
    char a = ch;
    
    // printing unboxed char
    System.out.println(a);
    
    ArrayList<Integer> arr = new ArrayList<Integer>(); 
    arr.add(24); 
  
    // unboxing because get method returns an Integer object 
    int num = arr.get(0); 
  
    // printing the value of primitive int type
    System.out.println(num);
  }
}
````
__output:__
````
a
24
````

### Some Code Examples

1.
````
// default value of a wrapper class object will always be null since it is an object.

class A {
  int x;
  Integer m;
  
  public static void main(String args[]) {
    A a = new A();
    System.out.println(a.x);// 0
    System.out.println(a.m);// null
  }
}
````
__output:__
````
0
null
````

2.
````
// we want to convert a int into corresponding binary string format or hexadecimal format

class A {
  public static void main(String args[]) {
    int x=6;
    String binary=Integer.toBinaryString(x);
    String hex=Integer.toHexString(x);
    String octal=Integer.toOctalString(x);
    
    System.out.println(binary);// 110
		System.out.println(hex);// 6
		System.out.println(octal);// 6
  }
}
````
__output:__
````
110
6
6
````

3.
````
// here I have wrapped and unwrapped all the data types and printed them too

class A {
	public static void main(String args[]) {
		// byte data type
		byte a = 1;

		// wrapping around Byte object
		Byte byteobj = new Byte(a);

		// int data type
		int b = 10;

		// wrapping around Integer object
		Integer intobj = new Integer(b);

		// float data type
		float c = 18.6f;

		// wrapping around Float object
		Float floatobj = new Float(c);

		// double data type
		double d = 250.5;

		// Wrapping around Double object
		Double doubleobj = new Double(d);

		// char data type
		char e = 'a';

		// wrapping around Character object
		Character charobj = e;

		// printing the values from objects
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object byteobj:  " + byteobj);
		System.out.println("Integer object intobj:  " + intobj);
		System.out.println("Float object floatobj:  " + floatobj);
		System.out.println("Double object doubleobj:  " + doubleobj);
		System.out.println("Character object charobj:  " + charobj);

		// objects to data types (retrieving data types from objects)
		// unwrapping objects to primitive data types
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;

		// printing the values from data types
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		System.out.println("char value, cv: " + cv);
	}
}
````
__output:__
````
Values of Wrapper objects (printing as objects)
Byte object byteobj:  1
Integer object intobj:  10
Float object floatobj:  18.6
Double object doubleobj:  250.5
Character object charobj: a
Unwrapped values (printing as data types)
byte value, bv: 1
int value, iv: 10
float value, fv: 18.6
double value, dv: 250.5
char value, cv: a
````

__Resources:__
* https://www.geeksforgeeks.org/wrapper-classes-java/
* https://way2java.com/java-lang/wrapper-classes/
