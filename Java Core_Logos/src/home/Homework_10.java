package home;

import java.util.Scanner;

public class Homework_10 {
// task 1
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String entered = s.nextLine();
		StringBuffer word = new StringBuffer(entered);
		if (entered.length() == 5) {
			if (entered.equalsIgnoreCase(word.reverse().toString())) {
				System.out.println(entered + "- паліндромом");
			}
		} else {
			throw new Exception("wrong input");
		}

	}
}
