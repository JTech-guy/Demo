public class Car {
	int speed;
	String colour;
	String engine;
	int gear;
	String make;
	String model;
	
	public Car(int speed, String colour, String engine, int gear, String make, String model) {
		this.speed = speed;
		this.colour = colour;
		this.engine = engine;
		this.gear = gear;
		this.make = make;
		this.model = model;		
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
public int getSpeed() {
	return speed;
}
public String getColour() {
	return colour;
}
public String getEngine() {
	return engine;
}
public int getGear() {
	return gear;
}
public String getMake() {
	return make;
}
public String getModel() {
	return model;
}
public String toString() {
	return("The speed of the car is: " + this.getSpeed() + " The colour of the car is: " + this.getColour() + " The engine of the car is: " + this.getEngine() + " The gear of the car is: " + this.getGear() + " The make of the car is: " + this.getMake() + " The model of the car is: " + this.getModel());
}
public static void main(String[] args) {
	 Car Brand = new Car(90, "Red", "V8", 4, "Ferrari", "Aventador");
	 System.out.println(Brand.toString());
}


}
