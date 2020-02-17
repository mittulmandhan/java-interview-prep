package case3;

//Here we are using super keyword to invoke super class' constructor
class Bicycle {
	int startCadence;
	int startSpeed;
	int startGear;
	
	Bicycle(int startCadence, int startSpeed, int startGear) {
		this.startCadence=startCadence;
		this.startSpeed=startSpeed;
		this.startGear=startGear;
	}
};

class MountainBike extends Bicycle {
	int seatHeight;
	
	MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight=startHeight;
	}
	
	void display() {
		System.out.println(seatHeight+" "+startCadence+" "+startSpeed+" "+startGear);
	}
	
	public static void main(String[] args) {
		MountainBike obj=new MountainBike(5, 1, 0, 2);
		obj.display();
	}
}