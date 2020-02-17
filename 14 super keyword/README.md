# `super` Keyword
* In Java, `super` is a keyword i.e. a reference variable which is used to refer immediate parent class' object.
* Whenever we create an object of a class, an instance of its super class is also created which is reffered by reference variable called `super`.
* The `super` keyword came into picture with the concept of inheritance.

## Usage of Java `super` keyword
1. `super` can be used to access immediate parent class' instance variables.
2. `super` can be used to invoke immediate parent class' methods.
3. `super` can be used to invoke immediate parent class' constructor.

### 1. `super` can be used to access immediate parent class' instance variables.
* `super` can be used to access the fields or you can say variables or data members of the immediate parent class.
* This scenario occurs when a derived class and base class are have variables having same name.
````
class Animal {
	String color="white";
}

class Dog extends Animal {
	String color="black";
	
	void display() {
		System.out.println("Dog is "+color);
		System.out.println("Animal is "+super.color);
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
	}
}
````
output:
````
Dog is black
Animal is white
````
In the above example, if we print color we get black but when we print super.color we get the data member present in the Animal class i.e. color=white.

### 2. `super` can be used to invoke immediate parent class' methods.
* The `super` keyword can also be used to invoke parent class' methods.
* It should be used to resolve ambiguity when subclass contain methods having same name as superclass' methods. In other words, if a method is overridden and subclass want to use the superclass' definition for that overridden method, then we use super keyword.

````
class Person {
	void me() {
		System.out.println("I am a Person.");
	}
};

class Student extends Person {
	void me() {
		System.out.println("I am a Student.");
	}
	
	void display() {
		me();
		
		super.me();
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
	}
}
````
output:
````
I am a Student.
I am a Person.
````

### 3. `super()` can be used to invoke immediate parent class' constructor.
* `super()` is used to invoke the parent class' constructor.
* `super()` can call both, parameterized as well as non-parameterized constructors of super class.
* `super()` can only be used inside constructor.
* `super()` must be the first staement in the constructor(even before `this()`) or program will show a compile time error message i.e. Unresolved compilation problems: Implicit super constructor Bicycle() is undefined. Must explicitly invoke another constructor Constructor call must be the first statement in a constructor.
* `super()` is used to reuse the superclass constructor.
* If a constructor does not explicitly calls super class' constructor using `super()`, compiler will add the `super()` statement at the first line of the constructor. In this case, if super class does not have a no-parameter constructor, you will get a compile-time error message i.e. Unresolved compilation problem: The constructor Parent() is undefined. Object class does have a no-parameter constructor, so if Object is the only super class the there is no problem.
* If a subclass constructor calls constructor of its superclass, implicitly or explicitly, you might think that a whole chain of constructors get called, all the way back to the constructor of Object. Yes it happens and it is called constructor chaining.

````
package case3;

class Bicycle {
	int startCadence;
	int startSpeed;
	int startGear;
	
	Bicycle(int startCadence, int startSpeed, int startGear) {
		this.startCadence=startCadence;
		this.startSpeed=startSpeed;
		this.startGear=startGear;
	}
};

class MountainBike extends Bicycle {
	int seatHeight;
	
	MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight=startHeight;
	}
	
	void display() {
		System.out.println(seatHeight+" "+startCadence+" "+startSpeed+" "+startGear);
	}
	
	public static void main(String[] args) {
		MountainBike obj=new MountainBike(5, 1, 0, 2);
		obj.display();
	}
}
````
output:
````
5 1 0 2
````