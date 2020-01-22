# Heap

* In general, Heap means a collection of objects placed unorderly/disorderly on top of each other.
* Whenever Java virtual machine(JVM) start-up it occupies some memory space in RAM essential for program execution.This memory space consists of stack, heap, method area, program counter registers and native internal threads.
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/Heap/JVM%20Architecture.PNG)
* Heap is reclaimed by an automatic storage management system known as a garbage collector.
* In Java, heap is used to create,store & manage objects and object contains instance variables of the class.
* 'new' keyword is used to create an object in heap.
* Reference to these objects can be stored in a reference variables.
* Reference variable can either store a reference of same type of object or null.
* A reference has a default value null. So that if that you use a reference variable without initializing it with an object reference your program will show a run time exception (called null pointer exception) and your program will terminate.
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

x          |y
---------- |---------
~~0~~ 10   |~~0~~ 20


**output**
````
x = 10
y = 20
````
