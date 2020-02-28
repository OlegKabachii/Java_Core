package homework2_3;

public class Circle {
	private double radius = 1.1;
	private double diameter = 2.2;

	public Circle() {

	}

	public Circle(double newRadius, double newDiameter) {
		this.setRadius(newRadius);
		this.setDiameter(newDiameter);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getAria() {

		return "Площа кола = " + (3.14 * (getDiameter()*getDiameter())/4);
	}
	public String getLength() {
		return "Довжина кола = " + 2 * 3.14 * getRadius();
	}
	
	
}
