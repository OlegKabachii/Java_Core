package homework2_4_1;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Jeep", 200, 1000.1, new Wheel(), new Body(), new SteeringWheel());

		System.out.println(car.toString());
		System.out.println();
		car.carForMe();
		System.out.println(car);
	}

}
