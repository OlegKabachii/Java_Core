package homework_7;

import java.util.Random;

public class Airplane_Control {

	void moveUp() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("�������� ����� �� : " + kilometers + "��");
	}

	void moveDown() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("�������� ���� �� : " + kilometers + "��");
	}

	void moveLeft() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("�������� ���� �� : " + kilometers + "��");
	}

	void moveRight() {
		int min = 0;
		int max = 1000;
		int diff = max - min;
		Random random = new Random();
		int kilometers = random.nextInt(diff + 1) + min;
		System.out.println("�������� ������ �� : " + kilometers + "��");
	}
}
