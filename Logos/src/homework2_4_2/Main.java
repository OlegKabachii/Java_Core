package homework2_4_2;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Dog", 15, 2);

		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed()
				+ " ��/���, ³� ������� = " + animal.getAge() + " ����");
		System.out.println("-------------------------------------------------------------------------");

		animal.setName("Cat");
		animal.setSpeed(8);
		animal.setAge(3);

		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed()
				+ " ��/���, ³� ������� = " + animal.getAge() + " ����");
		System.out.println();

	}
}
