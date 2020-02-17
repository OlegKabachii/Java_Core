package homework2_4;

public class RobotDancer extends Robot {
	private String name = "RobotDancer";
	private String work = "я просто танцюю";

	public RobotDancer() {

	}

	public RobotDancer(String newWork, String newName) {
		this.setWork(newWork);
		this.setName(newName);
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
