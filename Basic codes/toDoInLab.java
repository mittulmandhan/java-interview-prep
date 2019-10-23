class A {
	public static void main(String args[]) {
		B b=new B();
		C c=new C();
		D d=new D();
		
		d.z=b.x+c.y;
		System.out.println(d.z);
	}
}

class B {
	int x=10;
}

class C {
	int y=20;
}

class D {
	int z;
}