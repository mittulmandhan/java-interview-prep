package example7;

interface A {
	public static final int x = 10;
	// this line will not compile
	// because y is final
	// replace this line with `int y=10;`
	// and it will compile
	// int y;
}