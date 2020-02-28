package homework2_3;

public class Rectangle {
	private int length = 1;
	private int width = 2;
	
	public Rectangle() {

	}

	public Rectangle(int newWidth, int newlength) {
		this.setWidth(newWidth);
		this.setLength(newlength);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return  width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getArea () {
		return "Площа прямокутника = " +length*width;
	}
	public String getPerimeter(){
		return "Периметр прямокутника = " + (width + length) * 2;
	}
	
	
	
	
	
	
	
}
