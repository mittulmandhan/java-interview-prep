# String vs StringBuffer vs StringBuilder

## String
* String is an __immutable__ class.
* Objects of type String are __stored in Constant String Pool__.
* String objects are __not garbage collected__ since they are stored in Constant Pool.
* Every immutable object in Java is thread-safe, that implies objects of type String is also __thread-safe__.
* String is __slow__ due to thread-safety.
* String is __sychronized__ thus cannot be used by 2 threads simultaneously.
* String once assigned cannot be changed.
* Methods in String class does not make any changes to the state of the object at all.
````
// This object of type String is stored in constant pool and cannot be changed
String demo = "Hello";

// Here new String object is created
// Above object will remain intact
demo = "Bye";
````

## StringBuffer
* StringBuffer is __mutable__ class that implies values in object can be modified once assigned.
* Objects of type StringBuffer are __stored in Heap__.
* StringBuffer objects are __garbage collected__ since they are stored in heap.
* __StringBuffer and StringBuilder have same set of methods__.
* StringBuffer is __thread-safe__.
* StringBuffer is __slow__ due to thread-safety but still __faster than String__.
* StringBuffer is __sychronized__ thus a method cannot be used by 2 threads simultaneously.
* StringBuffer once assigned can be changed.


## StringBuilder
* StringBuilder is __mutable__ class.
* Object of StringBuilder is stored in Heap.
* StringBuilder objects are __garbage collected__ since they are stored in heap.
* __StringBuilder and StringBuffer have same set of methods__.
* StringBuffer is __not thread-safe__.
* StringBuffer is __fast__.
* StringBuffer is __not sychronized__ thus a method can be used by 2 threads simultaneously.
* StringBuffer once assigned can be changed.


## Difference Table

Basis          | String               | StringBuffer                | StringBuilder
-------------- | -------------------- | --------------------------- | --------------
__Storage Area__   | Constant String Pool | Heap                        | Heap
__Modifiable__     | Immutable            | Mutable                     | Mutable
__Thread Safe__    | Yes                  | Yes                         | No
__Sychronized__    | Yes                  | Yes                         | No
__Performance__    | Slow                 | Slow but faster than String | Fastest
