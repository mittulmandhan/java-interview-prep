# Java Virtual Machine(JVM) Stack

* Stack is a linear data-structure which follows a LIFO(Last In First Out) order in which the operations are performed.
* A Java Virtual Machine stack is analogous/similar to the stack of a conventional language such as C i.e. it holds local variables & partial results, and plays part in method invocation and return.
* In JVM, stack is implemented for execution of method in LIFO order.Currently executing method always reside on the top of the stack.
* JVM can only perform push and pop operations on JVM stack.
* Like the method area and heap, the memory for a JVM stack does not need to be contiguous.
* A JVM Stack is created at run-time, for every JVM thread, whenever a JVM thread is created.Each and every method call performed by that thread is stored in the corresponding run time stack including parameters, local variables, intermediate computations, and other data.
* In JVM, stack data is thread safe. Stack data can be accessed by the corresponding thread only i.e. every JVM thread has its private JVM stack whose data cannot be accessed by other threads.Because of this, you don't need to worry about syncronizing multiple threads to set accessing rules for local variables in your Java programs
* JVM stacks can be either of a fixed size or can dynamically expand and contract as required by the computation.We can also mention the JVM thread stack size by using `-Xss<size>` command.
* If the computation in a thread requires a larger JVM stack than permitted size, JVM throws __StackOverflowError__.
* If JVM stacks can be dynamically expanded, and expansion is attempted but insufficient memory can be made available, or if insufficient memory can be made available to create the initial JVM stackfor a new thread, JVM throws __OutOfMemoryError__.
* Each entry in the JVM stack is called __Stack Frame__ or __Activation Record__.

![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/JVM%20Stack/JVM%20Stack.jpg)

## Stack Frame Structure
* Frames may be heap allocated or allocated on a contiguous stack or some combination of both depending on the decision of JVM implementation designers.
* Only one frame is active at any given point.This frame is reffered as the current frame or method.
* When a thread invokes a Java method, the virtual machine creates and pushes a new frame in the  thread's stack.After completing a method, current frame is popped from the stack, whether that completion is normal or abrupt(it throws an uncaught exception).And after completing all method calls the stack becomes empty and that empty stack is destroyed by the JVM just before terminating the thread.
* Frame created by a thread is local to that thread and cannot be referenced by any other thread.
* Stack Frame has 3 parts: 
  1. Local Variables Array(LVA)
  2. Operand Stack(also an array)
  3. Frame Data<br>
  
![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/JVM%20Stack/Stack%20Frame%20Structure.jpg)

### 1. Local Variables Array
* The local variables array is a zero-based array of words.
* It contains all parameters and local variables of the method.
* Each slot or entry in the array is of 4 byte and local variables are addressed by indexing.
* The length of LVA is decided at compile time, supplied in the binary representation of a class or interface along with the code for the method associated with the frame, and at run time required space will be given to LVA of a method as mentioned in the current class' or interface's constant pool(whose reference is stored in Frame Data segment of Frame).
* Values of type int, float, and reference occupy 1 entry or slot in the array i.e. 4 bytes.
* Values of type double and long occupy 2 consecutive entries in the array i.e. 8 bytes.
* Byte, short and char will be converted into int type before storing and will occupy one slot i.e. 4 bytes.
* Way of storing boolean can vary from JVM to JVM. BUt most of the JVM gives 1 slot for boolean values in the local variables array.
* The parameters are stored in the LVA first, in the same order they are declared, and then local variables will be stored in order.
* On instance method invocation, 0th index of LVA is always used to pass the current object reference(i.e. on which the instance method is being invoked) variable `this`, in case of Java.But it does not happen with static methods.
````
class A {

  public static int runClassMethod(int i, long l, float f, double d) {
    Object o=new Object();
    byte b;
  }
  
  public int runInstanceMethod(char c, double d, short s) {
    boolean b;
  }
}
````

![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/JVM%20Stack/Local%20Variabales%20Array.jpg)

### 2. Operand Stack
* JVM uses Operand Stack as a work space for rough work or we can say for storing intermediate calculation's result.
* The maximum depth of this stack is decided at compile time, supplied along with the code for the method associated with the frame, and at run time required space will be given to Operand Stack of a method as mentioned in the current class' or interface's constant pool(whose reference is stored in Frame Data segment of Frame).
* The JVM can store the same data types that it stores in the Local Variables Array.
* Operand Stack is an array of words like LVA but it is not accessed by using index like LVA rather it is accessed using instructions to push a value into the operand stack, pop a value from the operand stack and some instructions to perform arithmetic and other required operations.
* __For example:__ Given two int values are pushed into the Operand stack using `iload_0` & `iload_1`, and `iadd` instruction pops both int values from operand stack and pushes back the sum of both the ints into the operand stack.And finally the fourth and last instruction `istore_2` pops the result of the add from the top of the operand stack and stores it into the local variable array at 2nd index
````
iload_0    // push the int in local variable 0
iload_1    // push the int in local variable 1
iadd       // pop two ints, add them, push result
istore_2   // pop int, store into local variable 2
````

![picture alt](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/JVM%20Stack/Operand%20Stack.jpg)

* The operand stack is also used to prepare & pass parameters to the methods, and to receive method return values.

### 3. Frame Data
* Frame Data contains a reference to the run time constant pool for the class or interface of the current method to support __dynamic linking__ of the method code.
* Dynamic linking translates these symbolic method references into concrete method references, loading classes as necessary to resolve as-yet-undefined symbols, and translates variable accesses into appropriate offsets in storage structures associated with the run-time location of these variables.
* It contains all symbolic references(constant pool resolution), normal method return related related to that particular method and exception dispatch in case of abrupt completion of method.
* Many instructions in the Java virtual machine's instruction set refer to entries in the constant pool. Some instructions merely push constant values of type int, long, float, double, or String from the constant pool onto the operand stack. Some instructions use constant pool entries to refer to classes or arrays to instantiate, fields to access, or methods to invoke. Other instructions determine whether a particular object is a descendant of a particular class or interface specified by a constant pool entry.
* Whenever the Java virtual machine encounters any of the instructions that refer to an entry in the constant pool, it uses the frame data's pointer to the constant pool to access that information.
* As mentioned earlier, references to types, fields, and methods in the constant pool are initially symbolic.And JVM must resolve the references at run time.
* Aside from constant pool resolution, the frame data must assist the virtual machine in processing a normal or abrupt method completion.
* Frame data also contain some kind of reference to the method's exception table, which the virtual machine uses to process any exceptions thrown during the course of execution of the method.
* The stack frame may also include other information that is implementation dependent, such as data to support debugging.
