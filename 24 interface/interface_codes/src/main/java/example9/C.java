package example9;

//Now, in class C signature of ab() will be
//`public void ab()`
//and signature of my() will be
//`void my()`
//as my() have default access modifier in class B
class C extends B {
	public void ab() {
	}

	void my() {
	}
}