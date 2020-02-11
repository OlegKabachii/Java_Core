package homeWork2;

public class HomeWokr {

	public static void main(String[] args) {
		System.out.println("ax^2 + bx + c = 0");
		System.out.println();
		int a = 4;
		int b = 7;
		int c = 1;
		double D = b*b-4*a*c;
		if (D>0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2*a);
			x2 = (-b + Math.sqrt(D)) / (2*a);
			System.out.println("Корні рівняння: x1 = " + x1 + ", x2 = " + x2);
		} else if (D==0) {
			double x;
			x = -b/(2*a);
			System.out.println("Рівняння має один корінь: x = " + x);
		} else {
			System.out.println("Рівняння не має дійсних корнів!");
		}
	}

}
