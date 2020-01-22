# Heap

* Heap means a collection of objects placed unorderly/disorderly on top of each other(in general).
* Whenever Java virtual machine(JVM) start-up it occupies some memory space in RAM essential for program execution.This memory space consists of stack, heap, method area, program counter registers and native internal threads.
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/Heap/JVM%20Architecture.PNG)
* Heap is reclaimed by an automatic storage management system known as a garbage collector.
* In Java, heap is used to create,store & manage objects and object contains instance variables of the class.
* 'new' keyword is used to create an object in heap.
* Reference to these objects can be stored ina reference variables.
* Variables inside object(i.e. instance variables) are initialized using constructors.
* JVM loads the object and assigns the default values to the instance variables and then the actual value is assigned.
* Heap has a default size of 65mb.

**code**
````
class A {
    int x=10;// 101.x=10
    //default constructor call
    
    public static void main(string args[]) {
        //object creation, constructor calling.
        A a=new A();//a=101
        System.out.println("x = "+a.x);// print 101.x
    }
};
````

> **object name:** a
>> **object type:** class A
>>> **object address:** 101(lets say)
x        | .
---------| -
~~0~~ 10 | .

**output**
````
x = 10
````
