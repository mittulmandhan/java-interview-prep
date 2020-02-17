package case1;

// Here we are using super keyword to access immediate parent class' instance variables
class Animal {
	String color="white";
}

class Dog extends Animal {
	String color="black";
	
	void display() {
		System.out.println("Dog is "+color);
		System.out.println("Animal is "+super.color);
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
	}
}
