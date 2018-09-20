package lti.ex9.tpc;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.ex9.BankAccount;
import lti.ex9.CreditCard;
import lti.util.HibernateUtil;
public class TestBillingDetails {
	
	
	@Test
	public void testCase1()
	{
		
		SessionFactory factory=HibernateUtil.getFactory();
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		BankAccount bankAcc=new BankAccount();
		bankAcc.setHolder("polo");
		bankAcc.setNumber("12345");
		bankAcc.setBankName("ICICI Bank");
		
		CreditCard creditCard=new CreditCard();
		creditCard.setHolder("Lili");
		creditCard.setNumber("412901234567890");
		creditCard.setType("VISA");
		creditCard.setExpiry("122/2019");
		
		session.save(bankAcc);
		session.save(creditCard);
		
		tx.commit();
		
		
		
	}

	
	
}
