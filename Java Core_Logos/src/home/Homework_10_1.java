package home;

import java.util.Arrays;
import java.util.Iterator;

//task 2
public class Homework_10_1 {
	public static void main(String[] args) {
		String[] letters = { "a", "i", "o", "e", "u" };
		String line = "Back in the back Of a Cadillac Number one with a bullet";

		for (int i = 0; i < letters.length; i++) {
			String change = line.toLowerCase().replace(letters[i], "-");
			line = change;
		}
		System.out.println(line);
//		-----------------------------------------------------------------
// task 3
		String line2 = "Back in the back Of a Cadillac Number one with a bullet";
		String[] words = line2.split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			count++;
		}
		System.out.println(line2 + " - " + count + " words");

//		------------------------------------------------------------------
// task 4 do not work	
		String[] line3 = { "back", "in", "the", "back", "of", "a", "cadillac", "number", "one", "with", "a", "bullet" };
		StringBuffer sb = new StringBuffer();
		Arrays.sort(line3);
		for (int i = 0; i < line3.length; i++) {
			for (int j = 0; j < line3.length; j++) {
				if (line3[i] == line3[j] + 1) {
					sb.append(line3[i]);
				}
			}
		}
		System.out.println(Arrays.toString(line3));
		System.out.println(sb);
	}
}
