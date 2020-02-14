# `this` Keyword
* `this` is a keyword.
* Within an instance method or a constructor, `this` is a reference to the current object/instance i.e. the object whose method or constructor is being called.
* You can refer to any instance member of the current object from within an instance method or a constructor by using `this` keyword.
* `this` is a reference variable passed as a hidden argument in an instance method or constructor.
* when method is instance level, 0th index of Local Variables Array(LVA) in Stack Frame is reserved for `this` final reference variable which is of type of current class and stores the reference of current object.
* `this` cannot be used to call class level members.
* `this` is final, thus value of `this` cannot be overridden.
* The most common use of `this` keyword is to prevent the confusion among the class/instance variables and parameters/local variables having same name because a class/instance variable is shadowed by a parameter/local variable of a method.Such scenario is known as shadow concept.
````
class A {
  int x;
  int y;
  
  A(int x, int y) {
    x=x;
    y=y;
  }
  
  display() {
    System.out.println("x = "+this.x+"\ny = "+this.y);
  }
  
  public static void main(String[] args) {
    A obj=new A(10, 20);
    obj.display();
  }
};
````
output:
````
x = 0
y = 0
````
In above program, names of instance variables are same as local variables. Here instance level variable is shadowed by a local variables. So, we will use this keyword to distinguish between instance and local variables.
````
class A {
  int x;
  int y;
  
  A(int x, int y) {
    this.x=x;
    this.y=y;
  }
  
  void display() {
    System.out.println("x = "+this.x+"\ny = "+this.y);
  }
  
  public static void main(String[] args) {
    A obj=new A(10, 20);
    obj.display();
  }
};
````
output:
````
x = 10
y = 20
````
* Following are the ways to use `this` keyword in Java: 
  1. To refer current class' instance variable.
  2. To invoke current class' method(implicitly).
  3. To invoke current class' constructor.
  4. Can be passed as an argument in the method call.
  5. Can be passed as an argument in the constructor call.
  6. Can be used to return the current class instance from the method.
  
### 1. To refer current class' instance variable.
* The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
* If local variables(formal arguments) and instance variables are different, there is no need to use this keyword.
````
class A {
  int x=10;
  int y=20;
  
  void display(int x, int y) {
    System.out.println("local x = "+x+"\nlocal y = "+y);
    System.out.println("instance x = "+this.x+"\ninstance y = "+this.y);
  }
  
  public static void main(String[] args) {
    A obj=new A();
    obj.display(100, 200);
  }
}
````
output:
````
local x = 100
local y = 200
instance x = 10
instance y = 20
````
### 2. To invoke current class' method(implicitly).
* We may invoke an instance method using `this` although, if we don't, compiler will automatically add `this` keyword while invoking that instance method.
````
class A {
  void my() {
  System.out.println("In my()");
  this.fun();
  }
  
  void fun() {
    System.out.println("In fun()");
  }
  public static void main(String[] args) {
    A obj=new A();
    obj.my();
  }
};
````
output:
````
In my()
In fun()
````

### 3. To invoke current class' constructor.
* Current class' constructor can be called using `this()` statement.
* It is used to reuse ta constructor definition/code.
* `this()` constructor call should be used, to reuse some other constructor, within the constructor.
* It maintains the chain between the constructors thus it is known as the constructor chaining.
````
class Rectangle {
  int x, y;
  int width, height;
  
  Rectangle() {
    this(0,0,1,1);
  }
  
  Rectangle(int width,int height) {
    this(0,0,width,height);
  }
  
  Rectangle(int x,int y,int width,int height) {
    this.x=x;
    this.y=y;
    this.width=width;
    this.height=height;
  }
  
  void display() {
    System.out.println(x+" "+y+" "+width+" "+height);
  }
  
  public static void main(String[] args) {
    Rectangle rect1=new Rectangle();
    Rectangle rect2=new Rectangle(10,20);
    Rectangle rect3=new Rectangle(3,4,10,20);
    rect1.display();
    rect2.display();
    rect3.display();
  }
  
}
````
output: 
````
0 0 1 1
0 0 10 20
3 4 10 20
````
* `this()` constructor call statement must be the first statement in the constructor or it will show a compile time error i.e. Unresolved compilation problem: Constructor call must be the first statement in a constructor.

### 4. Can be passed as an argument in the method call.
* It is used to reuse an object in many methods.
* In this case also if we don't use this keyword compiler will add it.
* Application of passing this as an argument in the method call may be:
  1. In event handling
  2. In a situation where we have to provide reference of one class to the other one.
````
class A {

  void call() {
    System.out.println("In call()");
    this.my(this);
  }

  void my(A a) {
    System.out.println("In my()");
  }
  
  public static void main(String[] args) {
    A a=new A();
    a.call();
  }
}
````
output:
````
In call()
In may()
````

### 5. Can be passed as an argument in the constructor call.
* `this` keyword can be passed as an argument in the constructor also.
* It is useful when we want to use one object of a class in multiple classes.
````
class A {
  B obj;
  
  // Parameterized constructor with object of B as a parameter
  A(B obj) {
    this.obj=obj;
    
    // calling display method of B
    obj.display();
  }
}

class B {

  int x=10;

  B() {
    A a=new A(this);
  }
  
  void display() {
    System.out.println("Value of x in Class B : " + x);
  }
  
  public static void main(String[] args) {
    B b=new B();
  }
}
````
output:
````
Value of x in Class B : 10
````

### 6. Can be used to return the current class instance from the method.
* We can also return this from the method.
* In such case, return type of the method must be same as `this` or you can say current object.
````
class A {
  void get() {
    System.out.println("In get()");
    return this;
  }
  
  void my() {
    System.out.println("In my()");
  }
  
  public static void main(String[] args) { 
    new A().get().my(); 
  }
}
````
output:
````
In get()
In my()
````

### Proving this keyword
* let's prove that `this` keyword returns the current class' current object referrence.
````
class A {
  void my() {
    System.out.println(this);
  }
  
  public static void main(String args[]) {
    A obj=new A();
    System.out.println(obj);
    obj.my();
  }
}
````

### Resources
* https://www.javatpoint.com/this-keyword
* https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
* https://www.geeksforgeeks.org/this-reference-in-java/
* https://www.w3schools.com/java/ref_keyword_this.asp
* https://www.artima.com/insidejvm/ed2/jvm8.html

### Some extra questions
__1. Can 'this' keyword be used, outside method but inside class, to access instance variable?__<br>
 NO.
<br>
__2. Can instance method be called by class name?__<br>
 No. It will show a compile error messgae "Unresolved compilation problem: Cannot make a static reference to the non-static method my() from the type A".
<br>
__3. Can we call a constructor from inside a method using this()?__<br>
 No. 'this()' can only be used within a constructor as a first statement.No method can use 'this()'. It will show a compilation error message "Unresolved compilation problem: Constructor call must be the first statement in a constructor".
<br>
__4. can a static method have a variable having the same name as an instance/class level variable?__<br>
 Yes. But in that case static method can only access the local variable(by name) and the static variable(by class name). It cannot access access the instance variable using 'this' because static methods do not have 'this' current object reference.
<br>
__5. Can a constructor have multiple this() statement?__<br>
 No. Having more than one this() statement in a constructor will shaow a compile time error message "Unresolved compilation problem: Constructor call must be the first statement in a constructor"
