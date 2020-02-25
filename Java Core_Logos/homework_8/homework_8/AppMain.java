package homework_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		consoleMenu();
	}

	public static void consoleMenu() throws WrongInputConsoleParametersException {
		String entered;
		int menuNum = 0;
		Months[] month = Months.values();
		Seasons[] seasons = Seasons.values();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		while (true) {
			System.out.println("Enter which month:");
			entered = scan.next().toUpperCase();
			while (true) {
				boolean checkEntered = true;
				for (Months m : month) {
					if (m.name().equals(entered)) {
						checkEntered = false;
					}}
					if (checkEntered == true) {
						String message = "Wrong Entered";
						throw new WrongInputConsoleParametersException(message);
					}
					System.out.println();
					System.out.println("-MENU-");
					System.out.println("1 - Check for a month");
//		 Перевірити чи є такий місяць 
					System.out.println("2 - Output all the months with the same time of year");
//		 Вивести всі місяці з такою ж порою року
					System.out.println("3 - Print all months that have the same number of days");
//		 Вивести всі місяці які мають таку саму кількість днів
					System.out.println("4 - Displays all months that have fewer days");
//		 Вивести на екран всі місяці які мають меншу кількість днів
					System.out.println("5 - Display all months that have more days");
//		 Вивести на екран всі місяці які мають більшу кількість днів
					System.out.println("6 - Display the next time of year");
//		 Вивести на екран наступну пору року
					System.out.println("7 - Display the previous time of year");
//		 Вивести на екран попередню пору року
					System.out.println("8 - Display all months that have an even number of days ");
//		 Вивести на екран всі місяці які мають парну кількість днів
					System.out.println("9 - Display all months that have an odd number of days ");
//		 Вивести на екран всі місяці які мають непарну кількість днів
					System.out.println("10 - Display or month entered from the console has an even number of days");
//		 Вивести на екран чи введений з консолі місяць має парну кількість днів
					System.out.println("0 - EXIT");
				
				try {
				boolean checkNumEntered = true;
				menuNum = scan2.nextInt();
				checkNumEntered = false;
					}
				catch (InputMismatchException e) {
					System.out.println("Try again(incorrect type of data)");
					}

				switch (menuNum) {
				case 1: {
					String monthFromScan = entered;
					checkMonth(month, monthFromScan);
					break;

				}
				case 2: {
					String monthFromScan = entered;
					getSeasons(entered);
					break;
				}
				case 3: {
					int count = getDays(entered);
					for (Months m : Months.values()) {
						if (m.days == count) {
							System.out.println(m);
						}
					}
					break;
				}
				case 4: {
					int count = getDays(entered);
					for (Months m : Months.values()) {
						if (m.days > count) {
							System.out.println(m);
						}
					}
					break;
				}
				case 5: {
					int count = getDays(entered);
					for (Months m : Months.values()) {
						if (m.days < count) {
							System.out.println(m);
						}
					}
					break;
				}
				case 6: {
					Months m = Months.valueOf(entered);
					Seasons s = m.getSeason();
					int i = s.ordinal() + 1;
					System.out.println(seasons[i]);
				}
					break;
				case 7: {
					Months m = Months.valueOf(entered);
					Seasons s = m.getSeason();
					int i = s.ordinal() - 1;
					System.out.println(seasons[i]);
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

	private static boolean checkMonth(Months[] months, String monthFromScan) {
		boolean isExist = false;
		for (Months m : months) {
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

	public static Seasons getSeasons(String entered) {
		switch (entered) {
		case "DECEMBER":
		case "JANUARY":
		case "FEBRUARY":
			System.out.println("DECEMBER, JANUARY, FEBRUARY - WINTER");
			return Seasons.WINTER;
		case "MARCH":
		case "APRIL":
		case "MAY":
			System.out.println("MARCH, APRIL, MAY - SPRING");
			return Seasons.SPRING;
		case "JUNE":
		case "JULY":
		case "AUGUST":
			System.out.println("JUNE, JULY, AUGUST - SUMMER");
			return Seasons.SUMMER;
		case "SEPTEMBER":
		case "OKTOBER":
		case "NOVEMBER":
			System.out.println("SEPTEMBER, OKTOBER, NOVEMBER - AUTUMN");
			return Seasons.AUTUMN;

		}
		return null;
	}

	public static int getDays(String entered) {
		switch (entered) {
		case "DECEMBER":
		case "JANUARY":
		case "MARCH":
		case "MAY":
		case "JULY":
		case "AUGUST":
		case "OKTOBER":
			return 31;
		case "APRIL":
		case "JUNE":
		case "SEPTEMBER":
		case "NOVEMBER":
			return 30;
		case "FEBRUARY":
			return 28;
		}

		return 0;
	}
}
