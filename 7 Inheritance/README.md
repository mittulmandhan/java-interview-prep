# Inheritance

* Inheritance Means Reusability.
* It establishes IS-A retaltionship between the parent class and the child class.
* The class whose features are inherited is known as super class(or a base class or a parent class).
* The class that inherits the other class is known as sub class(or a derived class, extended class, or child class).
* Inheritance is implemented using 'extends' keyword.
* 'extends' keyword allows child class to reuse the existing code of parent class i.e. sub class can its own data members and member fuctions in addition to the parent class' data members and member fuctions.
* There are 3 types of inheritance:
  * Single Inheritance
  * Multi-level Inheritance
  * Multiple Inheritance
* Java does not support multiple inheritance because it causes diamond problem.
* The “diamond problem” is an ambiguity that can arise as a consequence of allowing multiple inheritance. It is a serious problem for languages (like C++) that allow for multiple inheritance of state. In Java, multiple inheritance is not allowed for classes.
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/Inheritance/diamond%20problem.png)
* To support multiple inheritance you cna use interfaces in Java.
