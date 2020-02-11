package homeWork3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		String day;
		String sunday = "Sunday", monday = "Monday", tuesday = "Tuesday", wednesday = "Wednesday",
				thursday = "Thursday", friday = "Friday", suturday = "Suturday";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter day: ");
		day = s.nextLine();
		
		switch(day) {
		case "Sunday" :
			System.out.println("Rest");
			break;
		case "Monday" :
			System.out.println("Work");
			break;
		case "Tuesday" :
			System.out.println("Work");
			break;
		case "Wednesday" :
			System.out.println("Work");
			break;
		case "Thursday" :
			System.out.println("Work");
			break;
		case "Friday" :
			System.out.println("Work");
			break;
		case "Suturday" :
			System.out.println("Party");
			break;
		}
		
		
	}

}
