package homework;

import java.util.Scanner;

public class RunnableThread implements Runnable{

	private int time;

	public RunnableThread(int time) {
		this.time = time;
	}

	@Override
	public synchronized void run() {	
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEnter quntity of numbers: ");

		int quantity = scanner.nextInt();

		System.out.print("Runnable: ");

		for (int i = quantity; i > 0; i--) {
			System.out.print(Math.round(Math.pow((1 + Math.sqrt(5)) / 2, i) / Math.sqrt(5)) + " ");
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
