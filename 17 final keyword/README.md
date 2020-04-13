# `final` Keyword
* `final` is a keyword.
* `final` is a non access modifier in Java.
* `final` can be:
  - variables
  - methods
  - classes
* constructors cannot be declare final because constructor is never inherited.
## Final Variables
* Final variable cannot be reassigned i.e. it can be assigned a value only once.
* It is equivalent to constant variable in C language.
````
// this program will not compile
// because we are trying to assign values to the final variable, i.e. x, more than once
class A {
  public static void main(String args[]) {
    final int x=10;
    x=20;
    x=30;
    System.out.println(x);
  }
}
````
* Default value is not assigned to a final variable.
* An Instance level final variable can be initialized in one way out of these 3 ways:
  - init block
  - constructor
  - declaration
* If we declare any parameter as final, you cannot change the value of it.
````
class Bike {
  int cube(final int n) {
    // compile time error 
    n=n+2;// can't execute this line of code as n is final
    return n*n*n;
  }
  
  public static void main(String args[]) {
    Bike b = new Bike();
    System.out.println(b.cube(5));
  }
}
````
* __Blank Final Variables__ are those final variables which are not initialized when declared. For e.g. `final int x;`. Such variables must be compulsorily initialized in init block or constructor.
````
class A {
  final int x;
  A() {
    x=10;
  }
}
````
* Values of final variables are stored in run-time constant pool.
* __Static Final Variables__ can be initialized at either of these 2 places:
  - At declaration
  - At static block
````
class A{  
  static final int data;//static blank final variable  
  static{ data=50;}  
  public static void main(String args[]){  
    System.out.println(A.data);  
 }  
}  
````

## Final Method
* Final method cannot be overridden.
* Using final keyword on method prevents overridding of that method.
* Final method is inherited but we cannot override it.
````
// this program will not compile
// because we are trying to override final method i.e. ab()
class A {
  final void ab() {
    System.out.println("A");
  }
}

class B extends A {
  //error will occur here
  void ab() {
    System.out.println("B");
  }
}
````
## Final Class
* Final class can't have subclass.
* using final keyword with class prevents inheritance i.e. final class cannot be inherited/extended.
* String class is also final.
````
// this code will not compile
// because class B is trying to inherit/extend final class A
final class A {
  int x=10;
}
// error will occur here
class B extends A {
  int y=20;
}
````
