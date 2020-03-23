package homework13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {
	private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();
	private static ArrayList<Faction> factions = new ArrayList<>();

	private VerkhovnaRada() {
	}

	public static VerkhovnaRada getVerkhovnaRada() {
		return verkhovnaRada;
	}

	public static ArrayList<Faction> getFactionArray() {
		return factions;
	}

	public void addFaction() {
		System.out.println("Enter name of faction: ");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();
		getFactionArray().add(new Faction(inputFactionName));
		System.out.println("Added");
	}

	public void deleteFaction() {
		System.out.println("Enter name of faction: ");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				factionIterator.remove();
				System.out.println("Deleted");
			}
		}
	}

	public void showAllFaction() {
		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			System.out.println(factionIterator.next());
		}
	}

	public void showFactionByName() {
		System.out.println("Enter name of faction:");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				System.out.println(tempFaction);
			}
		}
	}

	public void addDeputyToFaction() {
		System.out.println("Enter name of faction: ");
		Scanner scanner = new Scanner(System.in);
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				tempFaction.addDeputy();
			}
		}
	}

	public void deleteDeputyFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				tempFaction.deleteDeputy();
			}
		}
	}

	public void showAllGraftersFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				tempFaction.outputAllGrafter();
			}
		}
	}

	public void findTheBestGrafterFromRaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				tempFaction.outputBiggestGrafter();
			}
		}
	}

	public void showAllDeputysFromFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of faction: ");
		String inputFactionName = scanner.next();

		Iterator<Faction> factionIterator = getFactionArray().iterator();

		while (factionIterator.hasNext()) {
			Faction tempFaction = factionIterator.next();
			if (tempFaction.getName().equals(inputFactionName)) {
				tempFaction.outputAllDeputies();
			}
		}
	}
}
