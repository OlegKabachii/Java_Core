package homework_2;

public class Engine {
	private int countOfCylinders;

	public Engine(int countOfCylinders) {
		super();
		this.countOfCylinders = countOfCylinders;
	}

	public int getCountOfCylinders() {
		return countOfCylinders;
	}

	public void setCountOfCylinders(int countOfCylinders) {
		this.countOfCylinders = countOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [countOfCylinders=" + countOfCylinders + "]";
	}
	
	
}
