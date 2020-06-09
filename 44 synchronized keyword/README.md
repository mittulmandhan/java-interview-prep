# `synchronized` keyword
* `synchronized` is a keyword.
* `synchronized` is a non access modifier.
* By using `synchronized` keyword we aquire the lock of a resource.
* A resource can be locked by only one thread at a time.
* A thread can have locks of multiple resources.
* `synchronized` keyword can only be used with:
  - blocks
  - methods
* Variables and classes can not be synchronized.
  
> What is the need for aquiring a lock?<br>Race condition is when multiple threads are trying to aquire the lock of a single resource and atleast one of the thread is asking for a write lock. So to prevent race condition we have to use lock system in Java.

* Only one thread can aquire the lock of a resource.
* Till the current thread is holding the lock of the resource no other thread can read or write it i.e. all other threads have to wait in wait-set until current thread frees the resource.

## `synchronized` Block
* When a Thread wants to execute a synchronized block it must aquire a lock of the lockObject's monitor.
* Only one thread can aquire the lock of an object's monitor at a time. So all other threads wait until the lock frees.
* Using synchronized keyword with block ensures that, at a time, only one thread will be executing the statements inside the block.
* A thread does not releases the lock when it is in sleep state. So no other thread can execute that block even if the current thread(aquiring the lock) is in sleeping state.
* If we pass a reference variable in the synchronized block argument and that reference variable contains 'null'. In that case, NullPointerException is thrown.
* Syntax:
````
synchronized( lockObject ) 
{
   // synchronized statements
}
````
### Examples
1.
````
public class MathClass 
{
    void printNumbers(int n) throws InterruptedException 
    {
        synchronized (this) 
        {
            for (int i = 1; i <= n; i++) 
            {
                System.out.println(Thread.currentThread().getName() + ": "+  i);
                Thread.sleep(500);
            }
        }
    }
}
````
````
public class Main 
{
    public static void main(String args[]) 
    {
        final MathClass mathClass = new MathClass();
 
        //first thread
        Runnable r = new Runnable() 
        {
            public void run() 
            {
                try {
                    mathClass.printNumbers(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       
        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
    }
}
````
__output:__
````
ONE: 1
ONE: 2
ONE: 3
 
TWO: 1
TWO: 2
TWO: 3
````
## `synchronized` Method
* In case of synchronized method, the lock object is:
  - ‘.class’ object – if the method is static.
  - ‘this’ object – if the method is not static. ‘this’ refer to reference to current object in which synchronized method is invoked.
* Java synchronized keyword is re-entrant in nature it means if a synchronized method calls another synchronized method which requires same lock then current thread which is holding lock can enter into that method without acquiring lock.
* Syntax:
````
<access modifier> synchronized method( parameters ) 
{
    // synchronized code
}
````
### Examples
1.
````
public class MathClass 
{
    synchronized void printNumbers(int n) throws InterruptedException 
    {
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(Thread.currentThread().getName() + ": "+  i);
            Thread.sleep(500);
        }
    }
}
````
````
public class Main 
{
    public static void main(String args[]) 
    {
        final MathClass mathClass = new MathClass();
 
        //first thread
        Runnable r = new Runnable() 
        {
            public void run() 
            {
                try {
                    mathClass.printNumbers(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       
        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
    }
}
````
__output:__
````
ONE: 1
ONE: 2
ONE: 3
 
TWO: 1
TWO: 2
TWO: 3
````

2.
````
public class A implements Runnable {
	int i = 0;

	public synchronized void run() {
		for (; i < 10; i++) {
			System.out.println("Hello " + i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		A task = new A();
		Thread t1 = new Thread(task, "t1");
		Thread t2 = new Thread(task, "t2");
		t1.start();
		t2.start();
	}

}
````
__output:__(Here t1 can be t2 also)
````
Hello 0 t1
Hello 1 t1
Hello 2 t1
Hello 3 t1
Hello 4 t1
Hello 5 t1
Hello 6 t1
Hello 7 t1
Hello 8 t1
Hello 9 t1
````
