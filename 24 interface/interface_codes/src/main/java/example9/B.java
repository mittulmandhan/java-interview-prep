package example9;

//Here, class B is overriding interface A's ab() method
//so it followed the same signature present in interface A for overriding ab()
//In abstract class B, my() method will not be made `public abstract` by compiler
//because it is a feature present in interfaces only
abstract class B implements A {
	public abstract void ab();

	abstract void my();
}