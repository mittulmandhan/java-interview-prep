package case2;

// Here we are using super keyword to invoke super class' method
class Person {
	void me() {
		System.out.println("I am a Person.");
	}
};

class Student extends Person {
	void me() {
		System.out.println("I am a Student.");
	}
	
	void display() {
		me();
		
		super.me();
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
	}
}
