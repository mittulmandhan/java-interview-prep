// this code will not compile
// because class B is trying to inherit/extend final class A

package final_class.example1;

final class A {
	int x = 10;
}

// error will occur here
class B extends A {
	int y = 20;
}
