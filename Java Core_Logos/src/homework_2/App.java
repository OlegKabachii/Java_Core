package homework_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int val1 = getRandom(1, 10);
		int val2 = getRandom(10, 20);
		String[] materials = { "Skin", "Alcantara" };

		List list = new ArrayList();
		try {
			list.add(new Car(getRandom(100, 500), getRandom(2000, 2020),
					new SteeringWheel(getRandom(40, 60), materials[getRandom(0, 2)]), new Engine(getRandom(4, 12))));

		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Menu:");
			System.out.println("1. View all data");
			System.out.println("2.Set object");

			int menuNumber = scan.nextInt();
			if (menuNumber == 1) {
				System.out.println(list);
			}
			if (menuNumber == 2) {
				list.add(new Car(500, 2020, new SteeringWheel(50, "Skin"), new Engine(12)));
				System.out.println(list);
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
