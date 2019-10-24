# Java Questions #

***1. What is Java?***
* Java is an open-source, high level, object-oriented programming language introduced by Sun Microsystems in May 1995 and designed by James Gosling.

***2. Explain object oriented programming concepts.***
* A programming language is considered to be an object oriented programming language if it consists of these 6 features:

  **i. Class**
  
  **ii. Object**
  
  **iii. Inheritance**
  
  **iv. Encapsulation**
  
  **v. Abstraction**
  
  **vi. Polymorphism**
  
  
**i. Class:** A class is like a blueprint for an object. A Class is a user-defined data-type which consists of states and behaviors.

**ii. Object:** Object represents any real world entity.

**iii. Inheritance:** It is the mechanism in java which enables one class(Child Class) to reuse the features of another class(Parent Class). In java, a class inherits the features of another class using 'extends' keyword. It supports the reusability of code and saves a lot of efforts of developer.

**iv. Encapsulation:** Encapsulation basically means Data Binding. It is defined as the wrapping up of data into a single unit. Encapsulation says every member i.e. states & behaviors must exist within a class.

**v. Abstraction:** Abstraction basically means Data Hiding. Data Abstraction is one of the key features of OOP language in which unnecessary informations are hidden from the user and only the required information visible to the user.

**vi. Polymorphism:** Polymorphism means one name multi-behavior. Polymorphism gives us ability to have multiple methods with same name but different behaviour.


***3. C++ vs Java***

|S. NO.|   C++   |   Java|
|:---:|:---: | :---:|
|1.)| Need compiler to execute the code  | Need both compiler & Interpreter to execute te code |
|2.)| Does not follow 100% encapsulation i.e. states & behaviours can exist outside as well as inside class | Follows 100% encapsulation i.e. states & behavious can only exist within a class |
|3.)| C++ uses primitive data types | Java says everything should be in a form of object/class |


***4. Naming conventions in Java?***
* In Java, while naming classes & interfaces follow camel case.For example: My, A, Car, etc.

* In Java, variable & method name should be in camel case but first letter of first word must be in lowercase.For example: carEngine, driving, etc.


***5. Why JRE appears again in JDK?***
* JRE is an environment required to run a Java program.It consists of JVM and a bunch of libraries such as Development, UI Toolkits, Integration Libraries, lang & util libraries and other base libraries.

* JDK is a Java development environment used for developing Java applications and applets. It includes JRE,an interpreter/loader(java), a compiler(javac), an archiver(jar), a document generator(javadoc), and other tools needed in Java application and applet development.


***6. Why bin is called "bin"?***
* bin is short for binary.It generally refers to the built applications(also known as binaries) that do something for a specific system.bin directory is located inside JDK.It cantains all the executables  and binary files werequire for Java development such as .exe, .dll(dynamic link libraries) and .ini(initialization) files.

* bin folder consists of java compiler, interpreter, archiver,security manager, applet viewer, etc files.


***7. What is advantage of 'path'?***
* One can access different locations by using path variables.


***8. Why .class is called bytecode?***
* In Java, .class files are created by compiler when a java program is compiled. class file is called bytecode because it contains Java bytecode i.e. highly optimized set of instructions,which is execcuted by JVM.class files contain symbols and each bytecode instructions is store in one byte exactly.


***9. Compiler vs Interpreter***

|   Compiler   |   Interpreter|
|:--- | :---|
|1.) It takes an entire program ata time. |1.) It takes a line of code or instruction at a time. |
|2.) Faster |2.) Comparatively Slower |
|3.) Compilation is done before execution. |3.) Compilation and execution takes place simultaneously. |
|4.) It checks syntax. |4.) It assumes that syntax is correct. |
|5.) Easy Debugging |5.) Difficult to Debug |
|6.) C, C++, Java, Scala uses compiler. |6.) Java, Javascript,Python uses interpreter. |
|7.) In Java, compiler creates an object file(.class file) after successful compilation. |7.) In Java, interpreter converts class bytecode line by line into machine instructions and executes them simultaneously. |
|8.) Compiler is used at compile time. |8.) Interpreter is used at run time. |


***10. Why JVM Search for main method ? What is its signature?***
* Main method is the most important Java method.When you start learning Java programming, this is the first method you encounter.Main mtjod is the entry point for any Java program that's why JVM search for main method.

* Signature of main method:

````
public static void main(String args[]){
//code
}
````


***11. Who loads the class in RAM?***
* JVM loads the class in RAM.Once the bytecode converted into NMC(Native machine code) JVM loads the NMC in RAM.


***12. Write the command to convert bytecode in enlish.What is this process called?
* Command to convert the bytecode in english:

````
javap -verbose A >> abcd.txt
````

* This process is called ____________


***13. What is JITC?Whats its use in Java?***
* JITC stands for Just In Time Compiler.JITC comes with JVM(inside execution engine).It works parallel to interpreter.

* JITC stores the executable code of the bytecode so that we don't need to convert the same bytecode into NMC again & again and we can directly run the NMC stored against the given bytecode instruction.This in result gives faster execution of java program and reusability to save efforts.



***14. JRE Architecture***




***15. Why Java is slower than C?***
* Simply because Java contains more processes than C.Jav uses compiler + interpreter whereas C uses only compiler.

* When we compile a C program we get an executable that can be run directly.

* But in Java, we get Bytecode after compilation and that we need to run using JRE which contains a lot of modules like class loader, bytecode verifier, interpreter, JITC, bytecode conversion, security manger, etc that makes a java program than a C program.


***16. How Java works on diff. platforms? or How Java is platform independent?***
* A programming language is said to be platform independent if and only if it can be run on all available operating systems with respect to its development and compilation.

* Java is platform independet because the bytecode, i.e. generated after compilation, can be run on any platform(O.S.) that Java supports.When you install JDK, JVM for the respective O.S. is a software that reads & converts the bytecode into NMC.
* It is like a translator between a Java program and machine.For all the platform, there is a particular JVM.

* JVM is platform dependent which makes the Java platform independent.


***17. Why initialization before use condition only applies to local variables?***
* Initialization condition says that no local variable can be used before initialization.

* Invalid program:

````
// local variable x is used before it is initialized 
void fun() {
  int x;
  System.out.println(x);//error at compile time
}
````

* Valid program:

````
// local variable x is used after it is initialized 
void fun() {
  int x=10;
  System.out.println(x);//10
}
````

* This happens because static variables are the initialized by static block and instance level variables are initialized by constructors but the variables having local level scope does not automatically get a default value from static block or constructor hence it does not have any value by default.So local variables are not usable until they get initialized.


***18. Write the rules for public access modifiers?***

**Rule 1:** When a file contains a public classs then file name should be equal to the public class name.

**Rule 2:** There could be only one public class ina program.

**Rule 3:** Main method should be in public class(best practice but not forced)






