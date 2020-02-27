import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Homework_11 {

	public static void main(String[] args) {
		Random r = new Random();
		Integer [] numbers = new Integer [20];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(100);
		}
		Arrays.parallelSort(numbers);
		System.out.println(Arrays.deepToString(numbers));
		 Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(numbers));
	}
}
