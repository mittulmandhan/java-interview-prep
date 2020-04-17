package example3;

abstract public class Vehicle {
	String msg;

	Vehicle(String msg) {
		this.msg = msg;
	}

	void display() {
		System.out.println(msg);
	}

}