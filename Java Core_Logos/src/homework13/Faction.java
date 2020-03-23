package homework13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {

	String name;

	List<Deputy> deputis = new ArrayList<>();

	public Faction(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Deputy> getDeputies() {
		return deputis;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeputies(List<Deputy> deputies) {
		this.deputis = deputies;
	}

	@Override
	public String toString() {
		return "Faction [name=" + name + ", deputies=" + deputis + "]";
	}

	public void addDeputy() {

		Scanner scan = new Scanner(System.in);
		int weight;
		int height;
		String lastName;
		String firstName;
		int age;
		boolean grafter;

		System.out.println("Enter Weight: ");
		weight = scan.nextInt();
		System.out.println("Enter Heigth: ");
		height = scan.nextInt();
		System.out.println("Enter lastName: ");
		lastName = scan.next();
		System.out.println("Enter firstName: ");
		firstName = scan.next();
		System.out.println("Enter age: ");
		age = scan.nextInt();
		System.out.println("Enter if grafter: ");
		grafter = scan.hasNext();
		deputis.add(new Deputy(weight, height, lastName, firstName, age, grafter));
	}

	public void deleteDeputy() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter last name which you want delete: ");
		String lastName = scan.next();

		boolean flag = false;

		Iterator<Deputy> iterator = deputis.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getLastName().equalsIgnoreCase(lastName)) {
				iterator.remove();
			}
		}
	}

	public void outputAllGrafter() {

		System.out.println(name + " Grafter: ");
		Iterator<Deputy> iterator = deputis.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().isGrafter())
				System.out.println(iterator.next());
		}
	}
		public Deputy outputBiggestGrafter() {
			return Collections.max(deputis, new DeputySizeOfBribeComparator());
		}

	public void outputAllDeputies() {

		System.out.println("Deputis of faction: ");
		for (Deputy d : deputis)
			System.out.println(d);
	}

	public void clearAll() {
		deputis.clear();
	}
}
