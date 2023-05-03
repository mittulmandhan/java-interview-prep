# Static Import
* static import is used to import static member of a class.
* This feature was first introduced in Java 5 to facilitate the java programmer to access any static member of a class directly.
* If we use static import then there is no need to specify class name to use the static member.
* By using static import we can call the static member directly i.e. by its name.
* Advantage of static import is that we can write less code to access the static member and it is effecient when we are using the static member oftenly.
* Disadvantage of static import is that overusing it makes the program unreadable and unmaintainable.
* The import allows the java programmer to access classes of a package without package qualification whereas the static import feature allows to access the static members of a class without the class qualification.
* The import provides accessibility to classes and interface whereas static import provides accessibility to static members of the class.
````
package first;

public class A {
  static public int x=10;
}
````

````
package second;
import static first.A.x;

class B {
  public static void main(String args[]) {
    System.out.println(x);
  }
}
````

* we can also use out by name (which is a static member of System class) to reduce the code from `System.out.println("Hello");` to `out.println("Hello");`
````
import java.lang.System.out;

class A {
  public static void main(String args[]) {
    System.out.println("A");
    out.println("Hello");
  }
}
````
* error eg:
````
package first;

public class A {
  static public int x=10;
}
````
````
package second;

class B {
  static public int x=20;
}
````
````
import static first.A.x;
import static second.B.x;

class C {
  public static void main(String args[]) {
    // here compiler will be confused where to search x
    System.out.println(x);
  }
}

````
