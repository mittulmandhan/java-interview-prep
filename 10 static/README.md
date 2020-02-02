# Static Keyword
* 'static' is a keyword in Java.
* 'static' is a non-access modifier which is applicable for class members i.e.
  1. blocks
  2. variables
  3. methods
  4. nested classes
* To create a static member, precede its declaration with the keyword static.
* When a member is declared static, it can be accessed before any object creation of its class, and without using any object reference.
* Basically, declaring a member as static gives it a class level scope i.e. member becomes object independent.
* There are 3 ways to call static members:
  1. By name
  2. By class name
  3. By object reference
* In same class, we can access static members by name, by class name, and by object reference. But in other classes, static members can be accessed only through class name and object reference.
* No matter what way you choose to call a static member ultimately compiler, behind the scene, keep the call of static members by class name only which means if you even make a call by name or by object reference it will be changed to 'by class name' call by compiler during compilation.
* In the given code example, line: 7 does not show NullPointerException because `obj.y` was replaced by `A.y`. So exception will be shown @line: 8 where null pointer obj is used.
````
// Program that shows compiler changes the code
1  class A {
2    int x=10;
3    static int y=20;
4   
5    public static void main() {
6      A obj=null;
7      System.out.println(obj.y);// A.y i.e. 20
8      System.out.println(obj.x);// NullPointerException
9    }
10 }
````
### Static variables
* When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level.Static variables are, essentially, global variables.
* static variables are declared and initialized just after method table completion.
* Static variables are stored in class block(as we know class block stores class level data) inside method area just like method table and class bytecode.
* Default values of a static variable is same as an instance variable.
* Local variables cannot be declared static because static variables are suppossed to be used at class level but local variables cannot be accessed outside function. I you declare a local variable.
* In the following example, we will get a compilation error since we are trying to declare a static variable at local scope. So, we will get an error message 'illegal start of expression' @line: 3
````
1 class A {
2 	void ab() {
3 		static int x=10;// illegal start of expression
4 	}
5  
6 	public static void main(String[] args) {
7 		System.out.println(x);
8 	}
9 };
````

### Static blocks
* If you need to do the computation or logic in order to initialize your static variables, you can declare a static block that gets executed exactly once.
* static blocks are execuuted exactly once just after the initialization of static variables i.e. before program execution starts.
* It is automatically executed by JVM at run-time, you can not call it.
* Following is an example of a use case of static block:
````
class A {
  static int x=10;// x=10
  static int y;// y=0
  
  static {
    System.out.println("In static block");
    y = x*8;// y=10*8 i.e. y=80
  }
  
  public static void main(String[] args) {
    System.out.println("In main()");
    System.out.println("x = "+x);
    System.out.println("y = "+y);
  }
};
````
__output:__
````
In static block
In main()
x = 10
y = 80
````

### Static methods
* When a method is declared with static keyword, it is known as static method.
* The most common example of a static method is main( ) method.
* The only difference between a non-static method and a static method is that you cannot access a non-static method without any object reference but static method can be accessed even if no object exists in heap.
* This is the reason why main method is declared as static, JVM search the main method in method table to execute the program i.e. the state when no object is created in heap so this is the only way we can make main method available for JVM for smooth execution.
* 
````
class A {
  static void ab() {
    System.out.println("In ab()");
  }
  
  public static void main(String[] args) {
  System.out.println("In main()");
  ab();
  }
}
````
__output:__
````
In main()
In ab()
````

### Static class(nested class only)
* A class can be made static only if it is a nested class i.e. called nested static class.
* Static nested class can be accessed by outer class name only.
    `Outer.Inner obj = new Outer.Inner();`
* It can only access static members of outer class including private members.
* Static nested class cannot access non-static (instance) data member or method of outer class.
* We don't need to create the object of Outer class to use nested static class because static properties, methods or classes can be accessed without using object references.
* Example:
````

````
