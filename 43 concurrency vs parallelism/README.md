# Concurrency vs Parallelism

Concurrency                                                     | Parallelism
--------------------------------------------------------------- | ------------------------------------------------------------------------
Concurrency is when two tasks can start, run, and complete in overlapping time periods | Parallelism is when tasks literally run at the same time, eg. on a multi-core processor.
Concurrency is the composition of independently executing processes | Parallelism is the simultaneous execution of (possibly related) computations.
In concurrency, processes are independent. | In Parallelism, processes may be related or independent.
Concurrency is about dealing with lots of things at once. | Parallelism is about doing lots of things at once.

* An application can be concurrent but not parallel, which means that it processes more than one task at the same time, but no two tasks are executing at same time instant.
* An application can be parallel but not concurrent, which means that it processes multiple sub-tasks of a task in multi-core CPU at same time.
* An application can be neither parallel nor concurrent, which means that it processes all tasks one at a time, sequentially.
* An application can be both parallel and concurrent, which means that it processes multiple tasks concurrently in multi-core CPU at same time .
