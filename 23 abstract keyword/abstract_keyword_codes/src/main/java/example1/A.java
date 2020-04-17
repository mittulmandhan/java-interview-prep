//class B is abstract so it cannot be instantiated

package example1;

public class A {
public static void main(String[] args) {
 // not valid
 new B();// compile time error
}
}
