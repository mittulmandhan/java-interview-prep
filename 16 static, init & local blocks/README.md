# Static Block
* For static block notes [click here](https://github.com/mittulmandhan/java-interview-prep/tree/master/10%20static)

# Init Block
* Init block is also known as Instance Initializer or Instance Initialization Block.
* structure of init block:
````
{
  // your code
}
````
* It is declared inside class outside method.
* A class can contain one or more init blocks.
* Every class have atleast one init block. If programmer does not make an init block then compiler creates a default init block.
* Init blocks are executed in the same sequence they are declared.
* One init block calls other init block of the same class.
* We can not call an init block by our choice, they are called automatically.
* It is called at the time of class loading.
* compiler calls the init block as <init>.
* default constructor have following structure:
````
A() {
  super()<init>;
  // your code
}
````
* <init> block is called just after super() call.
* Constructor is loaded just before <init> in stack but <init> block is executed before constructor.
* Init block depends on object.
* Init block is not a member of class.
* Instance initializers are useful when:
  1.) initializer code must catch exceptions
  2.) perform fancy calculations that can not be expressed with an instance variable initializer.
* You could of course write such code in constructors but in a class that contains multiple constructors you will have to repetitively write that code in each constructor. With an instance initializer you can write code once and it will be executed everytime no matter which constructor is called to instantiate the object.
* flow of execution of init blocks in case of inheritance is top to bottom i.e. parent to child.
### Initializers can't make forward references
* When you write an initializer(either an instance initializer or an instance variable initializer), you must be sure not to refer to any variable which is textually declared after the variable being initialized.
* In simple words, you can not make forward references from an initializer.
````
class A {
  // this is called forward referencing
  int x=8*y;
  int y=10;
}
````
* This is a forced rule in java and if you disobey this rule compiler will show an error message "cannot reference a field before it is defined".
* When an object is created, initializers are called in the same sequence they appear in the source code. This rule helps to ensure that no variable is refered or used before its proper initialization.
* Although initializer can refer or use the variables which are textually declared before the variable being initialized.In that case, compiler will be Happy:)
````
class A {
  int x=10;
  // this is backward referencing and this is all good
  int y=2*x;
}
````
### Getting around the forward reference rule
* You can purposefully circumvent compiler's preventive restrictions for forward reference rule using a method to initialize the variable.
````
class A {
  int x=my();
  int y=10;
  
  void my() {
    return 8*y;
  }
}
````

# Local Block
* Syntax of local block is same as init block but it is different from init block in some aspects and similar in some as well.
* It is inside method.
* One method can contain one or more local blocks.
* They are executed in the same sequence they are declared/defined.
* compiler does not provide any block by default.
* local blocks offer flexibility and security.
````
class A {
  public static void main(String arsg[]) {
    System.out.println("in main");
    
    {
      System.out.println("in local block");
    }
    
    System.out.println("End of main()");
  }
}
````
### local blocks can access class, instance and local level variables
* Local block is used when multiple independent logics are to be performed in main method. So, we separate them by making local blocks. This arrangement, gives flexibility and security.
````
class A {
  public static void main(String args[]) {
    int x=10;
    
    // local block
    {
      int y=20;
      System.out.println(x);
      System.out.println(x);
    }
    
    // can't access y as y is declaredinside local block
    // so cannot be accessed outside local blocks
    System.out.println(y);
    
    System.out.println("end of main");
  }
}
````  
