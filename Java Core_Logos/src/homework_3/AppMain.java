package homework_3;

import java.util.ArrayList;

public class AppMain {
	public static void main(String[] args) {
		ArrayList <String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		System.out.println(colors.size());
		extracted(colors);
		System.out.println();
		System.out.println(colors.indexOf("Yellow"));
		System.out.println(colors.remove(2));
		System.out.println(colors.remove(0));
		extracted(colors);

}
	public static void extracted(ArrayList<String> colors) {
		for (int i = 0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
			
		}
		System.out.println();
	}
	

}