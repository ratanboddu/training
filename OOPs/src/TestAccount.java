import lti.bank.*;

public class TestAccount {

	public static void main(String[] args) {
		lti.bank.Bank s1 = AccountFactory.openAccount("Polo", "Current");

		try {
			//s1.withdraw(8000);
			s1.deposit(10000);
			s1.withdraw(2000);
			s1.statement1();
			
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); // End user
			//System.out.println(e);   // logging for audit purpose
			//e.printStackTrace();  // developers for trouble shooting
		}
	
	
	}

}
