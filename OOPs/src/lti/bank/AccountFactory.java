package lti.bank;

public final class AccountFactory {
	private AccountFactory() {
	}

	public static Bank openAccount(String holder, String type) {
		Bank acnt = null;

		if (type.equalsIgnoreCase("savings"))
			acnt = new Savings(holder);
		else
			acnt = new Current(holder);

		return acnt;
	}
}
