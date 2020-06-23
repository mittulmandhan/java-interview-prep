# SynchronizedHashMap vs ConcurrentHashMap

SynchronizedHashMap                                                       | ConcurrentHashMap
------------------------------------------------------------------------- | -------------------------------------------------------------------------------------
Synchronization is at Object level.                                       | Synchronization is at segment level.
SynchronizedHashMap is created by passing a HashMap in Collections.synchronizedMap() |  ConcurrentHashMap can be created in heap using new keyword.
Map<K, V> syncMap = Collections.synchronizedMap(new HashMap<K, V>());     | Map<K, V> conMap = new ConcurrentHashMap<>();
Collections.synchronizedMap() is a method of java.util package.           | ConcurrentHashMap is a class in java.util.concurrent package.
A lock is obtained for read/write operation at object level.              | A lock is obtained for write operation at segment level.
Concurrency level cannot be set for better optimization.                  | Concurrency level can be set for better optimization.
ConcurrentModification Exception is thrown if a thread tries to modify an existing SynchronizedMap which is being iterated. | ConcurrentModification Exception is not thrown if a thread tries to modify an existing ConcurrentHashMap which is being iterated.
Since at a given time only a single Thread can modify the map and block other threads the performance is comparatively bad. | Multiple Threads can modify ConcurrentHashMap. Hence performance is much better.


__Resources:__
* https://www.javainuse.com/java/javaConcurrentHashMap