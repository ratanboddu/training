package lti.bank;

public class CurrentTransaction extends Transaction{
	private double overdraft;

	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance, double overdraft) {
	    super(type, amount, balance);
		this.overdraft = overdraft;
	}

	@Override
	public void print() {
		super.print();
		System.out.print("\t" + overdraft);
	}

	
}
