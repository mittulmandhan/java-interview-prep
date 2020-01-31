# Method Area
* Method Area is one of the memory areas JVM aquires in RAM when it get start-up.
* method area is logically a part of the heap which is not considered for garbage collection.
* It could be of fixed size or vary. Its memory may not be contiguous. JVM implementation can give control to programmer over Method area creation, its sizing etc.
* If method area memory is not sufficient to satisfy an allocation request then JVM throws OutOfMemoryError.
* Method area consists of per-class structure such as:
  1. run-time constant pool
  2. class blocks
  3. special methods used in class, instance and interface initialization
* class blocks are logically distributed memory blocks for class level data.
* Class blocks contain class level data such as static variables, method table and bytecode of their respective classes.
* A class is loaded in method area by class loader, i.e. a component of JVM, in class blocks.
* Object class gets loaded first of all in the method area.
* There are 4 ways to load a class in method area:
  1. Run the class. 
    - For e.g.: `java A`
  2. Create an object of that class in heap. 
    - For e.g.: `new A();`
  3. Declare a reference variable of that class. 
    - For e.g.: `A a;`
  4. Using forName() method of class Class. 
    - For e.g.: `Class cls=Class.forName("A");`
* Method table is a table where details of methods associated to a class is stored.It has 3 column i.e. serial number, method name and reference to the bytecode of the method stored inside class block(used when we call the method).
* Method table has two parts one is used to store non-static method whereas the other one to store static methods.
* Reference of the method table of a class is stored in the object(see heap notes to understand this).
* __For e.g.:__ when we run the following class using `java A` command method jvm aquires method area and loads class bytecode in method area using class loader at runtime and creates a method table for that class and stores all the methods associated with it. We will assume reference of Method table is 105.
````
class A{
  int x=10;
  
  void ab() {
    System.out.println("in ab()");
  }
  
  void my() {
    System.out.println("in my()");
  }
  
  public static void main(String []args) {
    A a=new A();
    a.ab();
    a.my();
  }
};
````
__Method Table__
<details>
  <summary>Non-static</summary>
  <p>
    <table>
      <tr>
        <th>S.No.</th>
        <th>Name</th>
        <th>Bytecode Reference</th>
      </tr>
      <tr>
        <td>1</td>
        <td>ab()</td>
        <td>*</td>
      </tr>
      <tr>
        <td>2</td>
        <td>my()</td>
        <td>*</td>
      </tr>
    </table>
  </p>
</details>

<details>
  <summary>Static</summary>
  <p>
    <table>
      <tr>
        <th>S.No.</th>
        <th>Name</th>
        <th>Bytecode Reference</th>
      </tr>
      <tr>
        <td>1</td>
        <td>main()</td>
        <td>*</td>
      </tr>
    </table>
  </p>
</details>

__Object__
    <table>
      <tr>
        <th>Part I</th>
        <th>Part II</th>
      </tr>
      <tr>
        <th>x</th>
        <th>Method Table Reference</th>
      </tr>
      <tr>
        <td><strike>0</strike> 10</td>
        <th>105</th>
      </tr>
    </table>
    
* If we create an object of a class, i.e. not loaded in method area, then the class is loaded in method area before creating the object.
## Method area in inheritance ##
* The correct sequence of action in JVM memory space inside RAM:
  1. Method Area Occupied by JVM
  2. Class bytecode loading process starts
  3. Parent class is loaded in method area
  4. Method Table created
  5. Static variables memory allocation and initialization
  6. class loading process completed
  7. Object creation and instance level variable loading & initializing
* If current class is inheriting some other class, then just after starting the loading process of current class,(first of all) parent class is loaded, and then we proceed further to complete the loading process of current class in method area.
* Every class has its own method table, in which all of its parent class methods' as well as its own methods' details are stored.
* And as we know, every class by default inherits java.lang.Object class which means every class atleast have details of methods that belongs to Object class, in its method table.Hence, every class have access to toString(), hashCode(), equals(), finalize(), getClass(), wait(), notify(), notifyAll() and clone() method.
* Method table first loads the methods of parent class and then the methods of current class are loaded.
* Ultimate parent class'(Object class) gets loaded first of all in the method area, its methods get loaded in method table first and then others classes come.

````
class A /* extends java.lang.Object */{
  void ab() {
    System.out.println("in ab()");
  }
  
  static void fun() {
    System.out.println("in fun()");
  }
};

class B extends A {
  void my() {
    System.out.println("in my()");
  }
  
  main() {
    B b=new B();
    b.ab();
  }
};
````
* In the above example, If we use `java B` command:
  1. JVM will aquire memory spaces in RAM
  2. class B starts loading and bytecode loaded in method area
  3. JVM identifies B IS-A A
  4. class A starts loading and bytecode loaded in method area
  5. JVM identifies A IS-A Object
  6. Object class starts loading and bytecode loaded in method area
  7. Method table reated and all the methods of Object class feeded in method table
  8. static variables of Object allocated space and gets initialized
  9. Object class loading complete
  10. methods of class A feeded in method table
  11. static variables of A allocated space and gets initialized
  12. class A loading complete
  13. all the methods of B feeded in method table
  14. static variables of B allocated space and gets initialized
  15. class B loading complete
  
__Method Table__
<details>
  <summary>Non-static</summary>
  <p>
    <table>
      <tr>
        <th>S.No.</th>
        <th>Name</th>
        <th>Bytecode Reference</th>
      </tr>
      <tr>
        <td>1</td>
        <td>getClass()</td>
        <td>*</td>
      </tr>
      <tr>
        <td>2</td>
        <td>toString()</td>
        <td>*</td>
      </tr>
      <tr>
        <td>3</td>
        <td>hashCode()</td>
        <td>*</td>
      </tr>
      <tr>
        <td>4</td>
        <td>equals()</td>
        <td>*</td>
      </tr>
      <tr>
        <td>...</td>
        <td>...</td>
        <td>...</td>
      </tr>
      <tr>
        <td>12</td>
        <td>ab()</td>
        <td>*</td>
      </tr>
      <tr>
        <td>13</td>
        <td>my()</td>
        <td>*</td>
      </tr>
    </table>
  </p>
</details>
<details>
  <summary>Static</summary>
  <p>
    <table>
      <tr>
        <th>S.No.</th>
        <th>Name</th>
        <th>Bytecode Reference</th>
      </tr>
      <tr>
        <td>1</td>
        <td>main()</td>
        <td>*</td>
      </tr>
    </table>
  </p>
</details>

* If you override a method then only the bytecode reference of the method gets overwritten in the method table(other details remain same in the method
table). Thus, when you call that method child class definition of the method is executed.
