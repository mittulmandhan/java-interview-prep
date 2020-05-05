# Exceptions
* An exception is an unexpected event that disrupts the normal flow of the program.
* Following are some scenarios where an exception occurs:
  - User has entered an invalid data
  - A file that needs to be opened cannot be found
  - A network connection has been lost in the middle of communication
  - JVM has ran out of memory
* There are 3 categories of exceptions:
  - Compile Time Exception or Checked Exceptions
  - Unchecked Exceptions
    - Runtime Exceptions
    - Errors
* Checked exceptions are handled by programmer whereas unchecked exceptions are handled by JVM.
* Exceptions are handled by using:
  - try catch block
  - throws keyword
### Compile-time Exceptions/Checked Exceptions
* A checked exception is an exception that is checked by the compiler at compile-time.
* These are the problems which can be known at compile-time or code writing.
* Such excetion are to be handled by the programmer at compile-time otherwise program won't compile.
* For example:
````
````
### Runtime Exceptions/Unchecked Exception
* Unchecked exception is an exception that occurs at the time of execution.
* These are the problems which can be known at runtime or execution.
* These include programming bugs, such as logical/arithmetical errors or improper use of an API.
* Runtime exceptions are ignore at compilation time.
* The code which can cause problem at runtime is called Risky Code.
````

````
* Write code for ArrayIndexOutOfBoundException here
### Errors
* These are not actually exceptions, but problems that arise beyond the control of the user.
* All errors fall into unchecked exception's category.
* Errors are usually ignored in your code because you can not do anything about an error.
* __For example:__
  - StackOverflowError.
  - If hardware crashes, we cannot remove this problem.
  - NoSuchMethodError can not be handled or removed.
* If we want to make a new error then we can do so by making class which inherits Error class.
* Suppose we have a program which requires a minimum memory of 256mb RAM but our program has only 128mb RAM.In this case, our Program will not run and gives OutOfMemoryError.
## Exception Hierarchy

### java.lang.Throwable
* java.lang.Throwable is the root class for all the errors and exceptions.
* Object class is the superclass of Throwable class
* It has 2 subclasses i.e. Exception and Error.
* Throwable class is in java.lang package.
* __List of Methods available in the Throwable class:__
  1. `public String getMessage()`: Returns a detailed message about the exception that has occured. This message is declared and defined in Throwable class.
  2. `public Throwable getCause()`: Returns the cause of the exception as represented by a Throwable object.
  3. `public String toString()`: Returns the name of the class concatenated with the result of getMessage().
  4. `public void printStackTrace()`: Prints the result of toString() along with the stack trace to System.err i.e. the error output stream.
  5. `public StackTraceElement[] getStackTrace()`: Returns an array containing each element on the stack trace. The element at index 0 represents the top of the call stack, and the last element in the array represents the method at the bottom of the call stack.
  6. `public Throwable fillInStackTrace()`: Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.
### java.lang.Exception
* java.lang.Exception class is the super class for all types of exceptions.
* Exception class inherits Throwable class.
* Exceptions are recoverable i.e. they can be handled.
* Exception are categorized into checked exception and unchecked exception
* RuntimeException, IOException, SQLException, AWTException, and InterruptedException are the child classes of Exception.
* Only RuntimeException is an unchecked exception and all the other subclasses of Exception class are checked exception.
* Compile-time exception classes inherits Exception class.
* Runtime exception classes inherits RuntimeException class.
### java.lang.Error
* java.lang.Error is super class for all types of errors.
* It extends java.lang.Throwable class.
* Errors are non-recoverable i.e. they cannot be handled.
* Errors are also unchecked exceptions like runtime exceptions.
* It is out of programming scope because type of error can't be predicted but they may be prevented with well planning.
* Example: VirtualMachineError, AssertionError, OutOfMemoryError, LinkageError, InstantiationError.
