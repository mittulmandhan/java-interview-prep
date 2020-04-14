# Polymorphism
* The word “poly” means many and “morphs” means forms, So it means many forms.
* Polymorphism means having many forms. It is considered as one of the important features of Object Oriented Programming.
* Real life example: A person at the same time can have different characteristics. Like a person can be a student, a customer, a friend and an employee that means same personis possessing different behaviour in different situations. This is called polymorphism.
* In Java, polymorphism  allows us to perform an action in different ways i.e. one interface and multiple implementations.
* __In Java, polymorphism is divided into 2 types:__
  - __Compile time polymorphism or Overloading or static binding/polymorphism.__
  - __Run time polymorphism or Overriding or dynamic binding/polymorphism__

## Overloading
* In overloading, methods are differentiated using no. of arguments or types of arguments.
* Overloaded methods share same name and return type.
````
class A {
  void sum(int x, int y) {
    System.out.println(x+y);
  }
  void sum(long x, long y) {
    System.out.println(x+y);
  }
  void sum(string x, string y) {
    System.out.println(x+y);
  }
}
````
* In overloading, Compiler is responsible to resolve the method call.
* When overloading methods, one row is added in the method table for every new overloaded method just like any other method.
* Two method having same name, return type, no. arguments and data types of arguments but different names are not valid because compiler works on datatypes and changing the name of parameters does not make any difference.
````
class A {
  void sum(int x. int y) {
    System.out.println(x+y);
  }
  void sum(int y. int x) {
    System.out.println(x+y);
  }
  public static void main(String args[]) {
    new A().sum(6,3);
  }
}
````
* println() method is also overloaded.
__proof__
````
class A {
  public static void main(String args[]) {
    int a=10,b=20;
    // this statement will take a and b as strings and concatinate them
    System.out.println("sum is "+a+b);
    // this statement will take a and b as integers and add them
    System.out.println(a+b+" is the sum");
  }
}
````
* eg 1:
````
class A {
  void sum(int x. int y) {
    System.out.println(x+y);
  }
  void sum(string x, string y) {
    System.out.println(x+y);
  }
  public static void main(String args[]) {
    A a = new A();
    a.sum(10,5);
    A b = new A();
    b.sum("foo","bar");
  }
}
````
* eg 2:
````
// In this code, it is important to use f(float specifier)
// otherwise this code will not compile
// because compiler will resolve 10.0 & 20.0 as type double by default
class A {
  void sum(int x. int y) {
    System.out.println(x+y);
  }
  void sum(float x, float y) {
    System.out.println(x+y);
  }
  public static void main(String args[]) {
    A a = new A();
    a.sum(10,5);
    A b = new A();
    b.sum(10.0f,20.0f);
  }
}
````

## Overriding
* Rules for Overriding a method:
  1. Inheritance must be present
  2. Method signature must be same
````
public void ab(int x) {
  System.out.println("Hello!");
}
````
Here, `public void ab(int x)` is the signature of ab() method.
* Method overloading basically means that in method table the parent class' method reference of the method signature is overwritten by the child class' method reference of the method signature i.e. why child class' implementation for the method is executed.
````
class A {
  void ab() {
    System.out.println("B");
  }
}

class B extends A {
  void ab() {
    System.out.println("B");
  }
  public static void main(String args[]) {
    A a = new A();
    a.ab();
    B b = new B();
    b.ab();
  }
}
````
* In Overriding, overridden and overriding methods share same name, access modifiers as well as non-access modifiers, return type, no. of arguments and data types of arguments are same but the definition may be different.
* Java Virtual Machine is responsible for resolving the method call in case of method overriding.
````
class A {
  void ab() {
    System.out.println("A");
  }
}

class B extends A {
  void ab() {
    System.out.println("B");
  }
  public static void main(String args[]) {
    new B().ab();
  }
}
````




