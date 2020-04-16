# Singleton Design Pattern
* Singleton is a type under Creational Design Pattern.
* In this Design Pattern, only one instance of a particular class is created and shared among all. This class provides a way to access its only object which can be accessed directly by some other class.
* Steps to create a singleton class in Java:
  <br>__Step 1:__ Make a class with private constructor
     <br>(so that it cannot be initialized by any other class)
  <br>__Step 2:__ Create a private static reference variable of own type i.e. the singleton object reference variable.
     <br>(this is the only object of the singleton class, it cannot be accessed outside class and also it is created and initialized by the static block)
  <br>__Step 3:__ Create a static block and initialize the singleton object reference variable with a singleton object
  <br>__Step 4:__ Create a public static getter method for the singleton object reference variable
     <br>(this method can be called using class name and it makes the singleton object accessible for classes outside package as well)
  <br>__Note:__ If we do not declare this method static then the class will be useless as singleton object cannot be accessed whatsoever.

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
  public static Student getStudent() {
    return s;
  }
}
````

__Resources:__
* https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm





