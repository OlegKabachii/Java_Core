package homework_17;

public class App {

	public static void main(String[] args) {
		Number arr[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		Collection colect = new Collection(arr);

		Iterator iterator = colect.createForward();
		while (iterator.hasNext())
			iterator.next();

		System.out.println();
		Iterator iterator1 = colect.createBackward();
		while (iterator1.hasNext())
			iterator1.next();

		System.out.println();
		Iterator iterator2 = colect.createAnonymous();
		while (iterator2.hasNext())
			iterator2.next();

		System.out.println();
		Iterator iterator3 = colect.createLocal();
		while (iterator3.hasNext())
			iterator3.next();

		System.out.println();
		Iterator iterator4 = new Collection.staticIterator();
		while (iterator4.hasNext())
			iterator4.next();

	}
}
