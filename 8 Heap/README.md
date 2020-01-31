# Heap

* In general, Heap means a collection of objects placed unorderly/disorderly on top of each other.
* Whenever Java virtual machine(JVM) start-up it occupies some memory space in RAM essential for program execution.This memory space consists of stack, heap, method area, program counter registers and native internal threads.
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/Heap/JVM%20Architecture.PNG)
* Heap is reclaimed by an automatic storage management system known as a garbage collector.
* Garbage Collection is a process which removes dead objects from Java Heap space and returns memory back to Heap in Java.
* In Java, heap is used to create,store & manage objects and object contains instance variables of the class.
* 'new' keyword is used to create an object in heap at runtime and it requires a single, postfix argument to call the constructor.
* 'new' keyword only allocates memory for the object in heap at runtime and invokes the given object constructor(rest of the construction tasks are done by constructor).
* Reference to these objects can be stored in a reference variables.
* Everytime an object is created address is saved in hash table with a randomly generated Id.
* An object is a memory space allocated in heap for a particular instance of class.
* Object is divided into two logical parts. One loads the instance variable of that class and the other stores the reference of the method table(exists in method area) of that class.
* default value of a reference variable is null.
* Reference variable can either store a reference of same type of object or null.
* If a reference variable is storing null and your program tries to use it then you will encounter a run time error called NullPointerException and your program will terminate.
* If you use a reference variable without initializing it with an object reference your program will show a compile  time error.
* Variables inside object(i.e. instance variables) are initialized using constructors.
* JVM loads the object and assigns the default values to the instance variables and then the actual value is assigned.
* Heap has a default size of 65mb.

**code**
````
class A {
    int x=10;// 101.x=10
    int y=20;// 101.y=20
    //default constructor call
    
    public static void main(string args[]) {
        //object creation, constructor calling.
        A a=new A();//a=101
        System.out.println("x = "+a.x);// print 101.x
        System.out.println("y = "+a.y);// print 101.y
    }
};
````

<details>
    <summary>object details</summary>
    <p>object name: a</p>
    <p>object type: class A</p>
    <p>object address: 101(lets say)</p>
</details>

<table>
    <tr>
        <th colspan="2">Part I</th>
        <th>Part II</th>
    </tr>
    <tr>
        <th>x</th>
        <th>y</th>
        <th>Method Table Reference</th>
    </tr>
    <tr>
        <td><strike>0</strike> 10</td>
        <<td><strike>0</strike> 20</td>
        <th>*</th>
    </tr>
</table>


**output**
````
x = 10
y = 20
````

* When an instance level reference variable is declared and initialized with an object reference the problem of stackoverflow and out of heap space error occurs whenever we try to make object of that class.
* These errors are explained in code as well but we will learn them in depth when we will learn about exceptions in future.
