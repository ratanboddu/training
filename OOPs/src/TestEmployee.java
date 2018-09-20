import lti.emp.Employee;
import lti.emp.Executive;
import lti.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		/*
		 * Employee emp = new Employee("Polo", 5000); emp.payslip();
		 * System.out.println();
		 * 
		 * Executive exec = new Executive("Lily", 7000, 2000); exec.payslip();
		 * System.out.println();
		 * 
		 * Manager mgr = new Manager("Sam", 9000, 3000); mgr.payslip();
		 */
		
		Executive exec = new Executive("Lili", 7000, 2000);
		showSalary(exec);
		
		Manager mgr = new Manager("Sam", 9000, 3000);
		showSalary(mgr);
	}

	//Polymorphism
	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)//RTTI
			System.out.println("Manager Salary: "+ emp.getSalary());
		else
			System.out.println("Executive Salary: "+ emp.getSalary());
	}
	
	
	//Overloading
	/*private static void showSalary(Manager mgr) {
		System.out.println("Manager Salary: "+ mgr.getSalary());
		
	}

	private static void showSalary(Executive exec) {
		System.out.println("Executive Salary: "+ exec.getSalary());
		
	}*/

}
