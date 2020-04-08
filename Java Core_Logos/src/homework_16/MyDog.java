package homework_16;

import java.io.Serializable;

public class MyDog extends Animal implements Serializable {

	private String dogName;
	private int dogAge;
	private String dogBreed;

	public MyDog() {
	};

	public MyDog(String dogName, int dogAge, String dogBreed) {
		super();
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.dogBreed = dogBreed;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	@Override
	public String toString() {
		return "MyDog [dogName=" + dogName + ", dogAge=" + dogAge + ", dogBreed=" + dogBreed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dogAge;
		result = prime * result + ((dogBreed == null) ? 0 : dogBreed.hashCode());
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDog other = (MyDog) obj;
		if (dogAge != other.dogAge)
			return false;
		if (dogBreed == null) {
			if (other.dogBreed != null)
				return false;
		} else if (!dogBreed.equals(other.dogBreed))
			return false;
		if (dogName == null) {
			if (other.dogName != null)
				return false;
		} else if (!dogName.equals(other.dogName))
			return false;
		return true;
	}

	public void myMethod(String s, int i) {
		for (int temp = 0; temp < i; temp++) {
			System.out.println(s + this.dogName + " !");
		}
	}

	public void myMethod(String s) {
		System.out.println(s + this.dogName + " !");
	}
}
