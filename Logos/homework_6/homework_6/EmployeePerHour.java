package homework_6;

public class EmployeePerHour implements Salary{

	@Override
	public void salary() {
		int monthSalary = 10000;
		int workingDays = 20;
		int workingHour = 8;
		int salaryPerHiur = monthSalary/workingDays/workingHour;
		System.out.println("Your salary for " + workingDays + " days/ " + workingHour + " hours");
		
	}

}
