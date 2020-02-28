package homework2_4_1;

public class Car {
	private String type;
	private int speed;
	private double price;
	private Wheel wheel;
	private SteeringWheel steeringWheel;
	private Body body;

	public Car() {}
	public Car(String type, int speed, double price, Wheel wheel, Body body, SteeringWheel steeringWheel) {
		this.type = type;
		this.speed = speed;
		this.price = price;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
		this.body = body;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", speed=" + speed + ", price=" + price + ", wheel=" + wheel + ", \nsteeringWheel="
				+ steeringWheel + ", body=" + body + "]";
	}

	public void carForMe() {
		String type = "OffRoad";
		int speed = 300;
		double price = 1.1;
		wheel.bigCar();
		steeringWheel.car();
		body.maxiCar();
		
	}

}
