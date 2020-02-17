package homeWork1_1;

public class HomeWork {
	public static void main(String[] args) {
		byte a = 1;
		short b = 1;
		int c = 1;
		long d = 1;

		float e = 0.0f;
		double f = 1.1;

		char g = 'a';
		boolean j = false;

		System.out.println("Byte - " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
		System.out.println("Short - " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
		System.out.println("Character - " + (int) Character.MIN_VALUE + " - " + (int) Character.MAX_VALUE);
		System.out.println("Integer - " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
		System.out.println("Long - " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
		System.out.println("Float - " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
		System.out.println("Double - " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
