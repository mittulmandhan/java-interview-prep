# `yield()` vs `join()`
## `yield()` method
* Signature:
  `public static native void yield();`
* Theoretically, to ‘yield’ means to let go, to give up, to surrender.
* Yield is a Static method and Native too.
* Yield tells the currently executing thread to give a chance to the threads that have equal or higher priority in the Thread Pool.
* There is no guarantee that Yield will make the currently executing thread to runnable state immediately.
* It can only make a thread from Running State to Runnable State, not in wait or blocked state.
````
public class YieldExample extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        YieldExample t1 = new YieldExample();  
        YieldExample t2 = new YieldExample();  
        // this will call run() method  
        t1.start();  
        t2.start();  
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            Thread.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }  
}  
````
__Output:__
````
Thread-0 in control
Thread-1 in control
main in control
main in control
main in control
Thread-1 in control
Thread-1 in control
Thread-0 in control
Thread-0 in control
````

## `join()` method
* The join() method of a Thread instance can be used to “join” the start of a thread’s execution to the end of another thread’s execution.
* The joining thread will not start running until the thread being joined finished executing.
* Signature:
  `public final void join() throws InterruptedException`
* Giving a timeout within join(), will make the join() effect to be nullified after the specific timeout.
````
public class JoinExample implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello "+Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new JoinExample(), "t1");
		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello "+Thread.currentThread().getName()+" "+i);
		}
	}
	
}
````
__output:__
````
Hello main 0
Hello t1 0
Hello main 1
Hello t1 1
Hello main 2
Hello t1 2
Hello main 3
Hello main 4
Hello main 5
Hello t1 3
Hello t1 4
Hello t1 5
Hello t1 6
Hello main 6
Hello t1 7
Hello main 7
Hello t1 8
Hello main 8
Hello t1 9
Hello main 9
````

## Difference `yield()` vs `join()`
yield()                                                               | join()             
--------------------------------------------------------------------- | ----------------------------------------------------------------
yield() is a static method.                                           | join() is final instance method.
yield() is a native method.                                           | join() is written in Java.
public static native void yield();                                    | public final void join() throws InterruptedException {}
yield() makes current thread to yield and go to runnable state from running state | The join() method of a Thread instance can be used to “join” the start of a thread’s execution to the end of another thread’s execution.


<br><br>__Resources:__
* https://howtodoinjava.com/java/multi-threading/difference-between-yield-and-join-in-threads-in-java/




