# `wait()`, `notify()` and `notifyAll()`
* We have learn the functionalities of these methods in [Threads](https://github.com/mittulmandhan/java-interview-prep/tree/master/42%20threads)
* Here we will learn how can we use these 3 methods combined with synchronization of threads to achieve cooperation of multiple tasks to complete a common task/goal.
* Fetaures of this program:
  - Producer thread produce a new resource in every 1 second and put it in ‘taskQueue’.
  - Consumer thread takes 1 seconds to process consumed resource from ‘taskQueue’.
  - Max capacity of taskQueue is 5 i.e. maximum 5 resources can exist inside ‘taskQueue’ at any given time.
  - Both threads run infinitely.
````
class Producer implements Runnable
{
   private final List<Integer> taskQueue;
   private final int           MAX_CAPACITY;
 
   public Producer(List<Integer> sharedQueue, int size)
   {
      this.taskQueue = sharedQueue;
      this.MAX_CAPACITY = size;
   }
 
   @Override
   public void run()
   {
      int counter = 0;
      while (true)
      {
         try
         {
            produce(counter++);
         } 
         catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void produce(int i) throws InterruptedException
   {
      synchronized (taskQueue)
      {
         while (taskQueue.size() == MAX_CAPACITY)
         {
            System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
            taskQueue.wait();
         }
           
         Thread.sleep(1000);
         taskQueue.add(i);
         System.out.println("Produced: " + i);
         taskQueue.notifyAll();
      }
   }
}
````
* Here “produce(counter++)” code has been written inside infinite loop so that producer keeps producing elements at regular interval.
* We have written the produce() method code following the general guideline to write wait() method as mentioned in first section.
* Once the wait() is over, producer add an element in taskQueue and called notifyAll() method. Because the last-time wait() method was called by consumer thread (that’s why producer is out of waiting state), consumer gets the notification.
* Consumer thread after getting notification, if ready to consume the element as per written logic.
* Note that both threads use sleep() methods as well for simulating time delays in creating and consuming elements.
````
class Consumer implements Runnable
{
   private final List<Integer> taskQueue;
 
   public Consumer(List<Integer> sharedQueue)
   {
      this.taskQueue = sharedQueue;
   }
 
   @Override
   public void run()
   {
      while (true)
      {
         try
         {
            consume();
         } catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void consume() throws InterruptedException
   {
      synchronized (taskQueue)
      {
         while (taskQueue.isEmpty())
         {
            System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
            taskQueue.wait();
         }
         Thread.sleep(1000);
         int i = (Integer) taskQueue.remove(0);
         System.out.println("Consumed: " + i);
         taskQueue.notifyAll();
      }
   }
}

````
* Here “consume()” code has been written inside infinite loop so that consumer keeps consuming elements whenever it finds something in taskQueue.
* Once the wait() is over, consumer removes an element in taskQueue and called notifyAll() method. Because the last-time wait() method was called by producer thread (that’s why producer is in waiting state), producer gets the notification.
* Producer thread after getting notification, if ready to produce the element as per written logic.
````
public class ProducerConsumerExampleWithWaitAndNotify
{
   public static void main(String[] args)
   {
      List<Integer> taskQueue = new ArrayList<Integer>();
      int MAX_CAPACITY = 5;
      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
      tProducer.start();
      tConsumer.start();
   }
}
````

__output:__
````
Produced: 0
Produced: 1
Produced: 2
Produced: 3
Produced: 4
Queue is full Producer is waiting , size: 5
Consumed: 0
Produced: 5
Queue is full Producer is waiting , size: 5
Consumed: 1
Consumed: 2
Consumed: 3
Consumed: 4
Consumed: 5
Queue is empty Consumer is waiting , size: 0
Produced: 6
Produced: 7
Produced: 8
Produced: 9
Produced: 10
Queue is full Producer is waiting , size: 5
Consumed: 6
Produced: 11
Queue is full Producer is waiting , size: 5
Consumed: 7
````
__Note:__ We can try changing time taken by producer and consumer threads to different times, and check the different outputs in different scenario.

## If wait(), notify(), notifyAll() are used in concurrency then why these methods exist in Object class?
* In Java, resource(object) calls the wait() method to make the current worker(current thread) release the lock on the resource and wait.
* Resource(object) then calls notify() method to notify the waiting worker(thread) that now it is time to aquire the resource and start working again.
* Every object has a monitor on it and monitor uses workqueue & mutex(lock) to synchronize that object.
* So it is senseless to call wait(), and notify() on the thread. Hence wait() and notify() exists inside Object class so that all object can call them when synchronized.
* Obviously Thread class also has a wait() in it because it is an indirect child of Object class but one should not call wait() on thread instead call wait() on the resource on which the thread is working.

## What if wait(), notify(), and notifyAll() are in Thread class? what difference it could have made?
* In Java, the object itself is the entity that is shared between threads which allows them to communicate with each other.
* Threads have no specific knowledge of each other and they can run asynchronoulsy. They do not have any business in knowing about each other, they only need to know about the object/resource they are using.
* Threads run and lock, wait, and notify on the object that they want to get access to.
* In Java, we use objects as synchronization, mutex, and communication points between threads.
* If wait(), notify(), and notifyAll() would have existed inside Thread class then each thread has to keep information and status of every other thread which is in the entry-set, wait-set or using the resource. As we know one thread can aquire multiple resources at a time, so this approach will need huge amount of space as compare to the approach we use currently. On the contrary, threads are keeping the data which violates the concept of independent execution.
* Hence it is better to keep the wait(), notify(), and notifyAll() methods in the Object class.
