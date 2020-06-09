# Runnable vs Thread
Runnable                                                         | Thread
---------------------------------------------------------------- | -----------------------------------------------------------------------
Runnable is an (functional)interface.                            | Thread is a class.
Implementing Runnable is preffered way to create a thread because it is more flexible. We can pass it to some executor service or Thread constructor | Extending Thread is less preffered way to create a thread because this approach inflexible.
If we implement the Runnable interface, we can further extend some class and implement other interfaces as well | Extending Thread results in losing our only chance to extend another class.
