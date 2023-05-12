# Threads
* Threads were first introduced in Windows Operating Systems.
* The concept was to divide heavy processes in multiple threads(light weight processes).
* Each program can have multiple associated threads.
* In Java, we have 2 entities in java.lang package in order to provide threading:
  - Runnable interface
  - Thread class
* Generally Java programs follow sequential order plus we have only one thread(i.e. main thread) and a stack for main thread.
````
// All of these lines will go sequentially
// no next line can be executed until its previous line is executed
class A {
  public static void main(string[] args) {
    int a=5, b=10;
    int c;
    c=a+b;
  }
}
````
* In Java threading, we can create as many threads(for each thread there is one stack) as we want and they can be synchronous or asynchronous.
* Java supports threading through stack.
* JVM executes methods in stack.
* JVM sets 'main' as the name of main thread i.e. started with main method.
* You can change the name of main thread as well.
````
public class Thread_Demo implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// getName() of the main thread
		System.out.println(Thread.currentThread().getName());
    
    // we can also change the name of main thread using setName() method
    Thread.currentThread().setName("mittul");
    System.out.println(Thread.currentThread().getName());
	}
}
````
__output:__
````
main
mittul
````
## java.lang.Runnable
* Runnable is an interface.
* It is to be implemented by a class whose instances are intended to be executed by a thread.
* Runnable interface has only one method defined in it which is run().
* Runnable can't throw checked exception but RuntimeException can be thrown from run() method.
* Uncaught exceptions are handled by exception handler of the thread, if Exception Handler can’t handle or catch exceptions, JVM prints the stack trace and terminates the flow.
* Program showing congruency:
````
public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread_Demo.run()");
	}

	public static void main(String[] args) {
		System.out.println("Thread_Demo.main()");
		Thread t = new Thread(new Thread_Demo());
		// It will load the run() method on same stack i.e. main stack
		// t.run();

		// It will make a new stack and load run() method on that stack
		t.start();
	}

}
````
__output:__
````
Thread_Demo.main()
Thread_Demo.run()
````
## java.lang.Thread
* Thread is a line of execution within a program.
* Declaration:
`public class Thread extends Object implements Runnable`
* Java provides a thread class that has various method calls inorder to manage the behaviour of threads.
### Constructors
* Thread(): Allocates a new Thread object.
* Thread(Runnable target): Allocates a new Thread object.
* Thread(Runnable target, String name): Allocates a new Thread object.
* Thread(String name): Allocates a new Thread object.
* Thread(ThreadGroup group, Runnable target): Allocates a new Thread object.
* Thread(ThreadGroup group, Runnable target, String name): Allocates a new Thread object so that it has target as its run object, has the specified name as its name, and belongs to the thread group referred to by group.
* Thread(ThreadGroup group, Runnable target, String name, long stackSize): Allocates a new Thread object so that it has target as its run object, has the specified name as its name, and belongs to the thread group referred to by group, and has the specified stack size.
* Thread(ThreadGroup group, String name): Allocates a new Thread object.
### Methods
1. __activeCount():__  Returns an estimate of the number of active threads in the current thread’s thread group and its subgroups<br>
  `public static int activeCount()`
2. __checkAccess():__ Determines if the currently running thread has permission to modify this thread.It throws SecurityException - if the current thread is not allowed to 
access this thread.<br>
  `public final void checkAccess() throws SecurityException`
3. __clone():__ Returns a clone of this instance. Throws CloneNotSupportedException as a Thread can not be meaningfully cloned.<br>
  `protected Object clone() throws CloneNotSupportedException`
4.  __currentThread():__ It is a static member of Thread class. It's return type is Thread. It return the object reference of current thread.<br>
  `public static Thread currentThread()`
5. __dumpStack():__ Prints a stack trace of the current thread to the standard error stream. This method is used only for debugging<br>
  `public static void dumpStack()`
6. __enumerate(Thread[] tarray):__ It takes an array into which to put the list of threads and returns the number of threads put into the array.<br>
  `public static int enumerate(Thread[] tarray) throws SecurityException`
7. __getAllStackTraces():__ Returns a map of stack traces for all live threads.<br>
  `public static Map getAllStackTraces() throws SecurityException`
8. __getContextClassLoader():__ Returns the context ClassLoader for this Thread. SecurityException is thrown the current thread cannot get the context ClassLoader.<br>
  `public ClassLoader getContextClassLoader() throws SecurityException`
9. __getDefaultUncaughtExceptionHandler():__ Returns the default handler invoked when a thread abruptly terminates due to an uncaught exception.<br>
  `public static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler()`
10. __getId():__ Returns the identifier of this Thread.<br>
  `public long getId()`
11. __getName():__ Returns this thread’s name.<br>
  `public final String getName()`
12. __getPriority():__ Returns this thread’s priority.<br>
  `public final int getPriority()`
13. __getStackTrace():__ Returns an array of stack trace elements representing the stack dump of this thread.<br>
  `public StackTraceElement[] getStackTrace() throws SecurityException`
14. __getState():__ Returns the state of this thread.<br>
  `public Thread.State getState()`
15. __getThreadGroup():__ Returns the thread group to which this thread belongs.<br>
  `public final ThreadGroup getThreadGroup()`
16. __getUncaughtExceptionHandler():__  Returns the handler invoked when this thread abruptly terminates due to an uncaught exception.<br>
  `public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler()`
17. __holdsLock(Object obj):__ Returns true if and only if the current thread holds the monitor lock on the specified object.<br>
  `public static boolean holdsLock(Object obj)`
18. __interrupt():__ Interrupts this thread.<br>
  `public void interrupt() throws SecurityException`
19. __interrupted():__ Tests whether the current thread has been interrupted.<br>
  `public static boolean interrupted()`
20. __isAlive():__ Tests if this thread is alive.<br>
  `public final boolean isAlive()`
21. __isDaemon():__ Tests if this thread is a daemon thread.<br>
  `public final boolean isDaemon()`
22. __isInterrupted():__ Tests whether this thread has been interrupted.<br>
  `public boolean isInterrupted()`
23. __join():__ Waits for this thread to die.<br>
  `public final void join() throws InterruptedException`
24. __join(long millis):__ Waits at most millis milliseconds for this thread to die.<br>
  `public final void join(long millis) throws InterruptedException, IllegalArgumentException`
25. __run():__ If this thread was constructed using a separate Runnable run object, then that Runnable object’s run method is called; otherwise, this method does nothing and returns.<br>
  `public void run()`
26. __yield():__ A hint to the scheduler that the current thread is willing to yield its current use of a processor. It is a static method of Thread class. It passes the thread from running state to runnable state.<br>
  `public static void yield()`
27. __start():__ Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.<br>
  `public void start() throws IllegalThreadStateException`
 28. __sleep(long millis):__ Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds. It halts the thread for specific time.<br>
  `public static void sleep(long millis) throws InterruptedException, IllegalArgumentException`
29. __setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh):__ Set the handler invoked when this thread abruptly terminates due to an uncaught exception.<br>
  `public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh) throws SecurityException`
30. __setPriority(int newPriority):__ Changes the priority of this thread.<br>
  `public final void setPriority(int newPriority) throws IllegalArgumentException, SecurityException`
31. __setName(String name):__ Changes the name of this thread to be equal to the argument name.<br>
  `public final void setName(String name) throws SecurityException`
32. __setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh):__ Set the default handler invoked when a thread abruptly terminates due to an uncaught exception, and no other handler has been defined for that thread.<br>
  `public static void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)`
33. __setDaemon(boolean on):__ Marks this thread as either a daemon thread or a user thread.<br>
  `public final void setDaemon(boolean on) throws IllegalThreadStateException, SecurityException`
34. __setContextClassLoader(ClassLoader cl):__ Sets the context ClassLoader for this Thread.<br>
  `public void setContextClassLoader(ClassLoader cl) throws SecurityException`
35. __toString():__ Returns a string representation of this thread, including the thread’s name, priority, and thread group.<br>
  `public String toString()`
36. __wait():__ It is a member of Object class. It is an overloaded method. wait() is used to release lock.
>wait() method is used in threading then why it exists in Object class?<br>
37. __notify():__ It is a member of Object class. Used to move thread from wait state to runnable state. It moves only one thread to runnable state. notify() can be called only after having a lock over an object.
38. __notifyAll():__ It is a member of Object class. Used to move thread from wait state to runnable state. It moves only all threads to runnable state. notifyAll() can be called only after having a lock over an object.
## Creating a thread
* There are two ways to create a thread:
### By extending the Thread class
````
public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
	}

}
````
__output:__
````
Hello Thread-0
````
### By implementing the Runnable interface
````
public class Thread_Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread_Demo.run()");
	}

	public static void main(String[] args) {
		System.out.println("Thread_Demo.main()");
		Thread t = new Thread(new Thread_Demo());
		t.start();
	}
}
````
__output:__
````
Thread_Demo.run()
````
* 2nd way is preffered almost always to create a thread.
* start() method starts a new stack & loads run() method in it.
* Main thread has main() method in the bottom of the its stack whereas other threads have corresponding run() method in the bottom of the stack.
* A Thread can only be started once i.e. start() method can be used only once.
## Life Cycle of a Thread
![alt picture](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/threads/life%20cycle%20of%20a%20thread.jpg)
* When a thread is created with new keyword it goes in new state.
* When we start that thread by using start() method it moves to runnable state. Now, thread scheduler moves threads to running state.
* At running state, if user does not give any input then it gets into block state and starts again.
* If the thread is in running state and we have used sleep() then it goes to runnable state then thread scheduler is responsible to get that thread in running state.
* yield() sends thread into runnable state from running state.
* In Java, threads can have priority from 1 to 10.
* By default, a thread gets a priority i.e. 5(normal).

__Note:__ See the codes for more example codes

__Resources:__
* https://www.geeksforgeeks.org/java-lang-thread-class-java/#:~:text=Java%20provides%20a%20thread%20class,over%20ride%20it's%20run%20method.&text=Thread(String%20name)%3A%20Allocates%20a%20new%20Thread%20object
* https://www.geeksforgeeks.org/runnable-interface-in-java/
* https://docs.oracle.com/javase/tutorial/essential/concurrency/procthread.html
* https://howtodoinjava.com/java-concurrency-tutorial/
