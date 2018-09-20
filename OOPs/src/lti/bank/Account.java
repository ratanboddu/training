package lti.bank;

import java.util.Vector;

/**
 *  Java Doc comment.generalised account class
 * @author AE103_pc10
 * @version 1.0
 *
 */
public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	private double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Vector<Transaction> txns; // declaring transaction array
	protected int idx;
	protected Vector<CurrentTransaction>txns1; // declaring transaction array
	protected int idx1;

	/** Default constructors*/
	
	public Account() {
	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		txns = new Vector<>(5); // Instantiating transaction array of 5
		// Adding opening account transaction into array
		//txns[idx ++] = new Transaction("Opening", balance, balance);
		txns.add(new Transaction("Opening",balance, balance));

		txns1 = new Vector<>(5); 
		txns1.add(new CurrentTransaction("Current", balance, balance, OVERDRAFT_VALUE));

	}

	/** The method to display summary */
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);

	}

	// BL Methods
	public void deposit(double amount) {
		balance += amount;
		//txns[idx++] = new Transaction("Credit ", amount, balance);
		txns.add(new Transaction("Credit ", amount, balance));

	}

	// Balance Interface
	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	public void statement() {
		System.out.println("Statement of A/C:" + acntNo);
		System.out.println("Type\t\tAmount\t\tBalance");
		/*for (int i = 0; i < idx; i++) {
			txns[i].print();
		}*/
		for (Transaction txn : txns) {
			txn.print();
		}
	}

	public void statement1() {
		System.out.println("Statement of A/C:" + acntNo);
		System.out.println("Type\t\tAmount\t\tBalance\t Overdraft");
	/*	for (int i = 0; i < idx1; i++) {
			txns1[i].print();
		}*/
		for (CurrentTransaction txn1 : txns1) {
			txn1.print();
		}
	}
}
