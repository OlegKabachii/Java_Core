package homework;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class App {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("Object.txt");

		Employee id1 = new Employee("Eva", 001, 100);

		Methods.serialize(file, (Serializable) id1);
		
		System.out.println(Methods.deserealize(file));

		Collection<Employee> myCollection = new ArrayList<>();
		
		myCollection.add(id1);
		myCollection.add(new Employee("Puma", 002, 200));
		myCollection.add(new Employee("Ljalja", 003, 300));

		System.out.println("Before: " + myCollection);

		File file2 = new File("Collection.txt");
		Methods.serialize(file2, (Serializable) myCollection);
		System.out.println("After: " + Methods.deserealize(file2));
	}

}
