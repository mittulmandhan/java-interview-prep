# Singleton Design Pattern
* Singleton pattern is one of the simplest design patterns in Java.
* Singleton is a type under Creational Design Pattern.
* In this Design Pattern, only one instance of a particular class is created and shared among all. This class provides a way to access its only object which can be accessed directly by some other class.
* This design pattern solves a bigger problem which is not usually considered at starting phase of an application but as the codebase grows problems becomes inevitable.
* Steps to create a singleton class in Java:
  <br>__Step 1:__ Make a class with private constructor
     <br>(so that it cannot be initialized by any other class)
  <br>__Step 2:__ Create a private static reference variable of own type i.e. the singleton object reference variable.
     <br>(this is the only object of the singleton class, it cannot be accessed outside class and also it is created and initialized when class is loaded because it is static)
  <br>__Step 3:__ Create a static block and initialize the singleton object reference variable with a singleton object
  <br>__Step 4:__ Create a static function to get the singleton object
     <br>(this method can be called using class name and it makes the singleton object accessible for other classes)
  <br>__Note:__ If we do not declare this method static then this class will be useless as singleton object cannot be accessed whatsoever.

````
class Student {
  // step 2
  private static Student s;
  
  // step 3
  static {
    s = new Student();
  }
  
  // step 1
  private Student() {
  }
  
  // step 4
  static Student getStudent() {
    return s;
  }
}
````

* eg:
````
class Square {
	private static Square square;
	int x;

	static {
		square = new Square();
	}

	private Square() {
	}

	static Square getInstance() {
		return square;
	}

	int getResult() {
		return x * x;
	}
}
````
````
class A {
	
	public static void main(String[] args) {
		Square square = Square.getInstance();
		square.x=5;
		
		// before calling ab() method of class B
		System.out.println("before calling ab() method of class B");
		System.out.println(square.x);// 5
		System.out.println(square.getResult());// 25
		
		B b = new B();
		b.ab();
		
		// after calling ab() method of class B
		// you can see in the output changes made by ab() method will be reflected here
		System.out.println("after calling ab() method of class B");
		System.out.println(square.x);// 10
		System.out.println(square.getResult());// 100
	}
}
````
````
class B {
	void ab() {
		Square square = Square.getInstance();
		square.x=10;
		
		// Inside ab() method class B
		System.out.println("Inside ab() method class B");
		System.out.println(square.x);// 10
		System.out.println(square.getResult());// 100
	}
}
````
__output:__
````
before calling ab() method of class B
5
25
Inside ab() method class B
10
100
after calling ab() method of class B
10
100
````

__Resources:__
* https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm





