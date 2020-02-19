package homework5_1;

public class Main {

	public static void main(String[] args) {

		Amphibia amph = new Frog();
		Amphibia frog = (Amphibia) amph;
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.sleep();

	}

}
