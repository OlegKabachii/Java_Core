package homeWork1_4;

import java.util.Arrays;
import java.util.Random;

/*1.  �� �������� �� ����� ����� 55 �������� ����������� 1 3 5 7 9 11 13 15 17 .... 

2. �� �������� �� ����� �� ����'��� �������� ����������� 90 85 80 75 70 65 60 ....

3. �� �������� � ��������� �� �����, �� � ���� ����� �������� � ����� n, ������ ��� ��������.

4. �� �������� �� ����� ��������� �� 10 � ���� �����, ��������� � ���� m � n. ���������, ����� ����� 8,5 � 11,45 
��������� �� ������ 11,45.

5. �� ��������� ����� ��������� ������ � ���������� �������, � ������ �������� �� �������� �������� � ������. 
*/

public class Homework {

	public static void main(String[] args) {

//		1.  �� �������� �� ����� ����� 55 �������� ����������� 1 3 5 7 9 11 13 15 17 .... 
		int i = 1;
		int j = 0;
		while (j <= 55) {
			System.out.print(i);
			i += 2;
			j++;
			if (j <= 55) {
				System.out.print(",");
			} else {
				System.out.print(".");
			}

		}
//		2. �� �������� �� ����� �� ����'��� �������� ����������� 90 85 80 75 70 65 60 ....
		System.out.println();
		System.out.println("---------------------------------");
		int g = 90;
		while (g != -5) {
			System.out.print(g);
			g -= 5;
			if (g >= 0) {
				System.out.print(",");
			} else {
				System.out.print(".");
			}
		}

//		3. �� �������� � ��������� �� �����, �� � ���� ����� �������� � ����� n, ������ ��� ��������.
		System.out.println();
		System.out.println("---------------------------------");
		int y = 99;
		if (y % 2 == 0) {
			System.out.println("����� �����");
		} else if (y % 2 == 1) {
			System.out.println("����� �� �����");
		}

//		4. �� �������� �� ����� ��������� �� 10 � ���� �����, ��������� � ���� m � n. ���������, ����� ����� 8,5 � 11,45 
//		��������� �� ������ 11,45.
		System.out.println("----------------------------------");
		double n = 9.1;
		double m = 10.9;
		if (Math.abs(n - 10) < Math.abs(m - 10)) {
			System.out.println(n);
		} else if (Math.abs(n - 10) > Math.abs(m - 10)) {
			System.out.println(m);
		}

		else {
			System.out.println("�������� �������");
		}

		System.out.println();

//			5. �� ��������� ����� ��������� ������ � ���������� �������, � ������ �������� �� �������� �������� � ������.

		System.out.println("------------------------------------");
		int[] array = new int[10];
		for (int q = 0; q < array.length; q++) {
			Random r = new Random();
			int k = r.nextInt(100);
			array[q] = k;
			System.out.print(array[q] + " ");

		}
		Arrays.sort(array);
		System.out.println();
		System.out.println(array[0] + " <min-max> " + array[9]);
	}

}