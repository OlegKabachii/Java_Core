package homework_2;

public class Car {
	private int power;
	private int year;
	private SteeringWheel steeringWheel;
	private Engine engine;
	public Car(int power, int year, SteeringWheel steeringWheel, Engine engine) {
		super();
		this.power = power;
		this.year = year;
		this.steeringWheel = steeringWheel;
		this.engine = engine;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}
	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [power=" + power + ", year=" + year + ", steeringWheel=" + steeringWheel + ", engine=" + engine
				+ "]";
	}
	
	
}
