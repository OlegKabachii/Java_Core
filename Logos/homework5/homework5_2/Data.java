package homework5_2;

public class Data {
	private int  day;
	private int  mounth;
	private int year;
	
	private int dataOfEnter;
	
	
	public Data(int  newDay,  int  newMounth, int newYear) {
		this.day = newDay;
		this.mounth = newMounth;
		this.year = newYear;
	}
	public Data(int  newDay,  int  newMounth, int newYear, int NewDataOfEnter) {
		this.day = newDay;
		this.mounth = newMounth;
		this.year = newYear;
		this.dataOfEnter = NewDataOfEnter;
	}

}
