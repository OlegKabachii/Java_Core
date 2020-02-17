package homework2_4;

public class Robot {
	private String work = "я просто працюю";
	private String name = "Robot";
	
	public Robot() {
		
	}
	public Robot(String newWork, String newName) {
		this.work = newWork;
		this.name = newName;
	}
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String work() {
		return "Я " + getName() + " - " + getWork();
	}
	
}
