package homework2_4;

public class CoffeRobot extends Robot {
	private String name = "CoffeRobot";
	private String work = "я варю каву";

	public CoffeRobot() {

	}

	public CoffeRobot(String newWork, String newName) {
		this.setWork(newWork);
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}
