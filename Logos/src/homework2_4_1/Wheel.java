package homework2_4_1;

public class Wheel {
	
	private int width;
	private int heigth;
	private int diameter;
	
	@Override
	public String toString() {
		return "Wheel [width=" + width + ", heigth=" + heigth + ", diameter=" + diameter + "]";
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public void smallCar() {
		int width = 195;
		int heigth = 55;
		int diameter = 17;
	}
	public void bigCar() {
		int width = 275;
		int heigth = 65;
		int diameter = 20;
	}
}
