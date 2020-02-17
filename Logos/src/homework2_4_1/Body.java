package homework2_4_1;

public class Body {
	private String color;
	private String model;
	
	@Override
	public String toString() {
		return "Body [color=" + color + ", model=" + model + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void miniCar() {
		 String color = "White";
		 String model = "Universal";
	}
	public void maxiCar() {
		 String color = "lightGreen";
		 String model = "Jeep";
	}
}
