package homework5_1;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new Frog();
		Amphibia frog = (Amphibia) obj;
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.sleep();

	}

}
