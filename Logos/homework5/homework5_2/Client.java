package homework5_2;

public class Client {
	private String name;
	private Data data;
	private Data dataOfEnter;
	
	public Client(String name, Data data) {
		super();
		this.name = name;
		this.data = data;
	}
	public Client(String name, Data data , Data dataOfEnter) {
		super();
		this.name = name;
		this.data = data;
		this.dataOfEnter = dataOfEnter;
	}

}
