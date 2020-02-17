package homework2_4_1;

public class SteeringWheel {
	private String model;
	private int size;

	@Override
	public String toString() {
		return "SteeringWheel [model=" + model + ", size=" + size + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void truck() {
		String model = "Big";
		int size = 80;
	}

	public void car() {
		String model = "Small";
		int size = 60;
	}
}
