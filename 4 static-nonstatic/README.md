# Static and Non-static Calling


![alt text](https://github.com/mittulmandhan/java-interview-prep/blob/master/img/StaticNonStaticCalling/Static_vs_Nonstatic.png)


## Example 1:
````
class StaticNonstaticCalling1 {
	static int x=10;
	int y=23;
	static void ab() {
		// static method ab() is calling static variable x
		// static method ab() is calling non-static variable y
		StaticNonstaticCalling1 obj=new StaticNonstaticCalling1();
		System.out.println(x+obj.y);
	}
	
	public static void main(String args[]) {
		// static main method is calling static ab method
		ab();
	}
};
````

## Example 2:
````
class StaticNonstaticCalling2 {
	static int x=10;
	int y=23;
	void ab() {
		// Non-static method ab() is calling static variable x
		// Non-static method ab() is calling non-static variable y
		System.out.println(x+y);
	}
	
	public static void main(String args[]) {
		// static main method is calling Nonstatic ab method
		StaticNonstaticCalling2 a=new StaticNonstaticCalling2();
		a.ab();
	}
};
````
