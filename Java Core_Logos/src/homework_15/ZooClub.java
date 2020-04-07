package homework_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	private Map<Person, List<Animal>> map = new HashMap();

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	public void addMember() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = scan.next();

		System.out.println("Enter age: ");
		int age = scan.nextInt();

		map.put(new Person(name, age), new ArrayList<>());
	}

	public void addPet() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Member's name: ");
		String name = scan.next();

		System.out.println("Enter Pet's type: ");
		String type = scan.next();

		System.out.println("Enter Pet's name: ");
		String petName = scan.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				next.getValue().add(new Animal(type, petName));
			}
		}
	}

	public void deletePet() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Member's name: ");
		String name = scan.next();

		System.out.println("Enter Pet's name: ");
		String petName = scan.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				Iterator<Animal> iterator2 = next.getValue().iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getPetName().equals(petName)) {
						iterator2.remove();
					}
				}
			}
		}
	}

	public void deleteMember() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Member's name: ");
		String name = scan.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				iterator.remove();
			}
		}
	}

	public void deletePetType() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Pet's type: ");
		String type = scan.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();

			Iterator<Animal> iterator2 = next.getValue().iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getType().equals(type)) {
					iterator2.remove();
				}
			}
		}
	}

	public void Show() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		int counter = 0;

		while (iterator.hasNext()) {
			counter++;
			Person key = iterator.next().getKey();
			System.out.println(counter + ".\n" + key);
			System.out.println(map.get(key));
		}
	}
}
