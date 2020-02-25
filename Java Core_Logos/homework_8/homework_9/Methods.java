package homework_9;

import java.io.IOException;

public class Methods {
	public static void main(String[] args) throws MyException  {
		System.out.println(addition(1, 1));
		System.out.println(subtraction(1, 1));
		System.out.println(multiplication(1, 1));
		System.out.println(division(1, 0));
	}

	public static int addition(int a, int b) throws MyException {
		checkToException(a, b);
		return a + b;
	}

	public static int subtraction(int a, int b) throws MyException {
		checkToException(a, b);
		return a - b;
	}

	public static int multiplication(int a, int b) throws MyException {
		checkToException(a, b);
		return a * b;
	}

	public static int division(int a, int b) throws MyException {
		checkToException(a, b);
		return a / b;
	}

	public static void checkToException(int a, int b) throws MyException {

		if ((a < 0) & (b < 0)) {
			throw new IllegalArgumentException();
		}
		if ((a == 0) & (b != 0)) {
			throw new ArithmeticException();
		}
		if ((a != 0) & (b == 0)) {
			throw new ArithmeticException();
		}
		if ((a == 0) & (b == 0)) {
			throw new IllegalArgumentException();
		}
		if ((a > 0) & (b > 0)) {
			String message = "checkToException";
			throw new MyException(message);
		}
	}

}