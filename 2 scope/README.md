# Scope Of A Variable


### There are 3 levels of scope of a variable: ###

- Class Level
- Instance Level
- Local Level

----

- ### Class Level: 
Static variables have class level scope.
Static variables must be declared outside all methods but inside class.
These are initialized by static block.

- ### Instance Level:
These are the non-static variables declared outside all methods but inside class.
Instance variables are initialized by constructors.

- ### Local Level:
These are the variables declared inside some method and have local scope.
Local Variables can't be static.
These variables are not automatically initialized by constructors or static block with a default value hence we need to initialize them before using them.

````
class Scope {
	//x has class level scope
	static int x=10;
	//y has instance level scope
	int y;
	
	public int copy() {
		//z has local level 
		int z=21;
		return z;
	}
	
	
	
	public static void main(String args[]) {
		Scope obj=new Scope();
		
		System.out.println(x);
		System.out.println(obj.y);
		System.out.println(obj.copy());
	}
};
````


