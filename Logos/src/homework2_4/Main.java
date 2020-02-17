package homework2_4;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot();
		System.out.println(r.work());
		RobotDancer rd = new RobotDancer();
		System.out.println(rd.work());
		CoffeRobot cf = new CoffeRobot();
		System.out.println(cf.work());
		RobotCoocker rc = new RobotCoocker();
		System.out.println(rc.work());

		Robot[] robots = { r, rd, cf, rc };

		for (int i = 0; i < robots.length; i++) {
			robots[i].work();
			// System.out.println();
		}

		
		
		
		
		
		
		
		
		
	}

}
