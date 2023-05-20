# `sleep()` vs `wait()`
sleep()                                                          | wait()
---------------------------------------------------------------- | -----------------------------------------------------------------------
sleep() causes the currently executing thread to sleep for specified milli seconds(millis) | wait() causes the current thread to wait until another thread invokes notify() or notifyAll() method, on this object, to notify the waiting thread.
sleep() method belongs to Thread class. | wait() method belongs to Object class.
There is no need to call sleep() from synchronized context. | wait() method should be called only from the synchronized context.
sleep() method does not releases the lock on an object during synchronization. | wait() method releases the lock on an object during synchronization.
sleep() method execution completes when time expires or thread interrupts. | wait() method is interrupted by notify() or notifyAll() or due to timeout.
sleep() method is called on the current thread. | wait() method is called on an object.
sleep() is a static method. | wait() is an instance method.
sleep() has 2 overloaded methods:<br><br>1. sleep(long millis)<br>2. sleep(long millis, int nanos) | wait() has 3 overloaded methods:<br><br>1. wait()<br>2. wait(long timeout)<br>3. wait(long timeout, int nanos)
public static void sleep(long millis) throws InterruptedException | public final void wait(long timeout)
sleep() throws InterruptedException. | wait() does not throws any Exception.



<br><br>__Resources:__
* https://www.youtube.com/watch?v=_pyOA3i0dC4&t=39s
* https://howtodoinjava.com/java/multi-threading/sleep-vs-wait/
