

public interface Bank {
	void summary();
	void statement1();
	
	
	void deposit(double amount);
	void withdraw (double amount);
	
	double getBalance();
	
	int INIT_ACNT_NO = 123001;
	double MIN_SAV_BAL = 1000;
	double INIT_CUR_BAL = 5000;
	double MIN_CUR_BAL = 0;
	double OVERDRAFT_VALUE = 10000;
}
