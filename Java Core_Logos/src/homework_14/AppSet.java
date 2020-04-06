package homework_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {
		
		Set <City> setCity = new HashSet <>();
		setCity.add(new City("Lviv", 1256));
		setCity.add(new City("Chernivtsi", 1408));
		setCity.add(new City("Kyiv", 482));
		setCity.add(new City("Odessa", 1415));
		
		System.out.println("<UnSort>");
		for (City city : setCity) {
			System.out.println(city);
		}
		
		List <City> cityList = new ArrayList<>(setCity);
		Collections.sort(cityList);
		
		System.out.println("Comparable Sort List");
		for (City city : cityList) {
			System.out.println(city);
		}
		Collections.sort(cityList, new CityComparator());
		 
		System.out.println("Comparator Sort List");
		for (City city : cityList) {
			System.out.println(city);
		}
	}

}
