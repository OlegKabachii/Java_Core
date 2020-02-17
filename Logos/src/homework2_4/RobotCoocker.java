package homework2_4;

public class RobotCoocker extends Robot {
	private String name = "RobotCoocker";
	private String work = "я просто готую";
	
	public RobotCoocker() {

	}

	public RobotCoocker(String newWork, String newName) {
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
