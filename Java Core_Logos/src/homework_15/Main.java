package homework_15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ZooClub zooClub = new ZooClub();

		while (true) {
			int choice = menu();
			switch (choice) {

			case 1: {
				System.out.println("1 - Add Club's Member");
				zooClub.addMember();
				break;
			}
			case 2: {
				System.out.println("2 - Add pet to Member");
				zooClub.addPet();
				break;
			}
			case 3: {
				System.out.println("3 - Delete pet from Member");
				zooClub.deletePet();
				break;
			}
			case 4: {
				System.out.println("4 - Delete Club's Member");
				zooClub.deleteMember();
				break;
			}
			case 5: {
				System.out.println("5 - Delete a specific animal from all Members");
				zooClub.deletePetType();
				break;
			}
			case 6: {
				System.out.println("6 - Show ZooClub");
				zooClub.Show();
				break;
			}
			case 0: {
				System.out.println("0 - Exit");
				System.exit(0);
			}
			}
		}

	}

	public static int menu() {
		System.out.println("-Menu-");

		System.out.println("1 - Add Club's Member");
		System.out.println("2 - Add pet to Member");
		System.out.println("3 - Delete pet from Member");
		System.out.println("4 - Delete Club's Member");
		System.out.println("5 - Delete a specific animal from all Members");
		System.out.println("6 - Show ZooClub");
		System.out.println("0 - Exit");
		System.out.println();
		System.out.println("Enter your choice: ");

		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}
