# Class Loader Subsystem
* Class loader subsystem is, an essential part of Java Virtual Machine, used for loading the `.class` files and saving the bytecode in the JVM method area.
* This subsystem handles the dynamic(run-time) class loading functionality.Data for loaded types(classes) resides in the method area.
* It performs 3 major functions i.e.:
  1. Loading
  2. Linking
  3. Initialization
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

__Application or System ClassLoader:__ This classloader is the child class of Extension classloader and is responsible for loading the classes from the system classpath.It internally uses the ‘CLASSPATH‘ environment variable and is also a user defined class loader written in Java language.
<br>
__Note:__ The ClassLoader Delegation Hierarchy Model always functions in the order Application ClassLoader->Extension ClassLoader->Bootstrap ClassLoader.
