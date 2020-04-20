# Object Class
* Object class is present in `java.lang` package.Without `java.lang` package its impossible to write a java programm that's why all the programms in java import `java.lang` package by default. This package contains most essential classes of java i.e. Object, String, StringBuilder, StringBuffer and more.
* Every class directly or indirectly is derived from the Object class. If a class does not extend any other class then it is direct child of Object and if extends other class then it is an indirectly derived class. Therefore the Object class methods are available to all the Java classes.
````
// class A does not extend any other class so
// compiler changes the code `class A` to `class A extends Object` as given below
// so class A is a direct child of Object

class A /*extends Object*/ {
  // Data members
  // Constructor(s)
  // Member functions
}
````
````
// Here B extends A and A extends Object
// Hence B becomes indirectly derived from Object

class B extends A {
  // Data members
  // Constructor(s)
  // Member functions
}
````
* Object class acts as a root of inheritance hierarchy in any Java programm.
* Methods present in Object class:
  - toString()
  - hashCode()
  - equals(Object obj)
  - getClass()
  - finalize()
  - clone()
  - wait(long timeout)
  - wait(long timeout, int nanos)
  
## Methods in Object class

### toString()
* toString() provides String representation of an Object and used to convert an object to string.
* It returns the string consisting of the name of the class of which the object is an instance, the @ sign , and the unsigned hexadecimal representation of the hash code of the object.
<br>    `<class_name>@<object_hash_code>`
````
public String toString() {
  return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
````
* We can also override toString method to get our own String representation of Object.
````
public class A {
	static int count = 1;
	int id;

	A() {
		id = count;
		count++;
	}

	@Override
	public String toString() {
		return "id of this object is " + id;
	}

	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();

		System.out.println(obj1.toString());
		System.out.println(obj2);
	}
}
````
* Whenever we try to print any Object reference, then internally toString() method is called.
````
public class A {
	public static void main(String[] args) {
		A a = new A();

		// Both of these lines will produce same output
		// because compiler will change
		// a to a.toString()
		System.out.println(a);
		System.out.println(a.toString());
	}
}
````

### hashCode()
* For every object, JVM generates a unique number which called hash code.
* hashCode() method returns that hash code that is used to search the object in Heap.
* A common misconception about this method is that it returns the address of the abject in heap which is wrong.
* It converts the address of object to an integer by using an algorithm.
* hashCode() method is native because in Java it is impossible to find address of an object, so it uses native languages like C/C++ to find address of the object.
* This method is mostly used by JVM while saving the objects into hashing related data structures like HashSet, HashMap, Hashtable, etc. The main advantage of saving objects based on hash codes is that searching becomes easier.
* We can override hashCode() method such that for every object we generate a unique number ourself.
<br>For example: Student class have roll no. as a unique number for every Student class' object.
````
public class Student {
	String name;
	static int rollcount = 101;
	int roll;

	Student(String name) {
		this.name = name;
		roll = rollcount;
		rollcount++;
	}

	@Override
	public int hashCode() {
		return roll;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Mittul");
		Student s2 = new Student("Rahul");
		Student s3 = new Student("Sagar");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
````

### equals(Object obj)
* It compares the given object with `this` object(the object on which the method is called).
* It gives a generic way to compare objects for equality.
* We can override equals() method to get our own equality condition on Objects.
````
public class A {
	int x = 10;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A && this.x == ((A) obj).x)
			return true;
		return false;
	}

	void printEquals(Object obj) {
		if (this.equals(obj)) {
			System.out.println("equal");
			return;
		}
		System.out.println("not equal");
	}

	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		B obj4 = new B();
		obj3.x = 20;

		obj1.printEquals(obj2);
		obj1.printEquals(obj3);
		obj1.printEquals(obj4);
	}
}
````
````
public class B {
	int x = 10;
}
````
* It is necessary to override the hashCode() method whenever this method is overridden, to maintain the general rule for the hashCode method i.e. equal objects must have equal hash codes.

### getClass()
* getClass() method returns the Class object of this object and used to get actual runtime class of the object. 
* It can also be used to get metadata of this object's class.
* The class Class has several methods like getName(), forName(), getFields(), etc that can be used through Class class object returned by getClass() method.
````
public class A {
	int x = 10;
	int y = 20;

	public static void main(String[] args) {
		Class<?> c = new A().getClass();

		System.out.println(c.getName());
		System.out.println(c.getCanonicalName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
	}
}
````
* getClass() method cannot be overrided as it is final.
* After loading .class file, JVM creates an object of the type java.lang.Class in the Heap area. We can use Class class object to get class level information. It is widely used in refllection

### finalize()
* This method is called just before an object is garbage collected.
* It is called by the garbage collector on an object when garbage collector finds out that there are no more references to the object.
* We should override finalize() method to dispose system resources, perform clean-up activities and minimize memory leaks.
````
// program to demonstrate working of finalize()
public class A {

	// this method will be called by garbage collector
	@Override
	protected void finalize() {
		System.out.println("finalize() method called");
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.hashCode());

		a = null;

		// calling garbage collector
		System.gc();

		System.out.println("end");
	}
}
````
* finalize() method is called only once in the life time of an object even though that object is eligible for garbage collection multiple times.

### clone()
* It returns a new object that is exactly the same as this object.
* It returns a deep copy/clone of this object.
* __Advantages of clone() method:__
  - If we use assignment operator to assign an object reference to another reference variable then it points to the same object in heap which is called shallow copy. Due to this any changes made through the copy reference variable will be reflected in the original object.
  - If we use copy constructor, then we have to write code to reassign all the fields of the class in the copy constructor explicitly. But in clone() method we don't need to explicitly write any code, just call the clone() method and it will return the deep copy i.e. the clone of this object.

<br><br>__Resources:__
* https://www.geeksforgeeks.org/object-class-in-java/
* https://www.geeksforgeeks.org/clone-method-in-java-2/
* https://www.geeksforgeeks.org/overriding-equals-method-in-java/
* https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
* https://www.javatpoint.com/java-class



