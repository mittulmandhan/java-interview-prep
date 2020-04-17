# `abstract` Keyword
* `abstract` is a keyword.
* `abstract` is a non-access modifier i.e. it changes the behaviour of the resource.
* classes and methods can be abstract.
* `abstract` resources cannot be `final`.

## `abstract` Class
* An abstract class cannot be instantiated.
````
// class B is abstract so it cannot be instantiated

public class A {
  public static void main(String[] args) {
    // not valid
    new B();// compile time error
  }
}
````
````
abstract class B { }
````
* But reference variable of abstract class can be created.
````
// making a reference variable of abstract class B is valid

public class A {
  public static void main(String[] args) {
    // valid
    B b=null;
  }
}
````
````
abstract class B { }
````
* Abstract class contains contains cunstructors like normal classes.
* An abstract class can contain abstract methods as well as normal methods(or you can say non-abstract methods).
* example:
````
abstract class A {
  void ab() {
    System.out.println("ab()");
  }
}
````
````
// members of an abstract class can be indirectly called through child class

class B extends A {
  public static void main(String[] args) {
    new B().ab();
  }
}
````
__output:__
````
ab()
````

### Need of Abstract Class
````
public class Mobile {
  public int getPrice() {
    return 1000;
  }
}
````
````
public class Camera {
  public int get() {
    return 5000;
  }
}
````
````
public class TV {
  public int price() {
    return 10000;
  }
}
````
In all these classes, we have different methods having different names to get price of different items.
<br>So, to remove this problem we will declare an abstract class and force A,B & C to override the abstract method in it.
````
abstract class Price {
  abstract public int getPrice();
}
````
Now, we have getPrice() method to get price of all the classes/items.
<br>We can get price by overloading showPrice() method in PriceUtility class.
````
class PriceUtility {
  public showPrice(Mobile m) {
    System.out.println(m.getPrice());
  }
  
  public showPrice(Camera c) {
    System.out.println(c.getPrice());
  }
  
  public showPrice(TV tv) {
    System.out.println(tv.getPrice());
  }
}
````
This approach is flexible because we just need to overload showPrice method in PriceUtility class to get the price of a class/item like this -
````
void showPrice(<class_name> <object_name>) {
  System.out.println(<object_name>.getPrice());
}
````
No meaningless method names are created.
<br>
## `abstract` Method
* Abstract method doesn't have body.
* Abstract method can only be declared in abstract class.
````
// this code will not compile
// since abstract method ab() is declared in non-abstract class A
class A {
  abstract void ab();
}
````
````
// this code will successfully compile
// since abstract method is declared in abstract class A

abstract class A {
  abstract void ab();
}
````
* Non-abstract child class is obliged to override and implement abstract methods of its abstract parent/ancestor classes.
__error example:__
````
abstract class A {
  abstract void ab();
}
````
````
// this code will give error since B did not overrided  ab() method
class B extends A { }
````
__error overcome example:__
````
abstract class A {
  abstract void ab();
}
````
````
// Since B is also abstract.
// so, B can also hold abstract method
// now object of B can't be created too.
// class which will inherit class A or B has to override abstract methods.

abstract class B extends A { 
}
````

### Examples
* eg 1:
````
abstract class A {
  abstract void ab();
}
````
````
// now that B is inheriting A
// so child B has to override all the abstract methods of abstract super class A
// here B will give body or implementation of ab() method

class B extends A {
  void ab() {
    System.out.println("ab()");
  }
  
  public static void main(String[] args) {
    new B().ab();
  }
}
````
__output:__
````
ab()
````
* eg 2:
````
abstract class A {
  abstract void ab();
}
````
````
// now that B is inheriting A
// so child B has to override all the abstract methods of abstract super class A
// here B will give body or implementation of ab() method

class B extends A {
  void ab() {
    System.out.println("ab()");
  }
  
  public static void main(String[] args) {
    // there is a parent to child relationship between A & B
    // we cant create object of abstract class A
    // but we can make a reference variable of abstract class A
    // and store a reference of its child class B's object in it
    A a = new B();
    
    // At compile time, compiler have set calling of ab() method of class A
    // because compiler works on reference variables & here ab() is called using reference variable of type A
    // But at runtime ab() method of class B will be called
    // because object is of class B & jvm will search ab() in method method table of class B
    // where ab() method's bytecode reference, which is pointing to ab() method in class A, is overwritten by class B's bytecode reference for ab() method
    // so ultimately ab() method of class B will be called
    a.ab();
  }
}
````
__output:__
````
ab()
````
* eg 3:
````
abstract class A {
  abstract void ab();
}
````
````
abstract class B extends A { 
  abstract void my();
}
````
````
class C extends B {
  @override
  void ab() {
    System.out.println("ab()");
  }
  
  @override
  void my() {
    System.out.println("my()");
  }
  
  public static void main(String[] args) {
    // a can only call ab() method
    A a = new C();
    a.ab();
    // b can call both ab() & my()
    B b = new C();
    b.ab();
    b.my();
  }
}
````
__output:__
````
ab()
ab()
my()
````

* eg 4:
````
abstract class A {
  abstract void ab();
}
````
````
abstract class B extends A { 
  abstract void my();
}
````
````
// when an abstract method extends another abstract class then chikd class have option
// it can override no abstract method or some abstract methods or all the abstract methods
abstract class C extends B {
  @override
  void ab() {
    System.out.println("ab()");
  }
}
````
````
// Note:  child class D can also re-override the methods which are overriden in its super class

class D extends C {
  @override
  void my() {
    System.out.println("my()");
  }
  
  public static void main(String[] args) {
    A a = new D();
    a.ab();
    a.my();
  }
}
````
__output:__
````
ab()
my()
````
* eg 5:
````
abstract class A {
  abstract void ab();
}
````
````
// class B have overridden ab() of class A
// Now, only one ab() method is present in the method table of class B i.e. class B's ab() method
abstract class B extends A {
  abstract void ab();
}
````
* eg 6(samjh ni aya):
````
abstract class A {
  abstract void ab();
}
````
````
// code will give compile time error
abstract class B extends A {
  abstract void ab();
}
````
* eg 7:
````
public abstract class A {
  public abstract String toString();
}
````
````
abstract class B extends A{
  public abstract String toString(int x);
}
````
````
// Here, in method table of class C toString() and toString(int) are overloaded 
// i.e. two separate rows exist for toString() and toString(int) methods(RE-ENTRY in method table)
// Not overridden(REPLACING in method table)
// So, C will have 2 abstract methods to override

class C extends B {
  @override
  public String toString(int x) {
    return null;
  }
  
  @override
  public String toString() {
    return null;
  }
}
````
* eg 8:
````
abstract class A {
  abstract void ab();
  {// this is an init block
    System.out.println("in ab");
  }
}
````
````
class B extends A {
  void ab() {
    System.out.println("B");
  }
  
  public static void main(String[] args) {
    new B().ab();
  }
}
````
__output:__
````
in ab
B
````




