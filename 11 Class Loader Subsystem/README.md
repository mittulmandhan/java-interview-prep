# Class Loader Subsystem
* Class loader subsystem is, an essential part of Java Virtual Machine, used for loading the `.class` files and saving the bytecode in the JVM method area.
* This subsystem handles the dynamic(run-time) class loading functionality.Data for loaded types(classes) resides in the method area.
* It performs 3 major functions i.e.:
  1. Loading
  2. Linking
  3. Initialization
* The flow of processes in class loader subsystem is from top to bottom or you can say parent class to child class.
  
## Loading
* This component handles the loading of the .class files from the hardware system into the JVM memory and stores the binary data (such as fully qualified class-name, immediate parent class-name, information about methods, variables, constructors etc.) in the method areas.
* Java classes aren’t loaded into memory all at once, but when required by an application.
* There are 3 types of class loaders in JVM: 
  1. Bootstrap ClassLoader
  2. Extension ClassLoader
  3. System ClassLoader
* Java ClassLoaders use an algorithm called the <b>Delegation Hierarchy Algorithm</b> to load the classes.
* Depending on the type of class and the path of class, the ClassLoader that loads that particular class is decided.

__Bootstrap or Primordial ClassLoader:__ This classloader is responsible for loading the internal core java classes present in Bootstrap classpath `jdk/jre/lib/rt.jar` and other classes present in the `java.lang.*` package. A Bootstrap Classloader is a Machine code which kickstarts the operation when the JVM calls it. It is not a java class. Its job is to load the first pure Java ClassLoader. It is by-default available with every JVM and is written in native C/C++ languages.It is the root class loader.

__Extention ClassLoader:__ This classloader is the child class of Primordial classloader and is responsible for loading the classes from the extension classpath `jdk\jre\lib\ext` or any other directory pointed by the system property `java.ext.dirs`.It is User defined ClassLoader written in Java language.

__Application or System ClassLoader:__ This classloader is the child class of Extension classloader and is responsible for loading the classes from the system classpath.It internally uses the ‘CLASSPATH‘ environment variable and is also a user defined class loader written in Java language.This is the class loader first called by the subsystem.
<br>
__Note:__ The ClassLoader Delegation Hierarchy Model always functions in the order Application ClassLoader->Extension ClassLoader->Bootstrap ClassLoader.
<br>
__Principles of functionality of a Java ClassLoader__

___1. Delegation Model:___ The Java Virtual Machine and the Java ClassLoader use an algorithm called the <b>Delegation Hierarchy Algorithm</b> to Load the classes into the Java file.
* ClassLoader always follows the Delegation Hierarchy Principle.
Whenever JVM comes across a class, it checks whether that class is already loaded or not.
* If the Class is already loaded in the method area then the JVM proceeds with execution.
* If the class is not present in the method area then the JVM asks the Java ClassLoader Sub-System to load that particular class, then ClassLoader sub-system hands over the control to Application ClassLoader.
* Application ClassLoader then delegates the request to Extension ClassLoader and the Extension ClassLoader in turn delegates the request to Bootstrap ClassLoader.
* Bootstrap ClassLoader will search in the Bootstrap classpath(`jdk/jre/lib/rt.jar` & `java.lang.*` package). If the class is available then it is loaded, if not the request is delegated to Extension ClassLoader.
* Extension ClassLoader searches for the class in the Extension Classpath(JDK/JRE/LIB/EXT). If the class is available then it is loaded, if not the request is delegated to the Application ClassLoader.
* Application ClassLoader searches for the class in the Application Classpath. If the class is available then it is loaded, if not then a ClassNotFoundException exception is generated.

__2. Visibility Principle:__ The Visibility Principle states that a class loaded by a parent ClassLoader is visible to the child ClassLoaders but a class loaded by a child ClassLoader is not visible to the parent ClassLoaders.

__3. Uniqueness Property:__ The Uniquesness Property ensures that the classes are unique and there is no repetition of classes(i.e. no class is loaded more than once). According to thishg, class loaded by the parent classloader should not be again loaded by the child classloader

## Linking
* This component of class loader subsystem is responsible for linking process of a class or an interface.
* Linking of a class or interface refers to verifying and preparing:
  * that class or interface
  * its direct super class
  * its direct super interfaces
  * its element type
* It also includes Resolution of symbolic references in the class or interface.
* Linking involves the allocation of new data structures, thus it may fail with an OutOfMemoryError Exception.
* Linking has 3 phases
  * Verification
  * Preparation
  * Resolution

__1. Verification:__ 
* It is a process of checking the binary representation of a class and validating whether the generated .class file is valid or not.
* This process is performed by the bytecode verifier.
* Bytecode verifier checks whether the .class file is generated by valid compiler or not.
* It checks that binary representation of the class is structurally correct or not.
* It also checks that .class file is properly formatted or not
* If you make changes int he bytecode of the class manually bytecode verifier detects that and shows error and then you need to recompile your code for smooth execution.
* If the binary representation of a class or interface does not satisfy the static or structural constraints then a VerifyError is thrown.

__2. Preparation:__ 
* It is a process of assigning the memory for the class level or interface level static variables and assigning the default values.
* In this phase, only default values of variables are assigned because assignment original values is performed by Initialization phase.

__3. Resolution:__
* Resolution is the process of dynamically determining concrete values from symbolic references in the run-time constant pool i.e. changing the symbolic references with the original memory references from the method area.
* In simple words, it is the process of replacing symbolic names in our program with original memory references from method area.

## Initialization
* This component performs the final phase of the class loading where all the static variables are assigned the original values and the static blocks are executed from the parent to the child class.
* This process requires careful synchronization as JVM is multithreaded and some threads may try to initialize the same class or interface at the same time.








