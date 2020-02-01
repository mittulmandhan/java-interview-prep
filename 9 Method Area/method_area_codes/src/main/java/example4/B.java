package example4;

// If B IS-A A
// And main method exists in A but not in B
// So, when B runs JVM will find main method in B's method table
// and main method's bytecode get executed 
// SImple!
public class B extends A {

}
