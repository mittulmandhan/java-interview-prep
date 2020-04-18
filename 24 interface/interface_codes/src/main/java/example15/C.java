// interface A has ab() method with return type void
// whereas interface B has ab() method with return type int
// this conflict will give compile error
// it can be resolved if we change the return type of ab() in either A or B

package example15;

class C implements A, B {

	public void ab() {

	}

}
