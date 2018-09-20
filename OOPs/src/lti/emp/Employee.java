package lti.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private Double salary;

	private static int autogen;
	
	static {  // static initializer block - executes @ time of class-loading
	  System.out.println("Employee class loaded...");	
	  autogen = 1001;
	}
	
	public Employee() {
	}
	
	public Employee(String empName, double salary) {
		super();
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("Emp No: " + empNo);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}

}
