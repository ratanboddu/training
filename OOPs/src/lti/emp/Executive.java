package lti.emp;

public class Executive extends Employee {
	private double bonus;

	public Executive() {
		super();
	}

	public Executive(String empName, double salary, double bonus) {
		super(empName, salary);
		this.bonus = bonus;
	}

	@Override
	public void payslip() {
		super.payslip(); // employee's payslip
		System.out.println("Bonus: " + bonus);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}

}
