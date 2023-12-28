package polymorphism_programs;

class Vehicle{
	void wheels() {
		System.out.println("Mode of transportation");
	}
}

class Bike extends Vehicle{
	void wheels() {
		System.out.println("2-wheels");
	}
}

class Auto extends Vehicle{
	void wheels() {
		System.out.println("3-wheels");
	}
}

public class Driver2 {
	
	public void noOfWheels(Vehicle v) {
		v.wheels();
	}
	public static void main(String[] args) {
		Bike b1=new Bike();
		Driver2 d1=new Driver2();
		d1.noOfWheels(b1);
		
		Auto a=new Auto();
		d1.noOfWheels(a);
		
		Vehicle v1=new Vehicle();
		d1.noOfWheels(v1);
	}
}