package homework13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean key = true;

		while (key) {
			new App().menu();

			int choise = scanner.nextInt();

			switch (choise) {
			case 1:
				VerkhovnaRada.getVerkhovnaRada().addFaction();
				break;

			case 2:
				VerkhovnaRada.getVerkhovnaRada().deleteFaction();
				break;

			case 3:
				VerkhovnaRada.getVerkhovnaRada().showAllFaction();
				break;

			case 4:
				System.out.println("Enter name of faction: ");
				String inputFactionName = scanner.next();

				ListIterator<Faction> factionIterator = VerkhovnaRada.getFactionArray().listIterator();

				while (factionIterator.hasNext()) {
					Faction tempFaction = factionIterator.next();
					if (tempFaction.getName().equals(inputFactionName)) {
						tempFaction.clearAll();
					}
				}
				break;

			case 5:
				VerkhovnaRada.getVerkhovnaRada().showFactionByName();
				break;

			case 6:
				VerkhovnaRada.getVerkhovnaRada().addDeputyToFaction();
				break;

			case 7:
				VerkhovnaRada.getVerkhovnaRada().deleteDeputyFromFaction();
				break;

			case 8:
				factionIterator = VerkhovnaRada.getFactionArray().listIterator();
				while (factionIterator.hasNext()) {
					Faction tempFaction = factionIterator.next();
					tempFaction.outputAllGrafter();
				}
				break;

			case 9:
				ArrayList<Deputy> theBestGrafters = new ArrayList<>();

				factionIterator = VerkhovnaRada.getFactionArray().listIterator();
				while (factionIterator.hasNext()) {
					Faction tempFaction = factionIterator.next();
					theBestGrafters.add(tempFaction.outputBiggestGrafter());
				}

				System.out.println(Collections.max(theBestGrafters, new DeputySizeOfBribeComparator()));
				break;

			case 10:
				key = false;
				System.out.println("Closed");
				break;
			}
		}
	}

	public void menu() {
		System.out.println("Enter 1: Add new faction!");
		System.out.println("Enter 2: Delete Faction");
		System.out.println("Enter 3: Show all faction");
		System.out.println("Enter 4: Clear selected faction");
		System.out.println("Enter 5: Show selected faction");
		System.out.println("Enter 6: Add deputy to faction");
		System.out.println("Enter 7: Delete deputy from faction");
		System.out.println("Enter 8: Show all grafters");
		System.out.println("Enter 9: Show biggest grafter");
		System.out.println("Enter 10: Exit");
	}
}
