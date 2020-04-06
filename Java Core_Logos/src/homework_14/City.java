package homework_14;

public class City implements Comparable <City> {
	private String nameOfCity;
	private int yearOfFounded;

	public City(String nameOfCity, int yearOfFounded) {
		super();
		this.nameOfCity = nameOfCity;
		this.yearOfFounded = yearOfFounded;
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	public int getYearOfFounded() {
		return yearOfFounded;
	}

	public void setYearOfFounded(int yearOfFounded) {
		this.yearOfFounded = yearOfFounded;
	}

	@Override
	public String toString() {
		return "City [nameOfCity=" + nameOfCity + ", yearOfFounded=" + yearOfFounded + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfCity == null) ? 0 : nameOfCity.hashCode());
		result = prime * result + yearOfFounded;
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
		City other = (City) obj;
		if (nameOfCity == null) {
			if (other.nameOfCity != null)
				return false;
		} else if (!nameOfCity.equals(other.nameOfCity))
			return false;
		if (yearOfFounded != other.yearOfFounded)
			return false;
		return true;
	}

	@Override
	public int compareTo(City o) {
		
		return this.nameOfCity.compareTo(o.getNameOfCity());
	}

}
