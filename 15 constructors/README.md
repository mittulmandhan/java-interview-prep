# Constructors
* Constructors are a special, kind of, methods that are used to initialize the instance variables of the corresponding object in heap.
* The central player in object initialization is the constructor.
* Every class have, explicit or implicit, atleast one constructor.
* While instantiating an object with new keyword, you must specify a constructor.
  
  `new <class_name>(<argument_list>);`
* In Java jargon, constructors having no arguments are called no argument constructors.
  
  `new <class_name>();`
* In Java, __constructors are similar to methods, but they are not methods__. Like methods, constructors has a set of parameters and a body of code.
* Unlike typical methods, constructors do not have any return type neither you can return anything from constructor.
* In the source file, constructor looks like a method declaration in which the method has the same name as the class but has no return type.
* Constructors break the camelcase naming convention specified for methods in Java(i.e. method's name must be written in camelcame but first letter of first word must be in lowercase).
  Example:
  ````
  public class A {
    private int x;
    public A() {
      x=10;
    }
  }
  ````
* Although, it is legal to give a method the same name as class but one should not do so as it will cause ambiguity and developer may not be able to differentiate between constructor and method.
  - __for example:__
  ````
  public class A {
    int x;
    public A() {
    x=10;
    }
    public void A() {
      x=20;
    }
    
    public static void main(String[] args) {
      // here, A() will call class A's constructor
      A a=new A();// a=101
      System.out.println(x);// x=10
      // following statement i.e. 101.A() will call an instance method A() using object reference a of type A
      a.A();
      System.out.println(x);// x=20
    }
  }
  ````
  
* If you do not give any constructor in your class then compiler itself puts a __Default Constructor__ in your class. Default constructor takes no parameters and only has a `super()` invocation in the body.
  - __for example:__
  Before compilation
  ````
  public class A{
    private int x;
    
    public void add(int y) {
      x=x+y;
    }
  }
  ````
  After compilation
  ````
  public class A{
    private int x;
    
    public A() {
      super();
    }
    
    public void add(int y) {
      x=x+y;
    }
  }
  ````
* When we have explicitly declare one or more constructors in class then compiler do not create default constructor. In that case, compiler simply uses definition of constructors specified by us.
* Constructor can only be called specifically while creating an object of some type.
* Constructors are only called once in the life span of an object i.e. object is initialized.
* Constructor is not a member of class i.e. why it cannot be inherited in child class.
* Like methods, we can give access specifiers(public, private, default & protected) to constructors, but unlike methods, we cannot give non-access modifiers(such as final, static, abstract, etc) to constructors. It means that you can only specify how to access constructor, not the behaviour of constructors. Also, instead of determining the ability to invoke a method, the access level of a constructor determines the ability to create/instatntiate an object. By default, access modifier of constructor is same as class' access modifier. 
* As we know by default constructors have the same access level as the class and class cannot be private. Hence, constructors can be private only when user declares it as private.
## `this()` and `super()` in constructors
* <b>Every constructor's first task is to invoke another constructor</b>. If we include `this()` at first line constructor will invoke another constructor of same class otherwise it will call superclass constructor using explicit or implicit super() statement.
* From within a constructor, you can explicitly invoke another constructor of the same class by using the `this()` statement. We can do this, when we have mutiple overloading constructors, to form constructor chaining. `this()` comes at first line of the constructor.
* From within a constructor, super class' constructor is called explicitly/implicitly using `super()` statement in the very first line of the constructor.
* Note that <b>we cannot have both this() and super() in the same constructor</b>. We can only have one or the other otherwise none-that means compiler will implicitly call no-arg constructor of superclass using `super()` (this will only work if the direct superclass includes a no-arg constructor otherwise we will face a compile time error).
* `this()` does not changes the order/flow of initialization of objects i.e. top-down(parent to child) because constructor can only contain `this()` or `super()`. Hence, even if we are forming a chain using `this()` then that chain ends on some constructor that makes `super()` call so that the order still remains the same.
* Instance methods cannot be invoked while making call to another constructor using `this()` or `super()` because at that point method table's address is not assigned to vtable reference variable present inside object so this reference will not be able to find method table and instance method cannot be accessed. But if the method is static we will not face such problem because static methods do not need object reference to be invoked.
## Catching exceptions not allowed inside constructor
* One enforced rule in Java is that we cannot catch any exceptions thrown by the constructor, invoked with `this()` or `super()` statement.
* <h3>Reasons:</h3>
1. If you catch an exception from `super()` or `this()`, then the code looks like:
````
  // This code will not compile, because the super() invocation
  // does not come first in the constructor
  class A {
    public A() {
      try {
        super();
      }
      catch (Throwable e) {
      //..
      }
      //..
    }
    //..
  }
````

2. objects must be properly initialized before they are used.
    - Normally, when an instance initialization method or constructor completes abruptly by throwing an exception, initiallization of the object fails.
    - Which concludes that object creation fails, because in Java programs, objects must be properly initialized before they are used. Hence, the proper way to signal that an error occured during object initialization is by throwing an exception.
    - If we are able to catch an exception thrown by an some constructor we invoked with `this()` or `super()`, we can ignore the exception and complete object initialization normally. This results in an improperly or incompletely initialized object being returned by `new`.
    - Thats why catching exception from `this()` or `super()` statement is not allowed in Java.

## Constructor Overloading
* Just like we overload methods sharing same name but different numbers and types arguments/parameters, constructors can be overloaded as well.
* In case of overloaded constructors, a specific constructor is called on the basis of of set of arguments when new is executed.
* Sometimes there is a need of initializing an object in different ways.Thats the scenario when the concept of multiple definition of constructors comes into picture. And that is achieved using constructor overloading.
````
public class Box {
  int width, height, depth;
  
  // construtor to be used when all dimensions are specified
  Box(int w, int h, int d) {
    width=w;
    height=h;
    depth=d;
  }
  
  // constructor to be used when creating cubical box
  Box(int dimensions) {
    width=height=depth=dimensions;
  }
  
  // constructor to be used when no dimensions are specified
  Box() {
    width=height=depth=0;
  }
  
  // compute and return volume
  int volume() {
    return width*height*depth;
  }
  
  public static void main(String []args) {
    Box myBox=new Box(10, 20, 30);
    Box cube=new Box(10);
    Box emptyBox=new Box();
    
    // volume of the box whose dimensions are specified
    int vol=myBox.volume();
    System.out.println(" Volume of my box is " + vol);
    
    // volume of the box whose dimensions are specified
    vol=cube.volume();
    System.out.println(" Volume of cube is " + vol);
    
    // volume of the box whose dimensions are specified
    vol=emptyBox.volume();
    System.out.println(" Volume of empty box is " + vol);
  }
}
````
output:
````
 Volume of my box is 6000
 Volume of cube is 1000
 Volume of empty box is 0
````
* `this()` statement can be used during constructor overloading to call other constructor and reuse the code in it.
````
// In this program we are reusing the code written in the first constructor by using this() statements inside other constructors
public class Box {
  int width, height, depth;
  
  // construtor to be used when all dimensions are specified
  Box(int w, int h, int d) {
    width=w;
    height=h;
    depth=d;
  }
  
  // constructor to be used when creating cubical box
  Box(int dimensions) {
    this(dimensions, dimensions, dimensions);
  }
  
  // constructor to be used when no dimensions are specified
  Box() {
    this(0, 0, 0);
  }
  
  // compute and return volume
  int volume() {
    return width*height*depth;
  }
  
  public static void main(String []args) {
    Box myBox=new Box(10, 20, 30);
    Box cube=new Box(10);
    Box emptyBox=new Box();
    
    // volume of the box whose dimensions are specified
    int vol=myBox.volume();
    System.out.println(" Volume of my box is " + vol);
    
    // volume of the box whose dimensions are specified
    vol=cube.volume();
    System.out.println(" Volume of cube is " + vol);
    
    // volume of the box whose dimensions are specified
    vol=emptyBox.volume();
    System.out.println(" Volume of empty box is " + vol);
  }
}
````
output:
````
 Volume of my box is 6000
 Volume of cube is 1000
 Volume of empty box is 0
````
* __Important points to be taken care of when doing constructor overloading:__
  - Constructor calling must be the first statement of constructor in Java.
  - If we have defined one or more explicit constructor then default constructor is not created by the compiler.
  - Recursive constructor calling is not valid in Java since it will create a never ending cycle of recursive calls of the same constructor and superclass constructor will never be called. In such case, we will face an error at compile time with error message 'Recursive constructor invocation Box(int)'.
````
public class Box {
  int width, height, depth;
  
  // construtor to be used when all dimensions are specified
  Box(int w, int h, int d) {
    width=w;
    height=h;
    depth=d;
  }
  
  // constructor to be used when creating cubical box
  Box(int dimensions) {
    // Here the constructor is calling itself
    // this statement will lead to a inifinite recursion
    this(dimensions);
  }
  
  // constructor to be used when no dimensions are specified
  Box() {
    this(0, 0, 0);
  }
  
  // compute and return volume
  int volume() {
    return width*height*depth;
  }
  
  public static void main(String []args) {
    Box myBox=new Box(10, 20, 30);
    Box cube=new Box(10);
    Box emptyBox=new Box();
    
    // volume of the box whose dimensions are specified
    int vol=myBox.volume();
    System.out.println(" Volume of my box is " + vol);
    
    // volume of the box whose dimensions are specified
    vol=cube.volume();
    System.out.println(" Volume of cube is " + vol);
    
    // volume of the box whose dimensions are specified
    vol=emptyBox.volume();
    System.out.println(" Volume of empty box is " + vol);
  }
}
````














