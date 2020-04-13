# `final` Keyword
* `final` is a keyword.
* `final` is a non access modifier in Java.
* `final` can be:
  - variables
  - methods
  - classes
## Final Variables
* Final variable cannot be reassigned i.e. it can be assigned a value only once.
* It is equivalent to constant variable in C language.
````
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
class A {
  final int x,
}
````
