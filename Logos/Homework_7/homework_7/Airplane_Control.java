package homework_7;

import java.util.Random;

public class Airplane_Control {

	void moveUp() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("–ухаЇмось вверх на : " + kilometers + "км");
	}

	void moveDown() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("–ухаЇмось вниз на : " + kilometers + "км");
	}

	void moveLeft() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("–ухаЇмось вл≥во на : " + kilometers + "км");
	}

	void moveRight() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("–ухаЇмось вправо на : " + kilometers + "км");
	}
}
