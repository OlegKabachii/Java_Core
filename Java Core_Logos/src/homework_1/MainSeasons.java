package homework_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSeasons {
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		consoleMenu();
	}

	public static void consoleMenu() throws WrongInputConsoleParametersException {

		ArrayList<Months> mon = new ArrayList();
		mon.add(Months.DECEMBER);
		mon.add(Months.JUNUARY);
		mon.add(Months.FEBRUARY);
		mon.add(Months.MARCH);
		mon.add(Months.APRIL);
		mon.add(Months.MAY);
		mon.add(Months.JUNE);
		mon.add(Months.JULY);
		mon.add(Months.AUGUST);
		mon.add(Months.SEPTEMBER);
		mon.add(Months.OKTOBER);
		mon.add(Months.NOVEMBER);

		ArrayList<Seasons> seas = new ArrayList();
		seas.add(Seasons.WINTER);
		seas.add(Seasons.SPRING);
		seas.add(Seasons.SUMMER);
		seas.add(Seasons.AUTUMN);

		String entered;
		int menuNum = 0;
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		while (true) {
			System.out.println("Enter which month:");
			entered = scan.next().toUpperCase();
			while (true) {
				boolean checkEntered = true;
				for (Months m : mon) {
					if (m.name().equals(entered)) {
						checkEntered = false;
					}
				}
				if (checkEntered == true) {
					String message = "Wrong Entered";
					throw new WrongInputConsoleParametersException(message);
				}
				System.out.println();
				System.out.println("-MENU-");
				System.out.println("1 - Check for a month");
//			 Перевірити чи є такий місяць 
				System.out.println("2 - Output all the months with the same time of year");
//			 Вивести всі місяці з такою ж порою року
				System.out.println("3 - Print all months that have the same number of days");
//			 Вивести всі місяці які мають таку саму кількість днів
				System.out.println("4 - Displays all months that have fewer days");
//			 Вивести на екран всі місяці які мають меншу кількість днів
				System.out.println("5 - Display all months that have more days");
//			 Вивести на екран всі місяці які мають більшу кількість днів
				System.out.println("6 - Display the next time of year");
//			 Вивести на екран наступну пору року
				System.out.println("7 - Display the previous time of year");
//			 Вивести на екран попередню пору року
				System.out.println("8 - Display all months that have an even number of days ");
//			 Вивести на екран всі місяці які мають парну кількість днів
				System.out.println("9 - Display all months that have an odd number of days ");
//			 Вивести на екран всі місяці які мають непарну кількість днів
				System.out.println("10 - Display or month entered from the console has an even number of days");
//			 Вивести на екран чи введений з консолі місяць має парну кількість днів
				System.out.println("0 - EXIT");

				try {
					boolean checkNumEntered = true;
					menuNum = scan2.nextInt();
					checkNumEntered = false;
				} catch (InputMismatchException e) {
					System.out.println("Try again(incorrect type of data)");
				}

				switch (menuNum) {
				case 1: {

					boolean check = checkMonth(mon, entered);
					if (!check) {
						System.out.println("Month doesn`t exist");
					}
					break;
				}
				case 2: {
					Months m = Months.valueOf(entered);
					Seasons s = m.getSeason();
					System.out.println("Season is - " + s);
					for (Months mn : mon) {
						if (mn.getSeason().equals(s)) {
							System.out.println("Month of this season is - " + mn);
						}
					}
					break;
				}
				case 3: {
					Months m = Months.valueOf(entered);
					for (Months mn : mon) {
						if (m.getDays() == mn.getDays()) {
							System.out.println("This months have the same count - " + mn);
						}
					}
					break;
				}
				case 4: {
					Months m = Months.valueOf(entered);
					for (Months mn : mon) {
						if (m.getDays() > mn.getDays()) {
							System.out.println("This months have less count - " + mn);
						}
					}
					break;
				}
				case 5: {
					Months m = Months.valueOf(entered);
					for (Months mn : mon) {
						if (m.getDays() < mn.getDays()) {
							System.out.println("This months have bigger count - " + mn);
						} else {
							System.out.println("Its month have max days");
							break;
						}
					}
					break;
				}
				case 6: {
					Months m = Months.valueOf(entered);
					Seasons s = m.getSeason();
					int i = s.ordinal() + 1;
					System.out.println(seas.get(i));
				}
					break;
				case 7: {
					Months m = Months.valueOf(entered);
					Seasons s = m.getSeason();
					int i = s.ordinal() - 1;
					System.out.println(seas.get(i));
				}
					break;
				case 8: {
					for (Months m : Months.values()) {
						int p = m.days % 2;
						if (p == 0) {
							System.out.println(m);
						}
					}
					break;
				}
				case 9: {
					for (Months m : Months.values()) {
						int p = m.days % 2;
						if (p == 1) {
							System.out.println(m);
						}
					}
					break;
				}
				case 10: {
					for (Months m : Months.values()) {
						int p = m.days % 2;
						if (p == 0) {
							System.out.println("Even number");
							break;
						} else {
							System.out.println("Odd number");
							break;
						}
					}
					break;
				}
				case 0: {
					System.out.println("Closed!");
					break;
				}
				}
				break;
			}
		}
	}

	private static boolean checkMonth(ArrayList<Months> mon, String monthFromScan) {
		boolean isExist = false;
		for (Months m : mon) {
			if (m.name().equals(monthFromScan)) {
				System.out.println("Month " + monthFromScan + " is exist !");
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("Month " + monthFromScan + " is not exist !");
		}
		return isExist;
	}

	private static boolean checkSeason(ArrayList<Seasons> seas, String seasonFromScan) {
		boolean isExist = false;
		for (Seasons s : seas) {
			if (s.name().equals(seasonFromScan)) {
				System.out.println("Season exist");
				isExist = true;
			}
		}
		return isExist;
	}
}
