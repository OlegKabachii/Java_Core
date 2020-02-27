package homework_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int val1 = getRandom(1, 10);
		int val2 = getRandom(1, 10);
		String[] materials = { "Skin", "Alcantara" };
		Car[][] car = new Car[val1][val2];

		try {
			for (int i = 0; i < car.length; i++) {
				for (int j = 0; j < car.length; j++) {
					car[i][j] = new Car(getRandom(100, 500), getRandom(2000, 2020),
							new SteeringWheel(getRandom(40, 60), materials[getRandom(0, 2)]),
							new Engine(getRandom(4, 12)));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Menu:");
			int menuNumber = scan.nextInt();
			System.out.println("1. View all data");
			System.out.println("2.Set object");

			if (menuNumber == 1) {
				System.out.println(Arrays.deepToString(car));
			}
			if (menuNumber == 2) {
				Car original = new Car(500, 2020, new SteeringWheel(50, "Skin"), new Engine(12));
				for (int i = 0; i < car.length; i++) {
					Arrays.fill(car[i], original);
					System.out.println(Arrays.deepToString(car));
				}
			}
		}
	}

	public static int getRandom(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Min > Max");
		}
		Random r = new Random();
		return r.nextInt(max - min) + min;
	}
}
