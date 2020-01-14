# Package Statement
* 'package' is a keyword used in package statement in a java source file.
* The package statement identifies the package that a Java program belongs to
* If your program does not include a package statement, the program belongs to the default package.
* If you are writting a short java program you don't need package statement but if you plan to distribute your program its necessary to add package statement to each & every source file of your program.
* package statement takes place at the very first line of the program.
* There can be only one package statement in a java program.

**Syntax:** package com.package-name.subpackage-name;

# Import Statement
* 'import' ia a keyword used in import statement in a java source file.
* The import statement is used to make certain classes or the entire packages visible in current source file.
* In a Java source file, the import statements occur immediately following the package statement and before any class definitions.
* You can refer to a certain class by mentioning its name following the package name with dot operator or you can import an entire package by using * following the package name with dot operator.
* The fundamental language functions are stored inside java.lang package.
* java.lang package is imported by compiler by default(import java.lang.*).

**Syntax:** import pkg1[.pkg2].(classname|*);


**example.java**
```
package com.demo-package1;
import com.demo-package2.B;

public class A {
  B b;
  
  A() {
    b=new B();
  }
  
  void fun() {
    system.out.println("your name is "+b.x);
  }
  
};
```
