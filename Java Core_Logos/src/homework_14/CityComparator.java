package homework_14;

import java.util.Comparator;

public class CityComparator implements Comparator<City> {

	@Override
	public int compare(City arg0, City arg1) {
		if (arg0.getNameOfCity().compareTo(arg1.getNameOfCity()) > 0) {
			return 1;
		} else if (arg0.getNameOfCity().compareTo(arg1.getNameOfCity()) < 0) {
			return -1;
		} else {
			if (arg0.getYearOfFounded() > arg1.getYearOfFounded()) {
				return 1;
			} else if (arg0.getYearOfFounded() < arg1.getYearOfFounded()) {
				return -1;
			}
		}
		return 0;
	}
}
