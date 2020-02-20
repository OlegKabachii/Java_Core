package homework_7;

import java.util.Random;

public abstract class Airplane extends Airplane_Control {
	private int length = 100;
	private int width = 40;
	private int vekt = 100;

	public Airplane(int length, int width, int vekt) {
		super();
		this.length = length;
		this.width = width;
		this.vekt = vekt;
	}

	void startEngines() {
		int min = 20;
		int max = 88;
		int diff = max - min;
		Random random = new Random();
		int hoursToReady = random.nextInt(diff + 1) + min;
		System.out.println("До готовності залишилося : " + hoursToReady + "хв.");
	}

	void AirplaneTakeOff() {
		double range = Math.random() * 1000;
		System.out.println("Літак пролетить : " + Math.floor(range) + "км");
	}

	void LandingOfTheAirplane() {
		System.out.println("Літак йде на посадку");
	}
}
