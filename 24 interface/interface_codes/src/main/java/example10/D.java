package example10;

//class D is not abstract
//so we need to override remaining abstract method only
//i.e. my() method
class D extends C {
	public void my() {
		System.out.println("in my()");
	}

	public static void main(String[] args) {
		D d = new D();
		d.ab();
		d.my();
	}
}