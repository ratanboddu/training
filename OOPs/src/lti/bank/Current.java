package lti.bank;

public class Current extends Account {

	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		overdraft = OVERDRAFT_VALUE;
	}

	@Override
	public void summary() {

		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {

		if (amount <= getBalance())
			setBalance(getBalance() - amount);

		else if (getBalance() < amount) {

			overdraft = overdraft - (amount - getBalance());
			setBalance(MIN_CUR_BAL);

		} else
			throw new BalanceException("Insufficient Funds! ");

		txns1.add(new CurrentTransaction("Debit ", amount, getBalance(), overdraft));
	}

	public double getOd() {
		return overdraft;
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if (overdraft > OVERDRAFT_VALUE) {
			setBalance(getBalance() + (overdraft - OVERDRAFT_VALUE));
			overdraft = OVERDRAFT_VALUE;
		}
		txns1.add(new CurrentTransaction("Credit ", amount, getBalance(), overdraft));
	}

}
